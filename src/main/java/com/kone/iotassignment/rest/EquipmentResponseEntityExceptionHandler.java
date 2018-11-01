/**
 * 
 */
package com.kone.iotassignment.rest;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.kone.iotassignment.error.EquipmentError;
import com.kone.iotassignment.error.EquipmentExistsException;
import com.kone.iotassignment.error.EquipmentNotExistsException;

/**
 * @author matarumu
 *
 */

@ControllerAdvice
@RestController
public class EquipmentResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EquipmentExistsException.class)
	public final ResponseEntity<EquipmentError> handleEquipmentExists(EquipmentExistsException ex){
		EquipmentError errorDetails = new EquipmentError(ex.getMessage(), ex.getDetails(), ex.getTimestamp());
		return new ResponseEntity<>(errorDetails, HttpStatus.IM_USED);
	}
	
	@ExceptionHandler(EquipmentNotExistsException.class)
	public final ResponseEntity<EquipmentError> handleEquipmentNotExists(EquipmentNotExistsException ex){
		EquipmentError errorDetails = new EquipmentError(ex.getMessage(), ex.getDetails(), ex.getTimeStamp());
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public final ResponseEntity<EquipmentError> handleInvalidArguments(MethodArgumentTypeMismatchException ex){
		EquipmentError errorDetails = new EquipmentError("Expected Integer","Equipment number or limit to search equipments should be Integer",new Date());
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_ACCEPTABLE);
	}
}
