/**
 * 
 */
package com.kone.iotassignment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.kone.iotassignment.utils.DateSerializer;

/**
 * @author matarumu
 *
 */

@Entity
@Table(name = "equipments")
public class Equipments {

	@Id
	@Column(name = "equipment_number")
	private Integer equipmentNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "contract_start_date")
	private Date contractStartDate;

	@Column(name = "contract_end_date")
	private Date contractEndDate;

	@Column(name = "status")
	private String status;

	/**
	 * @return the equipmentNumber
	 */
	public Integer getEquipmentNumber() {
		return equipmentNumber;
	}

	/**
	 * @param equipmentNumber
	 *            the equipmentNumber to set
	 */
	public void setEquipmentNumber(Integer equipmentNumber) {
		this.equipmentNumber = equipmentNumber;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the contractStartDate
	 */
	@JsonSerialize(using=DateSerializer.class)
	public Date getContractStartDate() {
		return contractStartDate;
	}

	/**
	 * @param contractStartDate
	 *            the contractStartDate to set
	 */
	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	/**
	 * @return the contractEndDate
	 */
	@JsonSerialize(using=DateSerializer.class)
	public Date getContractEndDate() {
		return contractEndDate;
	}

	/**
	 * @param contractEndDate
	 *            the contractEndDate to set
	 */
	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
