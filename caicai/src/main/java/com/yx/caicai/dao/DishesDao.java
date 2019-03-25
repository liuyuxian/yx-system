package com.yx.caicai.dao;

import com.yx.caicai.entity.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishesDao extends JpaRepository<Dishes, String> {
}
