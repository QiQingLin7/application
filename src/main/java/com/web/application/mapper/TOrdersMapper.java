package com.web.application.mapper;

import com.web.application.domain.TOrders;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TOrdersMapper {

    int deleteByPrimaryKey(Integer ordersid);


    int insert(TOrders record);


    int insertSelective(TOrders record);


    TOrders selectByPrimaryKey(Integer ordersid);


    int updateByPrimaryKeySelective(TOrders record);


    int updateByPrimaryKey(TOrders record);
}