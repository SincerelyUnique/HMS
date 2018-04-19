
package com.home.hiaes.interceptor;

import com.home.hiaes.common.Constants;
import com.home.hiaes.domain.po.User;
import com.home.hiaes.service.IUserService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * <p>
 * <code>LoginInterceptor</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2017/12/14 15:18
 */
@Log4j
public class LoginInterceptor implements HandlerInterceptor {

    private IUserService userService;

    @Autowired
    public LoginInterceptor(IUserService userService){
        this.userService = userService;
    }

    /**
     * 无访问权限
     */
    private static final String NO_AUTHORITY_ACTION = "/login.jsp";

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        try {
            HttpSession session = request.getSession(true);
            User userFromSession = (User)session.getAttribute(Constants.OPERATOR_SESSION_KEY);

            if ( null==userFromSession ){
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                User userFromDB = userService.checkLoginUser(username,password);
                if ( null==userFromDB ){
                    log.error("用户不存在");
                    response.sendRedirect(request.getContextPath()+NO_AUTHORITY_ACTION);
                    return false;
                }else {
                    this.setAuthorityInfo(userFromDB, session);
                }
            }else {
                Long id = userFromSession.getId();
                String token = userFromSession.getToken();
                Boolean hasSameToken = userService.checkToken(id,token);
                if ( !hasSameToken ){
                    log.error("token不一致或不存在");
                    response.sendRedirect(request.getContextPath()+NO_AUTHORITY_ACTION);
                    return false;
                }
            }
        } catch (Exception e) {
            log.error("拦截器异常",e);
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object obj,
                           ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object obj,
                                Exception e) throws Exception {
        //httpServletResponse.addHeader("x-frame-options", "SAMEORIGIN");
    }

    private void setAuthorityInfo(User user, HttpSession session) {
        if (null == session.getAttribute(Constants.OPERATOR_SESSION_KEY)) {
            UUID uuid = UUID.randomUUID();
            String newToken = uuid.toString();
            user.setToken(newToken);
            userService.updateToken(user.getId(),newToken);
            session.setAttribute(Constants.OPERATOR_SESSION_KEY, user);
        }
    }
}
