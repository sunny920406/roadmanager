/**
 * @author Administrator
 * @Description DubboxServeltInitializer
 * @Date 2017/10/23 0023 21:53
 */
package com.ly.dc.road.api.config;

import com.alibaba.dubbo.remoting.http.servlet.DispatcherServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.Registration.Dynamic;
import javax.servlet.ServletRegistration;

public class DubboxServeltInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.printf("添加自定义listener-start");
        ServletRegistration.Dynamic myServelt=servletContext.addServlet("dispatcher",DispatcherServlet.class);
        myServelt.addMapping("/*");
        servletContext.addListener(com.alibaba.dubbo.remoting.http.servlet.BootstrapListener.class);
        System.out.printf("添加自定义listener-end");
    }
}
