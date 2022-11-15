package com.parameta.empleado.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="t_empleados")
public class Empleado {	
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		@NotBlank(message = "el nombre no puede estar vacio")
		@Column(name="nombre",length=60)
		private String nombre;

		@NotNull
		@NotBlank(message = "el apellido no puede estar vacio")
		@Column(name="apellido",length=60)
		private String apellido;
		
		@NotNull
		@NotBlank(message = "el tipo de documento no puede estar vacio")
		@Column(name="tdocumento",length=60,nullable=false)
		private String tDocumento;
		
		@NotNull
		@NotBlank(message = "el documento no puede estar vacio")
		@Column(name="documento",length=60,unique=true)
		private String documento;
		
		@DateTimeFormat(pattern="yyyy/MM/dd")
		@NotNull
		@Column(name="fnacimiento")
		private Date fNacimiento;
		
		@DateTimeFormat(pattern="yyyy/MM")
		@NotNull
		@Column(name="fvinculacion")
		private Date fVinculacion;
		
		@NotNull
		@NotBlank(message = "el cargo no puede estar vacio no puede estar vacio")
		@Column(name="cargo")
		private String cargo;
		
		@NotNull
		@Column(name="salario",length=60)
		private Double salario;

		public Empleado() {
			super();
		}

		public Empleado(Long id, @NotNull @NotBlank(message = "el nombre no puede estar vacio") String nombre,
				@NotNull @NotBlank(message = "el apellido no puede estar vacio") String apellido,
				@NotNull @NotBlank(message = "el tipo de documento no puede estar vacio") String tDocumento,
				@NotNull @NotBlank(message = "el documento no puede estar vacio") String documento,
				@NotNull Date fNacimiento, @NotNull Date fVinculacion,
				@NotNull @NotBlank(message = "el cargo no puede estar vacio no puede estar vacio") String cargo,
				@NotNull Double salario) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.tDocumento = tDocumento;
			this.documento = documento;
			this.fNacimiento = fNacimiento;
			this.fVinculacion = fVinculacion;
			this.cargo = cargo;
			this.salario = salario;
		}

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
		
		
}
