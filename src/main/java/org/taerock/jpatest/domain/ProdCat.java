package org.taerock.jpatest.domain;

import javax.persistence.*;

@Entity
public class ProdCat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pcno;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Category category;

    private int score;

}
