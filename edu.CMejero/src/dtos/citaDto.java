package dtos;

import java.time.LocalDateTime;

public class citaDto {

	long idCita;
	LocalDateTime citaPsicologia;
	LocalDateTime citaTraumatologia;
	LocalDateTime citaFisioterapia;
	String nombreCompletoCliente = "aaaaa";
	String dniCliente = "aaaaa";
	String Especialidad = "aaaaa";

	public long getIdCita() {
		return idCita;

	}

	public void setIdCita(long idCita) {
		this.idCita = idCita;
	}

	public LocalDateTime getCitaPsicologia() {
		return citaPsicologia;
	}

	public void setCitaPsicologia(LocalDateTime citaPsicologia) {
		this.citaPsicologia = citaPsicologia;
	}

	public LocalDateTime getCitaTraumatologia() {
		return citaTraumatologia;
	}

	public void setCitaTraumatologia(LocalDateTime citaTraumatologia) {
		this.citaTraumatologia = citaTraumatologia;
	}

	public LocalDateTime getCitaFisioterapia() {
		return citaFisioterapia;
	}

	public void setCitaFisioterapia(LocalDateTime citaFisioterapia) {
		this.citaFisioterapia = citaFisioterapia;
	}

	public String getNombreCompletoCliente() {
		return nombreCompletoCliente;
	}

	public void setNombreCompletoCliente(String nombreCompletoCliente) {
		this.nombreCompletoCliente = nombreCompletoCliente;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}

	public citaDto() {
		super();
	}

	public citaDto(long idCita, LocalDateTime citaPsicologia, LocalDateTime citaTraumatologia,
			LocalDateTime citaFisioterapia, String nombreCompletoCliente, String dniCliente, String especialidad) {
		super();
		this.idCita = idCita;
		this.citaPsicologia = citaPsicologia;
		this.citaTraumatologia = citaTraumatologia;
		this.citaFisioterapia = citaFisioterapia;
		this.nombreCompletoCliente = nombreCompletoCliente;
		this.dniCliente = dniCliente;
		Especialidad = especialidad;
	}

}
