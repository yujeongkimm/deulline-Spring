package com.deulline.server.domain.imgToText;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "imgToText")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class imgToText {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", unique = true)
    private Long id;

    private String img_to_text;
}