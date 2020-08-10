import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/10
 */
public class VisitCountListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        servletContext.setAttribute("map", new HashMap<>());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {}
}
