package com.yang.module.main.dao.pojo;

import java.util.Date;

public class WallDetail {
    private String id;

    private String tabId;

    private String userId;

    private String wallUrl;

    private String wallName;

    private Integer wallType;

    private Integer wallDownNum;

    private Boolean isVip;

    private Integer likeNum;

    private Date createTime;

    private Date updateTime;

    private String extra;

    private int pageNum;
    private int pageSize;
    private String keyword;
    private int order;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTabId() {
        return tabId;
    }

    public void setTabId(String tabId) {
        this.tabId = tabId == null ? null : tabId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getWallUrl() {
        return wallUrl;
    }

    public void setWallUrl(String wallUrl) {
        this.wallUrl = wallUrl == null ? null : wallUrl.trim();
    }

    public String getWallName() {
        return wallName;
    }

    public void setWallName(String wallName) {
        this.wallName = wallName == null ? null : wallName.trim();
    }

    public Integer getWallType() {
        return wallType;
    }

    public void setWallType(Integer wallType) {
        this.wallType = wallType;
    }

    public Integer getWallDownNum() {
        return wallDownNum;
    }

    public void setWallDownNum(Integer wallDownNum) {
        this.wallDownNum = wallDownNum;
    }

    public Boolean getIsVip() {
        return isVip;
    }

    public void setIsVip(Boolean isVip) {
        this.isVip = isVip;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}