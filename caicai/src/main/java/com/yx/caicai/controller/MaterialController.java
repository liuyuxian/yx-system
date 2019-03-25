package com.yx.caicai.controller;

import com.yx.caicai.dto.MaterialDTO;
import com.yx.caicai.dto.ResponseDTO;
import com.yx.caicai.mapper.MaterialMapper;
import com.yx.caicai.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public ResponseDTO<List<MaterialDTO>> getAll() {
        ResponseDTO<List<MaterialDTO>> response = new ResponseDTO<>();
        response.setData(MaterialMapper.getInstance().toDTO(materialService.getAll()));
        return response;
    }

    @PostMapping
    public ResponseDTO<MaterialDTO> createMaterial(@RequestBody MaterialDTO materialDTO) {
        ResponseDTO<MaterialDTO> response = new ResponseDTO<>();
        response.setData(MaterialMapper.getInstance().toDTO(materialService.saveMaterial(materialDTO)));
        return response;
    }
}
