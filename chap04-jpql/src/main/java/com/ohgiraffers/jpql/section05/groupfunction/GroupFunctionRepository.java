package com.ohgiraffers.jpql.section05.groupfunction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class GroupFunctionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public long countMenuOfCategory(int categoryCode) {
        String jpql = "SELECT COUNT(m.menuCode) FROM Section05Menu m WHERE m.categoryCode = :categoryCode";

        
    }
}
