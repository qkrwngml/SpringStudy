package com.naver.shopping.member;

public class MemberServiceImpl implements MemberService {
    //memberRepository형으로 불러와야 이후에 변경이 수월하다
    private MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
