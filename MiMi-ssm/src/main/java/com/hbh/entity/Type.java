package com.hbh.entity;

public class Type {
    private Integer protypeid;

    private String typename;

    public Integer getProtypeid() {
        return protypeid;
    }

    public void setProtypeid(Integer protypeid) {
        this.protypeid = protypeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}