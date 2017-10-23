/**
 * @author Administrator
 * @Description RoadManager
 * @Date 2017/10/22 0022 13:45
 */
package com.ly.dc.road.api;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ly.dc.road.vo.HeighWayVo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

@Path("/api")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface RoadManager {
    @GET
    @Path("/heighway")
    @Deprecated
    List<HeighWayVo> GetHeighWays();
}
