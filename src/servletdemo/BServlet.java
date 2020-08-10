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
public class BServlet extends HttpServlet {

    @Override
    public void init() {
         System.out.println("init.....");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("doGet...");
        ServletContext servletContext = super.getServletContext();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
         System.out.println("doPost...");
    }
}
