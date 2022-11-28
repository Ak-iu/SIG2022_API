package com.m2.sig2022_api;

import com.m2.sig2022_api.dtos.DegradationDTO;
import com.m2.sig2022_api.dtos.SuggestionDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/equipements")
    public void get_equipements() {
    }

    @GetMapping("/points")
    public void get_points_depots() {
    }

    @GetMapping("/degradations")
    public void get_degradations(){
    }

    @PostMapping("/degradations")
    public void signaler_degradation(@RequestBody DegradationDTO degradationDTO) {

    }

    @PostMapping("/installations")
    public void suggerer_installation(@RequestBody SuggestionDTO suggestionDTO) {

    }

}
