package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);//save  회원이 저장소에 저장
    Optional<Member> findById(Long id);// findById   찾기 가능
    Optional<Member> findByName(String name);//findByName 찾기 가능
    List<Member> findAll(); // 지금까지 모든 회원 리스트 전체 조회


}