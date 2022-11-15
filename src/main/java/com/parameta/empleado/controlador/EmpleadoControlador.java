package com.parameta.empleado.controlador;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parameta.empleado.model.Empleado;
import com.parameta.empleado.servicios.EmpleadoServicios;

@RestController
@RequestMapping("/api")
public class EmpleadoControlador {
	
	@Autowired
	private EmpleadoServicios empleadoServicios;
	
	private Map<String,Object>response = new HashMap<>();
	
	@GetMapping("/empleados")
	private ResponseEntity<?> findAllEmpleado(){
		response.clear();
		response.put("empleados", empleadoServicios.getAllEmpleado());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("empleados/{id}")
	private ResponseEntity<?> getEmpleadoById(@PathVariable Long id){
		response.clear();
		response.put("empleado", empleadoServicios.getEmpleadoById(id));
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@PostMapping("empleados")
	private ResponseEntity<?> saveEmpleado(@RequestBody Empleado empleado){
		response.clear();
		empleadoServicios.saveEmpleado(empleado);
		response.put("empleado", "guardado exitoso");
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
}
