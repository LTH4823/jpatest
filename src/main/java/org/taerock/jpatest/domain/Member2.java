package org.taerock.jpatest.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Member2 {

    @Id
    private String mid;

    //jpa 타 엔티티 참조시 연관관계 반드시 선택해야함
    //jpa 위험한 점 연관관계 설정 시 코드 상 오류가 잘 나타나지 않음
    //mappedBy 는 관계간의 맵핑 테이블 정의
    @OneToMany
    @JoinColumn(name = "m2")
    private List<Board2> boardList;

}
