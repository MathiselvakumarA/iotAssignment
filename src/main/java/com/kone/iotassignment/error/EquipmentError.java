/**
 * 
 */
package com.kone.iotassignment.error;

import java.util.Date;

/**
 * @author matarumu
 *
 */
public class EquipmentError {

	private String message;
	private String details;
	private Date timestamp;
	
	/**
	 * @param message
	 * @param details
	 * @param timestamp
	 */
	public EquipmentError(String message, String details, Date timestamp) {
		super();
		this.message = message;
		this.details = details;
		this.timestamp = timestamp;
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
