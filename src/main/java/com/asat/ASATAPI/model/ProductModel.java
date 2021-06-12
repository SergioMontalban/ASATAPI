package com.asat.ASATAPI.model;

import java.io.File;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class ProductModel {
	
	//*****Info. Producto*******
	@Id
	private String id; //Puede contener números y letras
	private String modelo;
	private Integer carga;
	private Integer personas;
	private Integer paradas;
	private String fechaInstal;
	//*****Info. Cliente********
	private String numPedidoCli;
	private String numRefCli;
	private String nombreCli;
	private String direccionCli;
	private String tlfnCli;
	
	
	//*****Componentes**********
	private Element cabina;
	private ElementCant puertaCabina;
	private ElementCant puertaPiso;
	private Element maniobra;
	private Element botoneras;
	private Element motor;
	private Element chasisCabina;
	private Element chasisContrapeso;
	private Element guiasCabina;
	private Element guiasContrapeso;
	private ElementCant cablesTraccion;
	
	//Documentación
	private String doc;
	
	public ProductModel() {
		super();
	}

	public ProductModel(String id, String modelo, Integer carga, Integer personas, Integer paradas, String fechaInstal,
			String numPedidoCli, String numRefCli, String nombreCli, String direccionCli, String tlfnCli,
			Element cabina, ElementCant puertaCabina, ElementCant puertaPiso, Element maniobra, Element botoneras,
			Element motor, Element chasisCabina, Element chasisContrapeso, Element guiasCabina, Element guiasContrapeso,
			ElementCant cablesTraccion, String doc) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.carga = carga;
		this.personas = personas;
		this.paradas = paradas;
		this.fechaInstal = fechaInstal;
		this.numPedidoCli = numPedidoCli;
		this.numRefCli = numRefCli;
		this.nombreCli = nombreCli;
		this.direccionCli = direccionCli;
		this.tlfnCli = tlfnCli;
		this.cabina = cabina;
		this.puertaCabina = puertaCabina;
		this.puertaPiso = puertaPiso;
		this.maniobra = maniobra;
		this.botoneras = botoneras;
		this.motor = motor;
		this.chasisCabina = chasisCabina;
		this.chasisContrapeso = chasisContrapeso;
		this.guiasCabina = guiasCabina;
		this.guiasContrapeso = guiasContrapeso;
		this.cablesTraccion = cablesTraccion;
		this.doc = doc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFechaInstal() {
		return fechaInstal;
	}

	public void setFechaInstal(String fechaInstal) {
		this.fechaInstal = fechaInstal;
	}

	public String getNumPedidoCli() {
		return numPedidoCli;
	}

	public void setNumPedidoCli(String numPedidoCli) {
		this.numPedidoCli = numPedidoCli;
	}

	public String getNumRefCli() {
		return numRefCli;
	}

	public void setNumRefCli(String numRefCli) {
		this.numRefCli = numRefCli;
	}

	public String getNombreCli() {
		return nombreCli;
	}

	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}

	public String getDireccionCli() {
		return direccionCli;
	}

	public void setDireccionCli(String direccionCli) {
		this.direccionCli = direccionCli;
	}

	public String getTlfnCli() {
		return tlfnCli;
	}

	public void setTlfnCli(String tlfnCli) {
		this.tlfnCli = tlfnCli;
	}

	public Element getCabina() {
		return cabina;
	}

	public void setCabina(Element cabina) {
		this.cabina = cabina;
	}

	public ElementCant getPuertaCabina() {
		return puertaCabina;
	}

	public void setPuertaCabina(ElementCant puertaCabina) {
		this.puertaCabina = puertaCabina;
	}

	public ElementCant getPuertaPiso() {
		return puertaPiso;
	}

	public void setPuertaPiso(ElementCant puertaPiso) {
		this.puertaPiso = puertaPiso;
	}

	public Element getManiobra() {
		return maniobra;
	}

	public void setManiobra(Element maniobra) {
		this.maniobra = maniobra;
	}

	public Element getBotoneras() {
		return botoneras;
	}

	public void setBotoneras(Element botoneras) {
		this.botoneras = botoneras;
	}

	public Element getMotor() {
		return motor;
	}

	public void setMotor(Element motor) {
		this.motor = motor;
	}

	public Element getChasisCabina() {
		return chasisCabina;
	}

	public void setChasisCabina(Element chasisCabina) {
		this.chasisCabina = chasisCabina;
	}

	public Element getChasisContrapeso() {
		return chasisContrapeso;
	}

	public void setChasisContrapeso(Element chasisContrapeso) {
		this.chasisContrapeso = chasisContrapeso;
	}

	public Element getGuiasCabina() {
		return guiasCabina;
	}

	public void setGuiasCabina(Element guiasCabina) {
		this.guiasCabina = guiasCabina;
	}

	public Element getGuiasContrapeso() {
		return guiasContrapeso;
	}

	public void setGuiasContrapeso(Element guiasContrapeso) {
		this.guiasContrapeso = guiasContrapeso;
	}

	public ElementCant getCablesTraccion() {
		return cablesTraccion;
	}

	public void setCablesTraccion(ElementCant cablesTraccion) {
		this.cablesTraccion = cablesTraccion;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public Integer getPersonas() {
		return personas;
	}

	public void setPersonas(Integer personas) {
		this.personas = personas;
	}

	public Integer getParadas() {
		return paradas;
	}

	public void setParadas(Integer paradas) {
		this.paradas = paradas;
	}

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}

	

}
