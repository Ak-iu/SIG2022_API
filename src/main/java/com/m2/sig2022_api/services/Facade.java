package com.m2.sig2022_api.services;

import com.m2.sig2022_api.Entity.Degradation;
import com.m2.sig2022_api.dtos.DegradationDTO;
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

    public List<Degradation> findDegradations( String idEquipement){
        Query q = em.createQuery("Select d from Degradation d where d.idEquipement =" + idEquipement);
        return  q.getResultList();
    }

    @Transactional
    public void createDegradation(DegradationDTO degradationDTO){em.persist(new Degradation(degradationDTO.getId_equipement(),degradationDTO.getNature(),degradationDTO.getDate()));}

}
