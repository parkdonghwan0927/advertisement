package com.example.advertisement.service;

import com.example.advertisement.dto.StoreDTO;
import com.example.advertisement.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service("StoreServiceImpl")
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    @Override
    public List<StoreDTO> getAllStores(Long categoryId) {
        return storeRepository.getAllStores(categoryId);
    }
}
