package com.example.advertisement.service;

import com.example.advertisement.dto.StoreDTO;

import java.util.List;

public interface StoreService {

    List<StoreDTO> getAllStores(Long categoryId);
}
