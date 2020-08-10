import javax.servlet.*;
import java.util.Map;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/10
 */
public class VisitCountFilter implements Filter {

    private FilterConfig config;

    @Override
    public void init(FilterConfig filterConfig) {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
        ServletContext servletContext = config.getServletContext();
        Map<String, Integer> map = (Map<String, Integer>) servletContext.getAttribute("map");
        String remoteAddr = request.getRemoteHost();
        if(map.containsKey(remoteAddr)) {
            Integer count = map.get(remoteAddr);
            ++count;
            map.put(remoteAddr, count);
        }else {
            map.put(remoteAddr, 1);
        }
    }

    @Override
    public void destroy() {}

}
