package com.examen.primera.unidad.examenPrimeraUnidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.primera.unidad.examenPrimeraUnidad.model.AlumnoModel;
import com.examen.primera.unidad.examenPrimeraUnidad.service.AlumnoService;
import com.examen.primera.unidad.examenPrimeraUnidad.utils.CustomResponse;
import com.examen.primera.unidad.examenPrimeraUnidad.utils.Data;

@RestController
@RequestMapping("/alumno/ica")
public class AlumnoController {
	private AlumnoModel alumno;
	
	@Autowired
	private AlumnoService alumnoService;
	
	 @PostMapping("/")
	 public CustomResponse createAlumno(@RequestBody AlumnoModel alumno) {
		 CustomResponse customResponse = new CustomResponse();
	        alumnoService.createAlumno(alumno);
	        return customResponse;
	 }
	
	@GetMapping("/{numControl}")
	public CustomResponse getICA(@PathVariable String numControl) {
		CustomResponse customResponse= new CustomResponse();
		alumno=alumnoService.getAlumno(numControl);
		Double ICA= alumno.getMedidaCintura() / alumno.getMedidaAltura();;
		alumno.setICA(ICA);
		
		if(alumno.getSexo().equals('h')) {
			if(ICA <= 0.34) {
				alumno.setNivel("Delgadez severa");
			}else if(ICA <= 0.42) {
				alumno.setNivel("Delgadez leve");
			}else if(ICA <= 0.52) {
				alumno.setNivel("Peso normal");
			}else if(ICA <= 0.57) {
				alumno.setNivel("Sobrepeso");
			}else if(ICA <= 0.62) {
				alumno.setNivel("Sobrepeso elevado");
			}else if(ICA >= 0.63) {
				alumno.setNivel("Obesidad mórbida");
			}
		}
		
		if(alumno.getSexo().equals('m')) {
			if(ICA <= 0.34) {
				alumno.setNivel("Delgadez severa");
			}else if(ICA <= 0.41) {
				alumno.setNivel("Delgadez leve");
			}else if(ICA <= 0.48) {
				alumno.setNivel("Peso normal");
			}else if(ICA <= 0.53) {
				alumno.setNivel("Sobrepeso");
			}else if(ICA <= 0.57) {
				alumno.setNivel("Sobrepeso elevado");
			}else if(ICA >= 0.58) {
				alumno.setNivel("Obesidad mórbida");
			}
			
		}
		Data data= new Data(alumno.getICA(), alumno.getNivel());
		customResponse.setData(data);
		
		return customResponse;
	}
}
