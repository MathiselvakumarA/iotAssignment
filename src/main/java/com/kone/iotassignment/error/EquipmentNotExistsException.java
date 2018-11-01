/**
 * 
 */
package com.kone.iotassignment.error;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author matarumu
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EquipmentNotExistsException extends RuntimeException {

	/**
	 * Default serialUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	private String details;
	private Date timeStamp;
	
	/**
	 * Constructor
	 */
	public EquipmentNotExistsException() {
		this.message = "Equipment Not found";
		this.details = "No equipment found for the given equipment number!";
		this.timeStamp = new Date();
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * @return the timeStamp
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}
