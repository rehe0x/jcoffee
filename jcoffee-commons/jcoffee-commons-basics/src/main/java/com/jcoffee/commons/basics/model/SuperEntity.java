package com.jcoffee.commons.basics.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 实体父类
 */
@Setter
@Getter
public class SuperEntity {
    /**
     * 主键ID
     */
    private Long id;
    private Date createTime;
    private Date updateTime;


}
