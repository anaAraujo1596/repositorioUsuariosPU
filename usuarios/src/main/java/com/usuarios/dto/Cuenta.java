package com.usuarios.dto;

import java.io.IOException;
import java.io.Serializable;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.validation.Validator;

import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
public class Cuenta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
   @Id
   @GeneratedValue
   private int id;
   
   @Size(max = 10)
   private String numeroCuenta;
   
   @Min(value = 1)
   private float ingresos;
   

   
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNumeroCuenta() {
	return numeroCuenta;
}
public void setNumeroCuenta(String numeroCuenta) {
	this.numeroCuenta = numeroCuenta;
}
public float getIngresos() {
	return ingresos;
}
public void setIngresos(float ingresos) {
	this.ingresos = ingresos;
}


   

   
}
