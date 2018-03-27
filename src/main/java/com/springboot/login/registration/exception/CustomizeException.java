package com.springboot.login.registration.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice




public class CustomizeException 
extends ResponseEntityExceptionHandler{
@ExceptionHandler(Exception.class)	
 public final ResponseEntity<Object> handleGernal(Exception ex , WebRequest request){
	 ExceptionResponce obj = 
			 new ExceptionResponce (new Date() ,"Login Failed", request.getDescription(false));
	 return new ResponseEntity(obj,HttpStatus.NOT_FOUND);
 }
}
