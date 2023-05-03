package com.git.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.git.main.model.Employee;
import com.git.main.serviceIN.EmplServiceIN;
@RestController
public class HomeController {

	@Autowired
	EmplServiceIN serviceIN;
	
	@GetMapping("/empls")
	public ResponseEntity<List<Employee>> getEmpl() {

		return  new ResponseEntity<List<Employee>>(serviceIN.getAllEmpl(),HttpStatus.OK) ;
	}
	
	@PostMapping("/empl")
	public ResponseEntity<Employee> createEmpl(@RequestBody Employee employee){
		
		return new ResponseEntity<Employee>(serviceIN.saveEmpl(employee),HttpStatus.CREATED);
	}
	
	@PutMapping("/empl/{empId}")
	public ResponseEntity<Employee> update(@PathVariable int empId,@RequestBody Employee employee){
		
		return new ResponseEntity<Employee>(serviceIN.updateEMPL(empId,employee),HttpStatus.OK);
	}
	
	@DeleteMapping("/empl/{empId}")
	public ResponseEntity delete(@PathVariable int empId){
		
		serviceIN.deleteEMPL(empId);
		
		return new ResponseEntity( HttpStatus.NO_CONTENT);
	}

}
