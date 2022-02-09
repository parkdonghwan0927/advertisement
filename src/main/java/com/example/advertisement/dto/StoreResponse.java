package com.example.advertisement.dto;

import com.example.advertisement.constant.MenuCategory;
import com.example.advertisement.constant.StoreCategory;
import lombok.Getter;

@Getter
public class StoreResponse {
    StoreCategory category;    // 어느 카테고리 가게 인지
    Long storeId;   // 가게 고유식별 정보
    String name;    // 가게 이름
    String address; // 가게 주소
    // 사진 정보 필요

    Integer discountRate;   // 가게 할인율

    public static StoreResponse of(
            StoreCategory category,
            Long storeId,
            String name,
            String address,
            Integer discountRate
    ) {
        StoreResponse tmp = new StoreResponse();

        tmp.category = category;
        tmp.storeId = storeId;
        tmp.name = name;
        tmp.address = address;
        tmp.discountRate = discountRate;

        return tmp;
    }
}
