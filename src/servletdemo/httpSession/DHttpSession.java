package servletdemo.httpSession;

import servletdemo.listener.javabean.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/9
 */
public class DHttpSession extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
        // 创建session
        HttpSession session = req.getSession();
        session.setAttribute("user", new User());
        session.removeAttribute("user");
        // 销毁session
        session.invalidate();
    }
}
