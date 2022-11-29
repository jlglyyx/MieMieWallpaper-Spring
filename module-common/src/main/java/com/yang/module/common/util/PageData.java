package com.yang.module.common.util;

import com.github.pagehelper.Page;

import java.util.Collection;
import java.util.List;

public class PageData<T> {
    private int pageNum;
    private int pageSize;
    private int size;
    private int total;
    private List<T> list;

    public PageData(List<T> list) {
        this(list, 8);
    }

    public PageData(List<T> list, int navigatePages) {
        if (list instanceof Page) {
            Page page = (Page)list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.list = page;
            this.size = page.size();
            this.total = (int) page.getTotal();
        } else if (list instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = list.size();
            this.list = list;
            this.size = list.size();
            this.total = list.size();
        }


    }


    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public long getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public List<T> getList() {
        return this.list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }


    public String toString() {
        StringBuffer sb = new StringBuffer("PageData{");
        sb.append("pageNum=").append(this.pageNum);
        sb.append(", pageSize=").append(this.pageSize);
        sb.append(", size=").append(this.size);
        sb.append(", total=").append(this.total);
        sb.append(", list=").append(this.list);
        sb.append('}');
        return sb.toString();
    }
}
