package com.deulline.server.domain.imgToText;

import com.deulline.server.domain.imgToText.imgToText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface imgToTextRepository extends JpaRepository<imgToText, Long> {

    @Query(value = "select * from imgToText i where i.product_id = :productId", nativeQuery = true)
    Optional<imgToText> findById(Long productId);
}
