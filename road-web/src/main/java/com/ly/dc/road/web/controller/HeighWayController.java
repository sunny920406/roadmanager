/**
 * @author Administrator
 * @Description HeighWayController
 * @Date 2017/10/22 0022 15:16
 */
package com.ly.dc.road.web.controller;

import com.ly.dc.road.customer.RoadManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HeighWayController {

    @Autowired
    private RoadManagerService roadManagerService;

    @RequestMapping("/heighway")
    public Object getHeighWays(){
        return roadManagerService.getHeighWayVoList();
    }

}
