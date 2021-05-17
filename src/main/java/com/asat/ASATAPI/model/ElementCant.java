package com.asat.ASATAPI.model;

public class ElementCant{

	private String marca;
	private String modelo;
	private String descrip;
	private int cant;
	
	public ElementCant(String marca, String modelo, String descrip, int cant) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.descrip = descrip;
		this.cant = cant;
	}

	public ElementCant() {
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

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	@Override
	public String toString() {
		return "ElementCant [marca=" + marca + ", modelo=" + modelo + ", descrip=" + descrip + ", cant=" + cant + "]";
	}
	
}
