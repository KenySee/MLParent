package com.zallhy.hyapp.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PageView<T> extends ResponseView {

    @JsonProperty("Records")
    private List<T> records;

    @JsonProperty("TotalRecordCount")
    private int totalRecordCount;

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public int getTotalRecordCount() {
        return totalRecordCount;
    }

    public void setTotalRecordCount(int totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

}
