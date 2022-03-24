package com.examen.primera.unidad.examenPrimeraUnidad.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.primera.unidad.examenPrimeraUnidad.model.AlumnoModel;
import com.examen.primera.unidad.examenPrimeraUnidad.repository.AlumnoRepository;
import com.examen.primera.unidad.examenPrimeraUnidad.service.AlumnoService;

@Service
public class AlumnoServiceImplement implements AlumnoService{
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public AlumnoModel getAlumno(String numControl) {
		// TODO Auto-generated method stub
		return alumnoRepository.findByNumControl(numControl);
	}

	@Override
	public void createAlumno(AlumnoModel alumno) {
		// TODO Auto-generated method stub
		alumnoRepository.save(alumno);
		
	}
	
	

}
