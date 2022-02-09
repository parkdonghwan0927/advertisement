package com.example.advertisement.dto;

import com.example.advertisement.constant.MenuCategory;
import lombok.Getter;

import java.awt.*;

@Getter
public class MenuResponse {
    Long storeId;   // 어느 가게 메뉴인지
    Long menuId;    // 메뉴 고유 식별 정보
    String name;    // 메뉴 이름
    MenuCategory category;    // 메인 or 사이드 or 음료 등등
    Integer price;  //메뉴 가격
    String memo;    // 메뉴 설명
    // 사진 정보 필요

    public static MenuResponse of(
            Long storeId,
            Long menuId,
            String name,
            MenuCategory category,
            Integer price,
            String memo
    ) {
        MenuResponse tmp = new MenuResponse();

        tmp.storeId = storeId;
        tmp.menuId = menuId;
        tmp.name = name;
        tmp.category = category;
        tmp.price = price;
        tmp.memo = memo;

        return tmp;
    }
}
