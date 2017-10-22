/**
 * @author Administrator
 * @Description HeighWayVo
 * @Date 2017/10/22 0022 13:47
 */
package com.ly.dc.road.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class HeighWayVo implements Serializable {

    private int id;
    private String name;
    private String code;


}
