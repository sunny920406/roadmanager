/**
 * @author Administrator
 * @Description HomeController
 * @Date 2017/10/21 0021 18:15
 */
package com.ly.dc.road.web.controller;

import com.ly.dc.road.customer.RoadManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "home")
    public String home(){
        return "home";
    }



}
