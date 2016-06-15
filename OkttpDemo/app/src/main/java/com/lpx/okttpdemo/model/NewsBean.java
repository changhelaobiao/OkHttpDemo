package com.lpx.okttpdemo.model;

/**
 * Created by liaopeixin on 2016/6/15.
 */
public class NewsBean {

    private String status;
    private Paramz paramz;
    private int PageIndex;
    private int PageSize;
    private int TotalCount;
    private int TotalPage;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Paramz getParamz() {
        return paramz;
    }

    public void setParamz(Paramz paramz) {
        this.paramz = paramz;
    }

    public int getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(int pageIndex) {
        PageIndex = pageIndex;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public int getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(int totalCount) {
        TotalCount = totalCount;
    }

    public int getTotalPage() {
        return TotalPage;
    }

    public void setTotalPage(int totalPage) {
        TotalPage = totalPage;
    }

    @Override
    public String toString() {
        return "NewsBean{" +
                "status='" + status + '\'' +
                ", paramz=" + paramz +
                ", PageIndex=" + PageIndex +
                ", PageSize=" + PageSize +
                ", TotalCount=" + TotalCount +
                ", TotalPage=" + TotalPage +
                '}';
    }

}
