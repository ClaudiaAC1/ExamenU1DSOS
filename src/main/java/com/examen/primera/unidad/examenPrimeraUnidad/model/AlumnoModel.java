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
	private Double ICA;
	private String nivel;
	
	public AlumnoModel() {}
	
	public AlumnoModel(Integer id, String numControl, Character sexo, Double medidaCintura, Double medidaAltura) {
		this.id = id;
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

	public Double getICA() {
		return ICA;
	}

	public void setICA(Double iCA) {
		ICA = iCA;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	
	

}
