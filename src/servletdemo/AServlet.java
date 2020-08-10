package servletdemo;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/8
 */
public class AServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println("first visit service Servlet have init ...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)  {
        ServletContext context = super.getServletContext();
        System.out.println("execute Service...");
    }

    @Override
    public void destroy() {
        System.out.println("close service servlet have destroy...");
    }
}
