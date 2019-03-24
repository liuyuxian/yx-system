package com.yx.caicai.mapper;

import com.yx.caicai.dto.MaterialDTO;
import com.yx.caicai.entity.Material;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class MaterialMapper {

    private static MaterialMapper materialMapper = new MaterialMapper();

    public static MaterialMapper getInstance(){
        return materialMapper;
    }

    public MaterialDTO toDTO(Material material) {
        MaterialDTO materialDTO = new MaterialDTO();
        materialDTO.setMaterialName(material.getMaterialName());
        materialDTO.setMaterialId(material.getMaterialId());
        return materialDTO;
    }

    public List<MaterialDTO> toDTO(List<Material> materialList) {
        List<MaterialDTO> materialDTOList = new ArrayList<>();
        for (Material material : materialList) {
            materialDTOList.add(toDTO(material));
        }
        return materialDTOList;
    }

    public Material toEntity(MaterialDTO materialDTO) {
        Material material = new Material();
        BeanUtils.copyProperties(materialDTO, material);
//        material.setMaterialId(materialDTO.getMaterialId());
//        material.setMaterialName(materialDTO.getMaterialName());
        return material;
    }

    public List<Material> toEntity(List<MaterialDTO> materialDTOs) {
        List<Material> materials = new ArrayList<>();
        for (MaterialDTO materialDTO : materialDTOs) {
            materials.add(toEntity(materialDTO));
        }
        return materials;
    }
}
