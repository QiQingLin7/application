package com.web.application.mapper;

import com.web.application.domain.TStadia;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TStadiaMapper {

    int deleteByPrimaryKey(Integer stadiumid);

    int insert(TStadia record);


    int insertSelective(TStadia record);


    TStadia selectByPrimaryKey(Integer stadiumid);


    int updateByPrimaryKeySelective(TStadia record);


    int updateByPrimaryKey(TStadia record);
}