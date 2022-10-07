package com.dorigon.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeoController {

    @GetMapping("/regions")
    public String getRegions(){
        return "Return Regions";
    }


    @GetMapping("/cities")
    public String getCities(){
        return "Return Cities";
    }
}
