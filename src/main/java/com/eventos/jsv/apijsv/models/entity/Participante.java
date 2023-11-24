package com.eventos.jsv.apijsv.models.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Participante implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombres;
	private String apellidos;
	private String tipoDocumentoIdentidad;
	private String documentoIdentidad;
	
	@NotEmpty
	private String numeroCelular;
	private boolean ofrenda;
	private boolean almuerzo;
	private Date creadoEl;
	
	@PrePersist
	public void prePersist() {
		creadoEl = new Date();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTipoDocumentoIdentidad() {
		return tipoDocumentoIdentidad;
	}
	public void setTipoDocumentoIdentidad(String tipoDocumentoIdentidad) {
		this.tipoDocumentoIdentidad = tipoDocumentoIdentidad;
	}
	public String getDocumentoIdentidad() {
		return documentoIdentidad;
	}
	public void setDocumentoIdentidad(String documentoIdentidad) {
		this.documentoIdentidad = documentoIdentidad;
	}
	public String getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public boolean isOfrenda() {
		return ofrenda;
	}
	public void setOfrenda(boolean ofrenda) {
		this.ofrenda = ofrenda;
	}
	public boolean isAlmuerzo() {
		return almuerzo;
	}
	public void setAlmuerzo(boolean almuerzo) {
		this.almuerzo = almuerzo;
	}
	
	
	
	public Date getCreadoEl() {
		return creadoEl;
	}

	public void setCreadoEl(Date creadoEl) {
		this.creadoEl = creadoEl;
	}



	private static final long serialVersionUID = 1L;
	
}
