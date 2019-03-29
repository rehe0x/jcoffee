package com.jcoffee.database.auth.app.entity;

import com.jcoffee.commons.basics.model.SuperEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * 角色
 */
@Setter
@Getter
public class AppRole extends SuperEntity {
    private static final long serialVersionUID = 4497149010220586111L;
    private String code;
    private String name;
}
