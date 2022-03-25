package com.examen.primera.unidad.examenPrimeraUnidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.primera.unidad.examenPrimeraUnidad.Implements.CalculadoraICA;
import com.examen.primera.unidad.examenPrimeraUnidad.model.AlumnoModel;
import com.examen.primera.unidad.examenPrimeraUnidad.service.AlumnoService;
import com.examen.primera.unidad.examenPrimeraUnidad.utils.Custom2;
import com.examen.primera.unidad.examenPrimeraUnidad.utils.CustomResponse;
import com.examen.primera.unidad.examenPrimeraUnidad.utils.Data;

@RestController
@RequestMapping("/alumno/ica")
public class AlumnoController {
	private AlumnoModel alumno;
	private CalculadoraICA calculadora= new CalculadoraICA();
	
	@Autowired
	private AlumnoService alumnoService;
	
	 @PostMapping("/")
	 public Object createAlumno(@RequestBody AlumnoModel alumno) { //PRIMER FLUJ0
		
		 alumnoService.createAlumno(alumno);
		 CustomResponse customResponse= new CustomResponse();
		 Custom2 custom2= new Custom2();
		 
		 if(!(calculadora.validacion(alumno))) {
			 Double ICA= calculadora.calcularICA(alumno.getMedidaCintura(), alumno.getMedidaAltura());
			 String msg= calculadora.nivel(ICA, alumno.getSexo());
			 
			 
			 customResponse.setData(new Data(ICA,msg));
			 return customResponse;
			 
		 }else {
			 custom2.setData("No se cuenta con la información necesaria para realizar el calculo");		
			 return custom2;
					 
		 }
		 
	 }
	 
	 @GetMapping("/{numControl}")
	 public Object getICAnumControl(@PathVariable String numControl) { //SEGUNDO FLUJO
		 CustomResponse customResponse= new CustomResponse();
		 Custom2 custom2= new Custom2();
		 alumno= alumnoService.getAlumno(numControl);
		 
		 try {			 
			 if (!alumno.equals(null)) {
				 
				 if(!calculadora.validacion(alumno)) {
					 
					 Double ICA= calculadora.calcularICA(alumno.getMedidaCintura(), alumno.getMedidaAltura());
					 String msg= calculadora.nivel(ICA, alumno.getSexo());					 
					 
					 customResponse.setData(new Data(ICA,msg));
					 return customResponse;
					 
				 }
					custom2.setData("No se cuenta con la información necesaria para realizar el calculo");
					return custom2;
			 }
			 
		 }catch (NullPointerException e) {
			 custom2.setData("Alumno no existe");
			 
			 return custom2;
		}
		return null;
		
	 }

}

