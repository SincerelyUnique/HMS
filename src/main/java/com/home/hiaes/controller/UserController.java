
package com.home.hiaes.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.home.hiaes.common.BaseController;
import com.home.hiaes.dao.UserMapper;
import com.home.hiaes.domain.po.User;
import com.home.hiaes.domain.vo.EmailVo;
import com.home.hiaes.domain.vo.PageParam;
import com.home.hiaes.domain.vo.ResponseVo;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * <code>UserController</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2017/12/14 13:32
 */
@Controller
@RequestMapping("user")
@Log4j
public class UserController extends BaseController{

    private UserMapper userMapper;

    private JavaMailSender mailSender;

    @Autowired
    public UserController(UserMapper userMapper,
                          JavaMailSender mailSender){
        this.userMapper = userMapper;
        this.mailSender = mailSender;
    }

    @GetMapping("index")
    public String index(){
        return "user/user";
    }

    @GetMapping("add")
    public String addUI(){
        return "user/add";
    }

    @PostMapping("saveAdd")
    @ResponseBody
    public ResponseVo<String> saveAdd( HttpServletRequest request,@RequestBody User user ){
        try {
            user.setCreateTime( new Date() );
            user.setCreateUser( getUserInfo(request).getUsername() );
            userMapper.insertSelective(user);
            return new ResponseVo<String>(true,"10000","添加用户成功",null);
        }catch (Exception e){
            log.error("user/saveAdd接口失败",e);
            return new ResponseVo<String>(false,"10001","添加用户失败",null);
        }
    }

    @GetMapping("delete")
    public ResponseVo<Integer> delete( Long id ){
        try {
            Integer result = userMapper.deleteByPrimaryKey( id );
            return new ResponseVo<Integer>(true,"10000","删除成功",result);
        }catch (Exception e){
            log.error("user/delete接口异常",e);
            return new ResponseVo<Integer>(false,"10001","删除失败",-1);
        }
    }

    @GetMapping("edit")
    public ModelAndView edit( Long id ) {
        try {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("user/edit");
            User user = userMapper.selectByPrimaryKey( id );
            modelAndView.addObject("userInfo",user);
            return modelAndView;
        }catch (Exception e){
            log.error("user/edit接口异常",e);
            return null;
        }
    }

    @PostMapping("saveEdit")
    @ResponseBody
    public ResponseVo<Integer> saveEdit( HttpServletRequest request,@RequestBody User user ){
        try {
            user.setUpdateTime(new Date());
            user.setUpdateUser( getUserInfo(request).getUsername() );
            Integer result = userMapper.updateByPrimaryKey( user );
            return new ResponseVo<Integer>(true,"10000","更新用户信息成功",result);
        }catch (Exception e){
            log.error("user/saveEdit接口异常",e);
            return new ResponseVo<Integer>(false,"10001","更新用户信息失败",-1);
        }
    }

    /**
     * 显示并分页
     * @param pageParam 分页参数
     * @return 分页显示的数据
     */
    @PostMapping("/list")
    @ResponseBody
    public PageInfo<User> list(PageParam pageParam) {
        PageHelper.startPage(pageParam.getPageNum(),pageParam.getNumPerPage());
        List<User> userList = userMapper.selectAllAndPageable(pageParam.getPageNum(),pageParam.getNumPerPage());
        return new PageInfo<User>(userList);
    }

    @GetMapping("mail")
    public ModelAndView mail( Long id ){
        try {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("user/mail");
            User user = userMapper.selectByPrimaryKey( id );
            modelAndView.addObject("userInfo",user);
            return modelAndView;
        }catch (Exception e){
            log.error("user/mail接口异常",e);
            return null;
        }
    }

    @PostMapping("sendEmail")
    @ResponseBody
    public ResponseVo<String> sendEmail( @RequestBody EmailVo emailVo ){
        try {
            // 创建邮件
            SimpleMailMessage email = new SimpleMailMessage();
            email.setFrom(emailVo.getSenderAddress());
            email.setTo(emailVo.getRecipientAddress());
            email.setSubject(emailVo.getSubject());
            email.setText(emailVo.getMessage());

            // 发送邮件
            mailSender.send(email);

            return new ResponseVo<String>(true,"10000","发送成功",null);
        }catch (Exception e){
            log.error("user/sendEmail接口异常",e);
            return new ResponseVo<String>(true,"10001","邮件发送失败，请联系系统管理员",null);
        }
    }
}
