package com.arl.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MessageAdvice {

	@ExceptionHandler(value = Exception.class)
	private ResponseEntity<?> allMessageException(Exception exception){
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
