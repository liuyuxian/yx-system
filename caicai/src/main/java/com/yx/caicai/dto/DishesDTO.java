package com.yx.caicai.dto;

import java.util.List;

public class DishesDTO {
    private String dishesId;
    private String dishesName;
    private String dishesDesc;
    private List<MaterialDTO> materialDTOs;

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }

    public String getDishesDesc() {
        return dishesDesc;
    }

    public void setDishesDesc(String dishesDesc) {
        this.dishesDesc = dishesDesc;
    }

    public List<MaterialDTO> getMaterialDTOs() {
        return materialDTOs;
    }

    public String getDishesId() {
        return dishesId;
    }

    public void setDishesId(String dishesId) {
        this.dishesId = dishesId;
    }

    public void setMaterialDTOs(List<MaterialDTO> materialDTOs) {
        this.materialDTOs = materialDTOs;
    }
}
