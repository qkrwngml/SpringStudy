//서비스 구현 인터페이스
package com.naver.shopping.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
