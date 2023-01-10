package com.m2.sig2022_api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.m2.sig2022_api.Entity.Degradation;
import com.m2.sig2022_api.dtos.DegradationDTO;
import com.m2.sig2022_api.dtos.SuggestionDTO;
import com.m2.sig2022_api.services.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    Facade facade;

    @GetMapping("/degradations")
    public ResponseEntity<String> get_degradations(@RequestParam String idEquipement) throws JsonProcessingException {
        List<Degradation> degradationList = facade.findDegradations(idEquipement);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(degradationList);

        return ResponseEntity.status(HttpStatus.OK).body(json);
    }

    @GetMapping("/all_degradations")
    public ResponseEntity<String> get_all_degradations() throws JsonProcessingException {
        List<Degradation> degradationList = facade.getAllDegradations();

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(degradationList);

        return ResponseEntity.status(HttpStatus.OK).body(json);
    }

    @PostMapping("/degradations")
    @ResponseBody
    public ResponseEntity signaler_degradation(@RequestBody DegradationDTO degradationDTO) {
        facade.createDegradation(degradationDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/equipement")
    public ResponseEntity post_equipement(@RequestBody SuggestionDTO suggestionDTO){
        facade.createSuggestion(suggestionDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }


}
