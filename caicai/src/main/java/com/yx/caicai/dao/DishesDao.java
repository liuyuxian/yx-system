package com.yx.caicai.dao;

import com.yx.caicai.entity.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DishesDao extends JpaRepository<Dishes, String> {
    List<Dishes> findAll();
    Dishes save(Dishes dishes);
}
