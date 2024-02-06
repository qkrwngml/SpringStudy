//인터페이스 구현

package com.naver.shopping.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
    @Override
    public void save(Member member) {
        store.put(member.getId(), member); //key로 id사용하고 value에는 member 그 자체를 저장. 저장 구현
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId); //매개변수 그대로 넣기. 값 가져오기 구현
    }
}
