package com.parameta.empleado.dto;

import java.io.Serializable;
import java.util.Date;
public class EmpleadoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;
	private String apellido;
	private String tDocumento;
	private String documento;
	private Date fNacimiento;
	private Date fVinculacion;
	private String cargo;
	private Double salario;
	private int edad;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String gettDocumento() {
		return tDocumento;
	}
	public void settDocumento(String tDocumento) {
		this.tDocumento = tDocumento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Date getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	public Date getfVinculacion() {
		return fVinculacion;
	}
	public void setfVinculacion(Date fVinculacion) {
		this.fVinculacion = fVinculacion;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
