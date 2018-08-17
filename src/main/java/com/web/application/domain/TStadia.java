package com.web.application.domain;

import com.web.application.util.Entity;


public class TStadia extends Entity {
    /**
     * 场馆编号
     */
    private Integer stadiumid;

    /**
     * 场馆名称
     */
    private String name;

    /**
     * 场馆地址
     */
    private String address;

    /**
     * 场馆说明
     */
    private String descn;

    public Integer getStadiumid() {
        return stadiumid;
    }


    public void setStadiumid(Integer stadiumid) {
        this.stadiumid = stadiumid;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getDescn() {
        return descn;
    }


    public void setDescn(String descn) {
        this.descn = descn;
    }
}