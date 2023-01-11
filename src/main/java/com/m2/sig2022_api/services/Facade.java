package com.m2.sig2022_api.services;

import com.m2.sig2022_api.Entity.Degradation;
import com.m2.sig2022_api.Entity.Suggestion;
import com.m2.sig2022_api.dtos.DegradationDTO;
import com.m2.sig2022_api.dtos.SuggestionDTO;
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
        Query q = em.createQuery("Select d from Degradation d where d.repare=false ");
        return q.getResultList();
    }

    public List<Degradation> findDegradations( String idEquipement){
        Query q = em.createQuery("Select d from Degradation d where d.idEquipement =" + idEquipement + " and d.repare=false");
        return  q.getResultList();
    }

    public List<Suggestion> getSuggestions() {
        Query q = em.createQuery("Select s from Suggestion s ");
        return q.getResultList();
    }

    @Transactional
    public void createDegradation(DegradationDTO degradationDTO){
        em.persist(new Degradation(degradationDTO.getId_equipement(), degradationDTO.getNature(), degradationDTO.getDate(), degradationDTO.getType()));
    }
    @Transactional
    public void createSuggestion(SuggestionDTO suggestionDTO) {
        em.persist(new Suggestion(suggestionDTO.getType(), suggestionDTO.getCoords_x(), suggestionDTO.getCoords_y()));
    }

    @Transactional
    public void reparer(int id_degradation) {
        Degradation degradation = em.find(Degradation.class, id_degradation);
        degradation.setRepare(true);
    }
}
