package com.deulline.server.domain.basket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.swing.*;
import java.util.Optional;

@Repository
public interface basketRepository extends JpaRepository<basket, Long> {
    @Query(value = "select * from basket b where b.user_id =:userId", nativeQuery = true)
    Optional<basket> findById(@Param("userId") Long userId);

}
