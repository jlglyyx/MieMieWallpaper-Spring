package com.yang.module.main.service.impl;

import com.yang.module.main.dao.mapper.SearchHistoryMapper;
import com.yang.module.main.dao.mapper.WallDetailMapper;
import com.yang.module.main.dao.mapper.WallTabMapper;
import com.yang.module.main.dao.pojo.SearchHistory;
import com.yang.module.main.dao.pojo.WallDetail;
import com.yang.module.main.dao.pojo.WallTab;
import com.yang.module.main.service.WallpaperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WallpaperServiceImpl implements WallpaperService {

    @Resource
    WallTabMapper wallTabMapper;
    @Resource
    WallDetailMapper wallDetailMapper;

    @Resource
    SearchHistoryMapper searchHistoryMapper;


    @Override
    public List<WallTab> queryTabs(int wallType) {

        return wallTabMapper.queryTabsByType(wallType);
    }

    @Override
    public void insertTabs(List<WallTab> wallTabs) {
        for (WallTab wallTab:wallTabs) {
            wallTabMapper.insert(wallTab);
        }
    }

    @Override
    public List<WallDetail> queryWallpaper(WallDetail data) {

        return wallDetailMapper.queryWallpaper(data.getWallType(),data.getUserId(),data.getTabId(),data.getKeyword(),data.getOrder());
    }

    @Override
    public void insertWallpaper(List<WallDetail> wallDetails) {
        for (WallDetail wallDetail:wallDetails) {
            wallDetailMapper.insert(wallDetail);
        }
    }

    @Override
    public List<SearchHistory> querySearchFind() {
        return searchHistoryMapper.querySearchFind();
    }

    @Override
    public SearchHistory querySearchFindByText(String text) {
        return searchHistoryMapper.querySearchFindByText(text);
    }

    @Override
    public void updateSearchFind(SearchHistory history) {
        searchHistoryMapper.updateByPrimaryKeySelective(history);
    }

    @Override
    public void insertSearchFind(SearchHistory history) {
        searchHistoryMapper.insert(history);
    }
}
