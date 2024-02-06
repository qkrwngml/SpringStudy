//회원 저장, 값 가져오기 인터페이스
package com.naver.shopping.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
