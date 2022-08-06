package org.taerock.jpatest.domain;

import javax.persistence.Embeddable;

//단독 Entity가 아닌경우 Embeddable을 사용한다.
@Embeddable
public class MemberRole {

    //enum으로 설계 하려고 했으나 오류로 취소
    //ADMIN("ADMIN"), MEMBER("MEMBER"), GUEST("GUEST");

    private String description;

    MemberRole(String desc){
        this.description = desc;
    }


    public MemberRole() {

    }
}
