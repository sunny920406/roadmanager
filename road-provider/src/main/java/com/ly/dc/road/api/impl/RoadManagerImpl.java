/**
 * @author Administrator
 * @Description RoadManagerImpl
 * @Date 2017/10/22 0022 14:09
 */
package com.ly.dc.road.api.impl;

import com.ly.dc.road.api.RoadManager;
import com.ly.dc.road.vo.HeighWayVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("roadManagerImpl")
public class RoadManagerImpl implements RoadManager {
    @Override
    public List<HeighWayVo> GetHeighWays() {
        List<HeighWayVo> heighWayVos=new ArrayList<HeighWayVo>();
        HeighWayVo JinHu=new HeighWayVo(2,"京沪高速","G2");
        HeighWayVo JinHa=new HeighWayVo(1,"京哈高速","G1");
        heighWayVos.add(JinHa);
        heighWayVos.add(JinHu);
        return heighWayVos;
    }
}
