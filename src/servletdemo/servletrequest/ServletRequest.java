package servletdemo.servletrequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/9
 */
public class ServletRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get request");
        req.setAttribute("age", "10");
        req.setAttribute("age2", "10");
        req.removeAttribute("age2");
    }

}
