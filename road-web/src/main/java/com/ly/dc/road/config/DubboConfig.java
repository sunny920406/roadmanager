/**
 * @author Administrator
 * @Description DubboConfig
 * @Date 2017/10/22 0022 14:59
 */
package com.ly.dc.road.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dubbo/dubbo.properties")
@ImportResource({ "classpath:dubbo/*.xml" })
public class DubboConfig {
}
