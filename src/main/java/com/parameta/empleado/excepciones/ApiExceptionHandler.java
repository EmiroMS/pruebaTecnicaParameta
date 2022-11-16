package com.parameta.empleado.excepciones;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

	
	private Map<String,Object> response = new HashMap();
	
	@ExceptionHandler(NotFouldException.class)
	public ResponseEntity<?> notFoulException(NotFouldException nfe){
		
		response.clear();
		response.put("error", nfe.getMessage());
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		response.clear();
		List<String> errors = ex.getBindingResult().getFieldErrors().stream()
				.map(err -> err.getField().concat(" ").concat(err.getDefaultMessage()))
				.collect(Collectors.toList());
		response.put("errors", errors);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	
}
