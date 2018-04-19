
package com.home.hiaes.common;

import com.home.hiaes.domain.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * <code>CommonController</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2017/12/14 18:40
 */
@Controller
public class BaseController {

    protected User getUserInfo( HttpServletRequest request ){
        HttpSession session = request.getSession(true);
        return (User)session.getAttribute(Constants.OPERATOR_SESSION_KEY);
    }
}
