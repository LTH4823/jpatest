package org.taerock.jpatest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Board2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

}
