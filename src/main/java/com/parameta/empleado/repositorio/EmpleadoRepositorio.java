package com.parameta.empleado.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.parameta.empleado.model.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{

}
