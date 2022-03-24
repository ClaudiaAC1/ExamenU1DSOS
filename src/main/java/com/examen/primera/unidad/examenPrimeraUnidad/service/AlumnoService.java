package com.examen.primera.unidad.examenPrimeraUnidad.service;

import com.examen.primera.unidad.examenPrimeraUnidad.model.AlumnoModel;


public interface AlumnoService {
	public AlumnoModel getAlumno(String numControl);
	public void createAlumno(AlumnoModel alumno);
    
}
