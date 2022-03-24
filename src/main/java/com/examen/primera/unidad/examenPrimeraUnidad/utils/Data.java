package com.examen.primera.unidad.examenPrimeraUnidad.utils;

public class Data {
	private Double ICA;
	private String nivel;
	
	public Data(Double iCA, String nivel) {
		ICA = iCA;
		this.nivel = nivel;
	}
	public Data() {
		
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
