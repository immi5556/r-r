package com.ntt.cad.randr.registration.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntt.cad.randr.registration.entity.Registration;
import com.ntt.cad.randr.registration.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	RegistrationService service;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Registration>> getAllRegistration() {
		List<Registration> retList = service.getAllRegistration();
		return new ResponseEntity<List<Registration>>(retList, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Registration> getRegistration(@PathVariable("id") int id) {
		Registration ret = service.getRegistration(id);
		return new ResponseEntity<Registration>(ret, HttpStatus.OK);
	}
		
	@PostMapping("/save")
	public ResponseEntity<Registration> saveRegistration(@RequestBody Registration reg) {
		service.addRegistration(reg);
		return new ResponseEntity<Registration>(reg,HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Registration> updateRegistration(@RequestBody Registration reg, @PathVariable("id") int id) {
		service.updateRegistration(id, reg);
		return new ResponseEntity<Registration>(reg,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Registration> updateRegistration(@PathVariable("id") int id) {
		Registration reg = service.deleteRegistration(id);
		return new ResponseEntity<Registration>(reg,HttpStatus.NO_CONTENT);
	}
}
