/**
 * @author Administrator
 * @Description HeighWay
 * @Date 2017/10/22 0022 13:26
 */
package com.ly.dc.road.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class HeighWay {
    private int id;
    private String name;
    private String code;
    private City from;
    private City to;
}
