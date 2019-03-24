package com.yx.caicai.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dishes")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@EntityListeners(AuditingEntityListener.class)
public class Dishes {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String dishesId;
    @Column(length = 32)
    private String dishesName;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Material> materials;
    @Column(length = 4000)
    private String dishesDesc;

    @CreatedDate
    private Date createTime;
    @LastModifiedDate
    private Date updateTime;

    public Dishes() {
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

    public String getDishesId() {
        return dishesId;
    }

    public void setDishesId(String dishesId) {
        this.dishesId = dishesId;
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public String getDishesDesc() {
        return dishesDesc;
    }

    public void setDishesDesc(String dishesDesc) {
        this.dishesDesc = dishesDesc;
    }
}