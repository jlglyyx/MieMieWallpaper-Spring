package com.yang.module.main.dao.mapper;

import com.yang.module.main.dao.pojo.WallDetail;
import com.yang.module.main.dao.pojo.WallDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WallDetailMapper {
    int countByExample(WallDetailExample example);

    int deleteByExample(WallDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(WallDetail record);

    int insertSelective(WallDetail record);

    List<WallDetail> selectByExample(WallDetailExample example);

    List<WallDetail> queryWallpaper(@Param("wallType") int wallType,@Param("userId") String userId,@Param("tabId") String tabId,@Param("keyword") String keyword,@Param("order") int order);

    WallDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WallDetail record, @Param("example") WallDetailExample example);

    int updateByExample(@Param("record") WallDetail record, @Param("example") WallDetailExample example);

    int updateByPrimaryKeySelective(WallDetail record);

    int updateByPrimaryKey(WallDetail record);
}