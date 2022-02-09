package com.example.advertisement.service;

import com.example.advertisement.dto.MenuDTO;
import com.example.advertisement.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service("MenuServiceImpl")
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    @Override
    public List<MenuDTO> getALlMenus(Long storeId) {
        return menuRepository.getAllMenus(storeId);
    }

}
