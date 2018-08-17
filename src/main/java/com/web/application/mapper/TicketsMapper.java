package com.web.application.mapper;

import com.web.application.domain.Tickets;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TicketsMapper {

    int deleteByPrimaryKey(Integer ticketid);


    int insert(Tickets record);


    int insertSelective(Tickets record);


    Tickets selectByPrimaryKey(Integer ticketid);


    int updateByPrimaryKeySelective(Tickets record);


    int updateByPrimaryKey(Tickets record);
}