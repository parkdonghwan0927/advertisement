package com.example.advertisement.controller;

import com.example.advertisement.constant.MenuCategory;
import com.example.advertisement.constant.StoreCategory;
import com.example.advertisement.dto.MenuResponse;
import com.example.advertisement.dto.StoreResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/")    // 홈화면
    public String home() {
        return "/home";
    }

    @GetMapping("/stores/{categoryId}")  // 해당 카테고리 가게들
    public ModelAndView Stores(@PathVariable Integer categoryId) {

        Map<String, Object> map = new HashMap<>();

        // TODO: 임시 데이터, 추후 삭제 예정
        map.put("stores", List.of(
                StoreResponse.of(
                        StoreCategory.CHICKEN,
                        1L,
                        "DH CHICKEN",
                        "경산 대동안길 1",
                        20
                ), StoreResponse.of(
                        StoreCategory.CHICKEN,
                        2L,
                        "MY CHICKEN",
                        "경산 대동안길 2",
                        30
                ),
                StoreResponse.of(
                        StoreCategory.CHICKEN,
                        3L,
                        "JW CHICKEN",
                        "경산 대동안길 3",
                        20
                ),
                StoreResponse.of(
                        StoreCategory.CHICKEN,
                        4L,
                        "BBQ CHICKEN",
                        "경산 대동안길 4",
                        40
                ),
                StoreResponse.of(
                        StoreCategory.CHICKEN,
                        5L,
                        "BHC CHICKEN",
                        "경산 대동안길 5",
                        40
                ),
                StoreResponse.of(
                        StoreCategory.CHICKEN,
                        6L,
                        "PURADAK CHICKEN",
                        "경산 대동안길 6",
                        50
                ),
                StoreResponse.of(
                        StoreCategory.CHICKEN,
                        7L,
                        "KHOCHON CHICKEN",
                        "경산 대동안길 7",
                        60
                ),
                StoreResponse.of(
                        StoreCategory.CHICKEN,
                        8L,
                        "HOOCHANJAL CHICKEN",
                        "경산 대동안길 8",
                        10
                ), StoreResponse.of(
                        StoreCategory.CHICKEN,
                        9L,
                        "HI CHICKEN",
                        "경산 대동안길 9",
                        20
                ),StoreResponse.of(
                        StoreCategory.CHICKEN,
                        10L,
                        "HELLO CHICKEN",
                        "경산 대동안길 10",
                        40
                ),StoreResponse.of(
                        StoreCategory.CHICKEN,
                        11L,
                        "LOL CHICKEN",
                        "경산 대동안길 11",
                        50
                ),StoreResponse.of(
                        StoreCategory.CHICKEN,
                        12L,
                        "BATTLEGROUND CHICKEN",
                        "경산 대동안길 12",
                        10
                )
        ));

        return new ModelAndView("/stores", map);

    }

    @GetMapping("/store-detail/{storeId}")    // 가게 디테일
    public ModelAndView StoreDetail(@PathVariable Integer storeId) {

        Map<String, Object> map = new HashMap<>();

        map.put("menus", List.of(
                MenuResponse.of(
                        1L,
                        1L,
                        "DH CHICKEN",
                        MenuCategory.BEST,
                        300000,
                        "5성급 쉐프 DH가 직접만든 치킨"
                ),
                MenuResponse.of(
                        1L,
                        2L,
                        "MINYEOL SILVER CHICKEN",
                        MenuCategory.BEST,
                        500,
                        "실버들만 먹는 치킨"
                ),
                MenuResponse.of(
                        1L,
                        3L,
                        "TURTLE CHICKEN",
                        MenuCategory.BEST,
                        15000,
                        "허준우같은 느림보만 먹는 치킨"
                ),
                MenuResponse.of(
                        1L,
                        4L,
                        "DH CHICKEN + COKE",
                        MenuCategory.SET,
                        302000,
                        "5성급 쉐프 DH가 직접만든 치킨 + 콜라"
                ),
                MenuResponse.of(
                        1L,
                        1L,
                        "DH CHICKEN",
                        MenuCategory.MAIN,
                        300000,
                        "5성급 쉐프 DH가 직접만든 치킨"
                ),
                MenuResponse.of(
                        1L,
                        2L,
                        "MINYEOL SILVER CHICKEN",
                        MenuCategory.MAIN,
                        500,
                        "실버들만 먹는 치킨"
                ),
                MenuResponse.of(
                        1L,
                        3L,
                        "TURTLE CHICKEN",
                        MenuCategory.MAIN,
                        15000,
                        "허준우같은 느림보만 먹는 치킨"
                ),
                MenuResponse.of(
                        1L,
                        5L,
                        "SOLO CHICKEN",
                        MenuCategory.MAIN,
                        20000,
                        "솔로들만 먹는 치킨"
                ),
                MenuResponse.of(
                        1L,
                        6L,
                        "COUPLE CHICKEN",
                        MenuCategory.MAIN,
                        35000,
                        "커플들만 먹는 치킨"
                ),
                MenuResponse.of(
                        1L,
                        7L,
                        "CHEESEBALL",
                        MenuCategory.SIDE,
                        800000,
                        "내가 제일 좋아하는 치즈볼"
                ),
                MenuResponse.of(
                        1L,
                        8L,
                        "COKE",
                        MenuCategory.DRINK,
                        2000,
                        "5성급 쉐프 DH가 직접사온 콜라"
                )
        ));

        return new ModelAndView("store-detail", map);
    }
}
