package com.sean.model;

import java.io.Serializable;
import java.util.Date;

public class ActDetail implements Serializable {
    private Integer id;

    private String name;

    private Date createTime;

    private Integer bigImage;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getBigImage() {
        return bigImage;
    }

    public void setBigImage(Integer bigImage) {
        this.bigImage = bigImage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", bigImage=").append(bigImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}