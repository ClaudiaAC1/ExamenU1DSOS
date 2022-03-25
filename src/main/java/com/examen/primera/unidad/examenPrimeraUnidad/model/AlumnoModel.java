package com.examen.primera.unidad.examenPrimeraUnidad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alumno")
public class AlumnoModel {
	 @Id
	 @Column
	 @GeneratedValue(strategy = GenerationType.AUTO)
	   
	private Integer id;
	private String numControl;
	private Character sexo; // h m
	private Double medidaCintura;
	private Double medidaAltura;
	
	
	public AlumnoModel() {}	
	public AlumnoModel(String numControl) {this.numControl = numControl;}

	public AlumnoModel(String numControl, Character sexo, Double medidaCintura, Double medidaAltura) {
		this.numControl = numControl;
		this.sexo = sexo;
		this.medidaCintura = medidaCintura;
		this.medidaAltura = medidaAltura;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	
	public String getNumControl() {
		return numControl;
	}
	public void setNumControl(String numControl) {
		this.numControl = numControl;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public Double getMedidaCintura() {
		return medidaCintura;
	}
	public void setMedidaCintura(Double medidaCintura) {
		this.medidaCintura = medidaCintura;
	}
	public Double getMedidaAltura() {
		return medidaAltura;
	}
	public void setMedidaAltura(Double medidaAltura) {
		this.medidaAltura = medidaAltura;
	}

}
