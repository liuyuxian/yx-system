package com.yx.caicai.dao;

import com.yx.caicai.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialDao extends JpaRepository<Material, String> {
}
