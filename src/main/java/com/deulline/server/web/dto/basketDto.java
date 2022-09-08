package com.deulline.server.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class basketDto {

    /**
     * 사용자 id에 따른 장바구니 항목 조회
     */
    @Data
    @AllArgsConstructor
    public static class basketInfoDto{
        private Long basketId;
        private Long productId;
        private int price;
    }
}
