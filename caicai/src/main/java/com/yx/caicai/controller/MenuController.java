package com.yx.caicai.controller;

import com.yx.caicai.dto.DishesDTO;
import com.yx.caicai.dto.ResponseDTO;
import com.yx.caicai.mapper.DishesMapper;
import com.yx.caicai.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/getWeekly")
    public ResponseDTO<List<DishesDTO>> getWeeklyMenu() {
        ResponseDTO<List<DishesDTO>> responseDTO = new ResponseDTO<>();
        responseDTO.setData(DishesMapper.getInstance().toDTO(menuService.getWeeklyMenu()));
        return responseDTO;
    }

    @GetMapping
    public ResponseDTO<List<DishesDTO>> getAll() {
        ResponseDTO<List<DishesDTO>> responseDTO = new ResponseDTO<>();
        responseDTO.setData(DishesMapper.getInstance().toDTO(menuService.getAll()));
        return responseDTO;
    }

    @PostMapping
    public ResponseDTO<DishesDTO> createDishes(@RequestBody DishesDTO dishesDTO) {
        ResponseDTO<DishesDTO> responseDTO = new ResponseDTO<>();
        responseDTO.setData(DishesMapper.getInstance().toDTO(menuService.saveDishes(dishesDTO)));
        return responseDTO;
    }

    @PutMapping
    public ResponseDTO<DishesDTO> updateDishes(@RequestBody DishesDTO dishesDTO) {
        ResponseDTO<DishesDTO> responseDTO = new ResponseDTO<>();
        responseDTO.setData(DishesMapper.getInstance().toDTO(menuService.saveDishes(dishesDTO)));
        return responseDTO;
    }


}
