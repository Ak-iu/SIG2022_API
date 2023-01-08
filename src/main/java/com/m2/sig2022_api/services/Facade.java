package com.m2.sig2022_api.services;

import com.m2.sig2022_api.Entity.Degradation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class Facade {
    @PersistenceContext
    EntityManager em;

    public List<Degradation> getAllDegradations(){
        Query q = em.createQuery("Select d from Degradation d");
        return q.getResultList();
    }

    public Degradation findDegradation(int idDegradation){ return  em.find(Degradation.class,idDegradation);}

    @Transactional
    public void createDegradation(Date date,String nature){ em.persist(new Degradation(date,nature));}

}
