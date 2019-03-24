package com.yx.caicai.controller;


import com.yx.caicai.dto.DishesDTO;
import com.yx.caicai.entity.Dishes;
import com.yx.caicai.mapper.DishesMapper;
import com.yx.caicai.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/getWeekly")
    List<DishesDTO> getWeeklyMenu() {
        return DishesMapper.getInstance().toDTO(menuService.getWeeklyMenu());
    }

    @PostMapping
    public DishesDTO createELActivity(@RequestBody DishesDTO dishesDTO) {
        return DishesMapper.getInstance().toDTO(menuService.save(dishesDTO));
    }
}
