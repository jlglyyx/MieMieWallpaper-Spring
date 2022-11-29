package com.yang.module.main.dao.mapper;

import com.yang.module.main.dao.pojo.WallTab;
import com.yang.module.main.dao.pojo.WallTabExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WallTabMapper {
    int countByExample(WallTabExample example);

    int deleteByExample(WallTabExample example);

    int deleteByPrimaryKey(String id);

    int insert(WallTab record);

    int insertSelective(WallTab record);

    List<WallTab> selectByExample(WallTabExample example);


    List<WallTab> queryTabsByType(int wallType);


    WallTab selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WallTab record, @Param("example") WallTabExample example);

    int updateByExample(@Param("record") WallTab record, @Param("example") WallTabExample example);

    int updateByPrimaryKeySelective(WallTab record);

    int updateByPrimaryKey(WallTab record);
}