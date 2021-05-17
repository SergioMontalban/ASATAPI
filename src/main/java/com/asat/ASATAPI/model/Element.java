package com.asat.ASATAPI.model;

public class Element{

	private String marca;
	private String modelo;
	private String descrip;
	

	public Element(String marca, String modelo, String descrip) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.descrip = descrip;
	}
	
	public Element() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	@Override
	public String toString() {
		return "Elemento [marca=" + marca + ", modelo=" + modelo + ", descrip=" + descrip + "]";
	}

	
}
