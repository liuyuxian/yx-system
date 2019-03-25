package com.yx.caicai.service;

import com.yx.caicai.dao.DishesDao;
import com.yx.caicai.dto.DishesDTO;
import com.yx.caicai.entity.Dishes;
import com.yx.caicai.mapper.DishesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class MenuService {
    @Resource
    private DishesDao dishesDao;

    public List<Dishes> getWeeklyMenu() {
        List<Dishes> menu = getAll();
        Collections.shuffle(menu);
        if(menu.size()>=5){
            return menu.subList(0,4);
        }
        return menu;
    }

    public Dishes saveDishes(DishesDTO dishesDTO) {
        return dishesDao.save(DishesMapper.getInstance().toEntity(dishesDTO));
    }

    public List<Dishes> getAll() {
        return dishesDao.findAll();
    }
}
