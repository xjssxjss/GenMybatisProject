package com.sean.mapper;

import com.sean.model.ActDetail;

public interface ActDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActDetail record);

    int insertSelective(ActDetail record);

    ActDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActDetail record);

    int updateByPrimaryKey(ActDetail record);
}