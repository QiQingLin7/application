package com.web.application.domain;

import com.web.application.util.Entity;

import java.util.Date;


public class Tickets extends Entity {
    /**
     * 门票编号
     */
    private Integer ticketid;

    /**
     * 门票编号
     */
    private String ticketname;

    /**
     * 场馆编号
     */
    private Integer stadiumid;

    /**
     * 比赛开始时间
     */
    private Date begintime;

    /**
     * 总票数
     */
    private Integer totalcount;

    /**
     * 已销售的门票数
     */
    private Integer ordercount;

    /**
     * 门票价格
     */
    private Double price;

    /**
     * 门票说明
     */
    private String descn;


    public Integer getTicketid() {
        return ticketid;
    }

    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
    }

    public String getTicketname() {
        return ticketname;
    }

    public void setTicketname(String ticketname) {
        this.ticketname = ticketname;
    }

    public Integer getStadiumid() {
        return stadiumid;
    }

    public void setStadiumid(Integer stadiumid) {
        this.stadiumid = stadiumid;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    public Integer getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(Integer ordercount) {
        this.ordercount = ordercount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescn() {
        return descn;
    }

    public void setDescn(String descn) {
        this.descn = descn;
    }
}