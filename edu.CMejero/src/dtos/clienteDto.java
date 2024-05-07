package dtos;

import java.time.LocalDateTime;

public class clienteDto {

	long idCliente;
	String nombreCliente = "aaaaa";
	String apellido1 = "aaaaa";
	String apellido2 = "aaaaa";
	String nombreCompleto = apellido1 + " " + apellido2 + ", " + nombreCliente;
	String dni = "aaaaa";
	boolean estaValidado = false;
	LocalDateTime fechaRegistro;

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isEstaValidado() {
		return estaValidado;
	}

	public void setEstaValidado(boolean estaValidado) {
		this.estaValidado = estaValidado;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public clienteDto(long idCliente, String nombreCliente, String apellido1, String apellido2, String dni) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}

	public clienteDto() {
		super();
	}

}
