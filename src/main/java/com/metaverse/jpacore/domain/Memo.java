package com.metaverse.jpacore.domain;

import jakarta.persistence.*;


@Entity // JPA가 관리할 수 있는 Entity 클래스로 지정
//@Table(name = "memo") // 맵핑할 테이블 이름을 지정(생략 시, 클래스명 기본값)
public class Memo {
    @Id // PK 설정
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 생성 DB에 위임
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    private String username;

    @Column(length = 500)
    private String contents;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getContents() {
        return contents;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
