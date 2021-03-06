package com.yx.caicai.mapper;

import com.yx.caicai.dto.DishesDTO;
import com.yx.caicai.entity.Dishes;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class DishesMapper {

    private static DishesMapper dishesMapper = new DishesMapper();

    public static DishesMapper getInstance(){
        return dishesMapper;
    }

    public DishesDTO toDTO(Dishes dishes) {
        DishesDTO dishesDTO = new DishesDTO();
        BeanUtils.copyProperties(dishes, dishesDTO);
        return dishesDTO;
    }

    public List<DishesDTO> toDTO(List<Dishes> dishesList) {
        List<DishesDTO> dishesDTOList = new ArrayList<>();
        for (Dishes dishes : dishesList) {
            dishesDTOList.add(toDTO(dishes));
        }
        return dishesDTOList;
    }

    public Dishes toEntity(DishesDTO dishesDTO){
        Dishes dishes = new Dishes();
        dishes.setDishesName(dishesDTO.getDishesName());
        dishes.setDishesDesc(dishesDTO.getDishesDesc());
        dishes.setMaterials(MaterialMapper.getInstance().toEntity(dishesDTO.getMaterialDTOs()));
        dishes.setDishesId(dishesDTO.getDishesId());
        return dishes;
    }
}
