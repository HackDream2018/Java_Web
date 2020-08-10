package servletdemo.listener.javabean;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2020/8/9
 */
public class Animal implements HttpSessionActivationListener, Serializable {

    /**
     * 同session一起钝化到磁盘
     */
    @Override
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
         System.out.println("sessionWillPassivate .. ");
    }

    /**
     * 同session一起活化到内存
     */
    @Override
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        System.out.println("sessionDidActivate .. ");
    }
}
