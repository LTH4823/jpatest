package org.taerock.jpatest.domain;

import javax.persistence.*;

@Entity
public class Board2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    //한명의 작성자 기준으로 FK 설계시
    @ManyToOne
    private Member2 writer;

}
