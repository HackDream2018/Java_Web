package servletdemo.listener.javabean;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/9
 */
public class User implements HttpSessionBindingListener {
    /**
     * 监听器绑定在JavaBean后
     */
    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
         System.out.println("session bound User ...");
    }

    /**
     * 监听器解绑JavaBean前
     */
    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("session unbound User ...");
    }
}
