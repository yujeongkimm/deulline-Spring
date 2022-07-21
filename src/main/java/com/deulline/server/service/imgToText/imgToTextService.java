package com.deulline.server.service.imgToText;

import com.deulline.server.domain.imgToText.imgToTextRepository;
import com.deulline.server.domain.imgToText.imgToText;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class imgToTextService {

    private final imgToTextRepository imgToTextRepository;

    /**
     * 추가 정보 요청에 대한 ocr 전체 세부 정보
     */
    public imgToText getExtraById(Long productId) {
        imgToText info = imgToTextRepository.findById(productId).get();

        System.out.println(info);

        return info;
    }
}
