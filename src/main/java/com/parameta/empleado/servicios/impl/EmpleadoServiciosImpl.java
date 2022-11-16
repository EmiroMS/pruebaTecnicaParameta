package com.parameta.empleado.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parameta.empleado.excepciones.NotFouldException;
import com.parameta.empleado.model.Empleado;
import com.parameta.empleado.repositorio.EmpleadoRepositorio;
import com.parameta.empleado.servicios.EmpleadoServicios;

@Service
public class EmpleadoServiciosImpl implements EmpleadoServicios {
	@Autowired
	private EmpleadoRepositorio empleadoRepositorio;

	@Override
	public Empleado getEmpleadoById(Long id) {
		return empleadoRepositorio.findById(id).orElseThrow(
				()-> new NotFouldException("Empleado no existe")
				);
	}

	@Override
	public List<Empleado> getAllEmpleado() {
		return empleadoRepositorio.findAll();
	}

	@Override
	public void saveEmpleado(Empleado empleado) {
		empleadoRepositorio.save(empleado);
		
	}

	@Override
	public void updateEmpleado(Long id, Empleado empleado) {
		// TODO Auto-generated method stub
		//no es necesarios en implementar segun el texto
	}

	@Override
	public void deleteEmpleadoById(Long id) {
		// TODO Auto-generated method stub
		//no es necesarios en implementar segun el texto
	}
}
