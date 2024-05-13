package com.ohgiraffers.mapping.section01.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Member member) {
        entityManager.persist(member);
    }

    public String findNameById(String memberId) {
        String jpql = "SELECT m.memberName FROM entityMember m WHERE m.memberId = '" + memberId + "'";
        // 테이블은 엔티티 이름, alias 별칭 (예를들어 m 등) 이 필수.

        return entityManager.createQuery(jpql, String.class).getSingleResult();
        // createQuery(넣을 구문, 반환받을 타입).getSingleResult()-> 하나만 줘.
    }
}
