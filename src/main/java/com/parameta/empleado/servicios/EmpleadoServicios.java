package com.parameta.empleado.servicios;

import java.util.List;

import com.parameta.empleado.model.Empleado;

public interface EmpleadoServicios {

	Empleado getEmpleadoById(Long id);
	List<Empleado>getAllEmpleado();
	void saveEmpleado(Empleado empleado);
	void updateEmpleado(Long id, Empleado empleado);
	void deleteEmpleadoById(Long id);
}
