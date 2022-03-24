package com.examen.primera.unidad.examenPrimeraUnidad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
	  @GetMapping("/")
	    public String index(){
	        return "<h1>Holis soy tu servidor en Spring</h1>";
	    }
}
