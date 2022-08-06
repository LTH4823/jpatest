package org.taerock.jpatest.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Board2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    //DB 설계시 컬렉션 형태(하나의 컬럼에 여러개의 값이 들어가야 할때 Ex-해시태그)에 사용되는 어노테이션
    @ElementCollection
    private List<String> tags;

    //한명의 작성자 기준으로 FK 설계시
    @ManyToOne
    private Member2 writer;

}
