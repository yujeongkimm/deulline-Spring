package com.deulline.server.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class productDto {

    /**
     * 상품의 기초 정보 조회
     */

    @Data
    @AllArgsConstructor
    public static class productInfoDto{
        private Long productId;
        private String productName;
        private int price;
        private int reviewCount;
        private int ranking;
    }
}
