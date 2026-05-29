package com.arl.advisor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MessageAdvice {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> handleAllException(Exception exce){
		return new ResponseEntity<String>(exce.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
