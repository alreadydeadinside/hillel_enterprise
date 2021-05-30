//package com.example.demo.repository;
//
//import com.example.demo.model.OldUser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.LockModeType;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@Repository
//public class JpaRepositoryImpl implements AbstractRepository {
//
//    @Autowired
//    EntityManager entityManager;
//
//    @Transactional
//    public List<OldUser> getAll() {
//        TypedQuery<OldUser> fromUser = entityManager.createQuery("", OldUser.class);
//        fromUser.setLockMode(LockModeType.PESSIMISTIC_WRITE);
//        return fromUser.getResultList();
//    }
//
//    @Override
//    public void create(OldUser user) {
//
//    }
//}