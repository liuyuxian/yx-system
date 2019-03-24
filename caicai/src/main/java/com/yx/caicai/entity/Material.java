package com.yx.caicai.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "material")
@EntityListeners(AuditingEntityListener.class)
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Material {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String materialId;
    @Column(length = 30)
    private String materialName;

    public Material() {
    }

    public Material(String materialId, String materialName) {
        this.materialId = materialId;
        this.materialName = materialName;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
}
