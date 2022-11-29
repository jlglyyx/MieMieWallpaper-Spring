package com.yang.module.main.service;

import com.yang.module.main.dao.pojo.SearchHistory;
import com.yang.module.main.dao.pojo.WallDetail;
import com.yang.module.main.dao.pojo.WallTab;

import java.util.List;

public interface WallpaperService {


    List<WallTab> queryTabs(int wallType);

    void insertTabs(List<WallTab> wallTabs);


    List<WallDetail> queryWallpaper(WallDetail data);

    void insertWallpaper(List<WallDetail> wallDetails);


    List<SearchHistory> querySearchFind();

    SearchHistory querySearchFindByText(String text);

    void updateSearchFind(SearchHistory history);

    void insertSearchFind(SearchHistory history);
}
