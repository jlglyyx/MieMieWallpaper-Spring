package com.yang.module.main.dao.mapper;

import com.yang.module.main.dao.pojo.SearchHistory;
import com.yang.module.main.dao.pojo.SearchHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SearchHistoryMapper {
    int countByExample(SearchHistoryExample example);

    int deleteByExample(SearchHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(SearchHistory record);

    int insertSelective(SearchHistory record);

    List<SearchHistory> selectByExample(SearchHistoryExample example);

    List<SearchHistory> querySearchFind();

    SearchHistory querySearchFindByText(String text);


    SearchHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SearchHistory record, @Param("example") SearchHistoryExample example);

    int updateByExample(@Param("record") SearchHistory record, @Param("example") SearchHistoryExample example);

    int updateByPrimaryKeySelective(SearchHistory record);

    int updateByPrimaryKey(SearchHistory record);
}