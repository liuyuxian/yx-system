package com.yx.caicai.service;

import com.yx.caicai.dao.MaterialDao;
import com.yx.caicai.entity.Material;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MaterialService {

    @Resource
    private MaterialDao materialDao;

    public List<Material> getAll() {
        return materialDao.findAll();
    }
}
