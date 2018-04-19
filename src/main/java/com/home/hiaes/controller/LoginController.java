
package com.home.hiaes.controller;

import com.home.hiaes.common.Constants;
import com.home.hiaes.service.IUserService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * <code>LoginController</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2017/12/14 18:33
 */
@Controller
@Log4j
public class LoginController {

    private IUserService userService;

    @Autowired
    public LoginController(IUserService userService){
        this.userService = userService;
    }

    @RequestMapping("login")
    public ModelAndView login(HttpServletRequest request){
        try {
            String username = request.getParameter("username");
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("home/home");
            modelAndView.addObject("username",username);
            return modelAndView;
        }catch (Exception e){
            log.error("login接口异常",e);
            return null;
        }
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession(true);
        session.removeAttribute(Constants.OPERATOR_SESSION_KEY);
        return "home/login";
    }
}
