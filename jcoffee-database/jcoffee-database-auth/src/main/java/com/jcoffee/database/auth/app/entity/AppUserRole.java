package com.jcoffee.database.auth.app.entity;

import java.io.Serializable;

/**
 *
 */
public class AppUserRole implements Serializable{
    private String id;
    private String uid;
    private String rid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }
}
