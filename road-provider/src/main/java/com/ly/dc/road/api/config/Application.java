/**
 * @author Administrator
 * @Description Application
 * @Date 2017/10/22 0022 14:49
 */
package com.ly.dc.road.api.config;

import com.alibaba.dubbo.remoting.http.servlet.BootstrapListener;
import com.alibaba.dubbo.remoting.http.servlet.DispatcherServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ly.dc.road.api")
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // TODO Auto-generated method stub
        return builder.sources(Application.class);
    }

//    @Bean
//    public ServletListenerRegistrationBean bootstrapListener(){
//        ServletListenerRegistrationBean registrationBean = new ServletListenerRegistrationBean<>();
//        registrationBean.setListener(new BootstrapListener());
//        registrationBean.setOrder(1);
//        return registrationBean;
//    }
//
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(new DispatcherServlet(), "/*");
//    }

}
