package com.example.advertisement.repository;

import com.example.advertisement.dto.MenuDTO;

import java.util.*;

// TODO : 인스턴스 생성 편의를 위해 임시로 default 사용. repository layer 구현이 완성되면 삭제할 것
public interface MenuRepository {

    default List<MenuDTO> getAllMenus(Long storeId) {
        return List.of();
    }
}
