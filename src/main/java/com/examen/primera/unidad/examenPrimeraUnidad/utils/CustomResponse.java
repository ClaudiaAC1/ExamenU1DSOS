package com.examen.primera.unidad.examenPrimeraUnidad.utils;

import java.util.LinkedList;



public class CustomResponse {
	 private Integer httpCode;
	    private Data data;
	    private String mesage;
	    
	    public CustomResponse(){
	        this.httpCode = 200;
	        data = new Data();
	        this.mesage = "Ok";
	    }    
	    

	    public Integer getHttpCode() {
	        return httpCode;
	    }

	    public void setHttpCode(Integer httpCode) {
	        this.httpCode = httpCode;
	    }

	    public Object getData() {
	        return data;
	    }

	    public void setData(Data data) {
	        this.data = data;
	    }
	    
	    
	    public String getMesage() {
	        return mesage;
	    }

	    public void setMesage(String mesage) {
	        this.mesage = mesage;
	    }
}
