package com.examen.primera.unidad.examenPrimeraUnidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.primera.unidad.examenPrimeraUnidad.model.AlumnoModel;



@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoModel,Integer> {
	public AlumnoModel findByNumControl(String numControl);
}
