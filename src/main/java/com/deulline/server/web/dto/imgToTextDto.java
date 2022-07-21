package com.deulline.server.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class imgToTextDto {

    /**
     * 추가 정보 요청에 대한 ocr 전체 세부 정보
     */
    @Data
    @AllArgsConstructor
    public static class extraInfoDto {
        private Long id;
        private String info;
    }
}