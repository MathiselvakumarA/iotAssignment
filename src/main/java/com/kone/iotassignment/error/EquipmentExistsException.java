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
@ResponseStatus(HttpStatus.IM_USED)
public class EquipmentExistsException extends RuntimeException {

	/**
	 * Default serialUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	private String details;
	private Date timestamp;

	/**
	 * Constructor
	 */
	public EquipmentExistsException() {
		this.message = "Equipment Exists";
		this.details = "The Equipment for the given equipment number already exists!";
		this.timestamp = new Date();
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
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
