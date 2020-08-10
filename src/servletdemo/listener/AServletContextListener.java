package servletdemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/9
 */
public class AServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
         System.out.println("ServletContext create after execute task");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext destroy before execute task");
    }
}
