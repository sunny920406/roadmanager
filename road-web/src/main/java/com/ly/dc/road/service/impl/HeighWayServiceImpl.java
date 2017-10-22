/**
 * @author Administrator
 * @Description HeighWayServiceImpl
 * @Date 2017/10/22 0022 13:19
 */
package com.ly.dc.road.service.impl;

import com.ly.dc.road.entity.City;
import com.ly.dc.road.entity.HeighWay;
import com.ly.dc.road.service.HeighWayService;
import org.springframework.stereotype.Service;

@Service
public class HeighWayServiceImpl implements HeighWayService {
    @Override
    public HeighWay GetHeighWayById(int id) {
        City ShangHai=new City("310000","上海市");
        City BeiJin=new City("110000","北京市");
        return new HeighWay(1,"京沪高速","G2",BeiJin,ShangHai);
    }
}
