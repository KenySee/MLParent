package com.zallhy.hyapp.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class SingleView<T> extends ResponseView {
    @JsonProperty("Record")
    private T record;

    public SingleView() {

    }

    public SingleView(T record) {
        this.record = record;
    }

    public T getRecord() {
        return record;
    }

    public void setRecord(T record) {
        this.record = record;
    }
}
