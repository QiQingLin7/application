package com.web.application.domain;

import com.web.application.util.Entity;

public class TOrders extends Entity {
    /**
     * 销售编号
     */
    private Integer ordersid;

    private Integer ticketid;

    /**
     * 身份证号
     */
    private String idcard;


    public Integer getOrdersid() {
        return ordersid;
    }


    public void setOrdersid(Integer ordersid) {
        this.ordersid = ordersid;
    }


    public Integer getTicketid() {
        return ticketid;
    }


    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
    }


    public String getIdcard() {
        return idcard;
    }


    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}