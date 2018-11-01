/**
 * 
 */
package com.kone.iotassignment.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kone.iotassignment.entity.Equipments;
import com.kone.iotassignment.error.EquipmentExistsException;
import com.kone.iotassignment.error.EquipmentNotExistsException;
import com.kone.iotassignment.service.EquipmentsService;

/**
 * @author matarumu
 *
 */

@RestController
@RequestMapping(value="/equipmentsService")
public class EquipmentsController {
	
	@Autowired
	EquipmentsService equipmentsService;

	@PostMapping(value="/equipment")
	public List<Equipments> saveEquipments(@RequestBody Equipments equipment) throws EquipmentExistsException{
	
		if(!equipmentsService.doesEquipmentExists(equipment.getEquipmentNumber())){
			return equipmentsService.insertEquipments(equipment);
		}
		else{
			throw new EquipmentExistsException();
		}
	}
	
	@GetMapping(value="/equipment/{equipmentNumber}")
	public Equipments getEquipmentsByNumber(@PathVariable Integer equipmentNumber){
		
		Equipments equipmentReturned = equipmentsService.getEquipmentById(equipmentNumber);
		
		if(equipmentReturned == null){
			throw new EquipmentNotExistsException();
		}
		else{
			return equipmentReturned;
		}
	}
	
	@GetMapping(value="/equipment/search")
	public List<Equipments> searchEquipmentsByLimit(@RequestParam("limit") Integer limit){
		
		Page<Equipments> page = equipmentsService.searchEquipmentsByLimit(limit);
		return page.getContent();
	}
	
	@DeleteMapping(value="/equipment/delete/{equipmentNumber}")
	public String deleteEquipment(@PathVariable Integer equipmentNumber){
		
		if(equipmentsService.doesEquipmentExists(equipmentNumber)){
			equipmentsService.deleteEquipment(equipmentNumber);
			return "Equipment deleted successfully";
		}
		else{
			throw new EquipmentNotExistsException();
		}
	}
}
