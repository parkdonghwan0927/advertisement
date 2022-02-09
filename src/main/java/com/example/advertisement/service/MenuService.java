package com.example.advertisement.service;

import com.example.advertisement.dto.MenuDTO;

import java.util.List;

public interface MenuService {

    List<MenuDTO> getALlMenus(Long storeId);
}
