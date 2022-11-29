package com.yang.module.main.controller;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.yang.module.common.constant.SystemConstant;
import com.yang.module.common.util.CodeEnum;
import com.yang.module.common.util.MResultUtil;
import com.yang.module.common.util.PageData;
import com.yang.module.main.dao.pojo.SearchHistory;
import com.yang.module.main.dao.pojo.WallDetail;
import com.yang.module.main.dao.pojo.WallTab;
import com.yang.module.main.service.WallpaperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/api/wallpaper")
public class WallpaperController {


    @Resource
    private WallpaperService wallpaperService;


    @ResponseBody
    @GetMapping("/queryTabs")
    public String queryTabs(@RequestParam(value = "wallType") int wallType){

        List<WallTab> wallTabs = wallpaperService.queryTabs(wallType);

        return MResultUtil.resultSuccess(CodeEnum.REQUEST_SUCCESS,wallTabs);
    }

    @ResponseBody
    @GetMapping("/insertTabs")
    public String insertTabs(){
//    @ResponseBody
//    @PostMapping("/insertTabs")
//    public String insertTabs(@RequestBody List<WallTab> wallTabs){

        List<WallTab> wallTabs = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            WallTab wallTab = new WallTab();
            wallTab.setId(UUID.randomUUID().toString().replace("-",""));
            wallTab.setWallType(0);
            wallTab.setName("标签"+i);
            wallTab.setCreateTime(new Date());
            wallTab.setUpdateTime(new Date());
            wallTabs.add(wallTab);
        }

        wallpaperService.insertTabs(wallTabs);

        return MResultUtil.resultSuccess(CodeEnum.REQUEST_SUCCESS);
    }


    @ResponseBody
    @PostMapping("/queryWallpaper")
    public String queryWallpaper(@RequestBody WallDetail data){

        if (!StringUtils.isEmpty(data.getKeyword())){
            try {
                SearchHistory searchHistory = wallpaperService.querySearchFindByText(data.getKeyword());
                if (null == searchHistory){
                    searchHistory = new SearchHistory();
                    searchHistory.setId("Search_"+UUID.randomUUID().toString().replace("-",""));
                    searchHistory.setText(data.getKeyword());
                    Date date = new Date();
                    searchHistory.setCreateTime(date);
                    searchHistory.setUpdateTime(date);
                    searchHistory.setNum(1);
                    wallpaperService.insertSearchFind(searchHistory);
                }else {
                    int num = searchHistory.getNum()+1;
                    searchHistory.setNum(num);
                    wallpaperService.updateSearchFind(searchHistory);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        PageHelper.startPage(data.getPageNum(),data.getPageSize());

        List<WallDetail> wallDetails = wallpaperService.queryWallpaper(data);

        PageData<WallDetail> pageData = new PageData<>(wallDetails);

        return MResultUtil.resultSuccess(CodeEnum.REQUEST_SUCCESS,pageData);
    }

    @ResponseBody
    @GetMapping("/insertWallpaper")
    public String insertWallpaper(){
//    @ResponseBody
//    @PostMapping("/insertWallpaper")
//    public String insertWallpaper(@RequestBody List<WallDetail> wallDetails){



        List<WallDetail> wallDetails = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            WallDetail wallTab = new WallDetail();
            wallTab.setId(UUID.randomUUID().toString().replace("-",""));
            wallTab.setUserId("MieMie1669535505256d36516d0937f44bda26d7ab44e6e9ad7");
            wallTab.setTabId("00525d51d2b446289d2dbd75adc96421");
            wallTab.setWallType(0);
            wallTab.setWallUrl("/image/"+i+".jpg");
            wallTab.setWallName("名字标题"+i);
            wallTab.setCreateTime(new Date());
            wallTab.setUpdateTime(new Date());
            wallDetails.add(wallTab);
        }

        wallpaperService.insertWallpaper(wallDetails);

        return MResultUtil.resultSuccess(CodeEnum.REQUEST_SUCCESS);

    }


    @ResponseBody
    @PostMapping("/querySearchFind")
    public String querySearchFind(@RequestBody JSONObject jsonObject){

        int pageNum = jsonObject.getInteger(SystemConstant.PAGE_NUM);
        int pageSize = jsonObject.getInteger(SystemConstant.PAGE_SIZE);
        PageHelper.startPage(pageNum,pageSize);
        List<SearchHistory> searchHistories = wallpaperService.querySearchFind();
        PageData<SearchHistory> pageData = new PageData<>(searchHistories);
        return MResultUtil.resultSuccess(CodeEnum.REQUEST_SUCCESS,pageData);

    }
}
