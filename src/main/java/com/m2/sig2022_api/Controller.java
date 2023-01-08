package com.m2.sig2022_api;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.m2.sig2022_api.dtos.DegradationDTO;
import com.m2.sig2022_api.dtos.SuggestionDTO;
import com.m2.sig2022_api.services.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class Controller {
    @Autowired
    Facade facade;

    @GetMapping("/equipements")
    public void get_equipements() {
    }

    @GetMapping("/points")
    public void get_points_depots() {
    }

    @GetMapping("/degradations")
    public void get_degradations(){
        //facade.getAllDegradations();
    }

    @PostMapping("/degradations")
    @ResponseBody
    public ResponseEntity signaler_degradation(@RequestBody DegradationDTO degradationDTO) {
        facade.createDegradation(degradationDTO);

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PostMapping("/installations")
    public void suggerer_installation(@RequestBody SuggestionDTO suggestionDTO) {

    }


}
