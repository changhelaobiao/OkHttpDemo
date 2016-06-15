package com.lpx.okttpdemo.model;

/**
 * Created by liaopeixin on 2016/6/15.
 */
public class Feed {
    
    private String id;
    private String oid;
    private String category;
    private Data data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "id='" + id + '\'' +
                ", oid='" + oid + '\'' +
                ", category='" + category + '\'' +
                ", data=" + data +
                '}';
    }
}
