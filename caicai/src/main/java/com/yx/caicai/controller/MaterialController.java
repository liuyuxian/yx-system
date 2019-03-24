package com.yx.caicai.controller;

import com.yx.caicai.dto.MaterialDTO;
import com.yx.caicai.mapper.MaterialMapper;
import com.yx.caicai.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<MaterialDTO> getAll() {
        return MaterialMapper.getInstance().toDTO(materialService.getAll());
    }
}
