/**
 * @author Administrator
 * @Description RoadManagerService
 * @Date 2017/10/22 0022 15:10
 */
package com.ly.dc.road.customer;

import com.ly.dc.road.api.RoadManager;
import com.ly.dc.road.entity.HeighWay;
import com.ly.dc.road.vo.HeighWayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoadManagerService {

    @Autowired
    private RoadManager roadManager;

    public List<HeighWayVo> getHeighWayVoList(){
        return roadManager.GetHeighWays();
    }

}
