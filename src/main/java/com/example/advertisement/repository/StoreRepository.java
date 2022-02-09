package com.example.advertisement.repository;

import com.example.advertisement.dto.StoreDTO;

import java.util.List;

public interface StoreRepository {
    default List<StoreDTO> getAllStores(Long categoryId) {
        return List.of();
    }
}
