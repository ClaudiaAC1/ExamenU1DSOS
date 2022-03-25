package com.examen.primera.unidad.examenPrimeraUnidad.Implements;

import com.examen.primera.unidad.examenPrimeraUnidad.model.AlumnoModel;
import com.examen.primera.unidad.examenPrimeraUnidad.utils.CustomResponse;
import com.examen.primera.unidad.examenPrimeraUnidad.utils.Data;

public class CalculadoraICA {	
	
	
	
	public Double calcularICA(Double medidaCintura, Double medidaAltura) {		
		return  medidaCintura / medidaAltura;
	}


	public String nivel(Double ICA, Character sexo) {
		// TODO Auto-generated method stub
		String nivel="";
		if(sexo.equals('h')){
			if(ICA <= 0.34) {
				nivel="Delgadez severa";
			}else if(ICA <= 0.42) {
				nivel="Delgadez leve";
				
			}else if(ICA <= 0.52) {
				nivel="Peso normal";
				
			}else if(ICA <= 0.57) {
				nivel="Sobrepeso";
				
			}else if(ICA <= 0.62) {
				nivel="Sobrepeso elevado";
				
			}else if(ICA >= 0.63) {
				nivel="Obesidad mórbida";
				
			}
		}
		
		if(sexo.equals('m')){
			if(ICA <= 0.34) {
				nivel="Delgadez severa";
			}else if(ICA <= 0.41) {
				nivel="Delgadez leve";
				
			}else if(ICA <= 0.48) {
				nivel="Peso normal";
				
			}else if(ICA <= 0.53) {
				nivel="Sobrepeso";
				
			}else if(ICA <= 0.57) {
				nivel="Sobrepeso elevado";
				
			}else if(ICA >= 0.58) {
				nivel="Obesidad mórbida";
				
			}
		}
		return nivel;
		
	}

	

	public boolean validacion(AlumnoModel alumno) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		
		if(alumno.getMedidaAltura() == null || alumno.getMedidaCintura() == null || alumno.getSexo() == null) {
			flag=true;			
		}
		
		
		return flag;
		
	}
}
