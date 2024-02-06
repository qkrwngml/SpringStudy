//회원 정의 엔티티
package com.naver.shopping.member;

public class Member {
    private Long id;
    private String name;
    private Grade grade;

    //private 사용했으니까 생성자 만들어야함
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //외부에서 변수를 불러오거나 변경할 수 있게 getter, setter 함수 만들기
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
