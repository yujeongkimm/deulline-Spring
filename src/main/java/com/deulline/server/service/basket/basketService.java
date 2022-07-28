package com.deulline.server.service.basket;

import com.deulline.server.domain.basket.basket;
import com.deulline.server.domain.basket.basketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class basketService {
    private final basketRepository basketRepository;

    /**
     * 사용자 id에 따른 장바구니 항목 조회
     */
    public basket getBasketById(Long userId){
        basket info = basketRepository.findById(userId).get();

        System.out.println(info);

        return info;
    }
}
