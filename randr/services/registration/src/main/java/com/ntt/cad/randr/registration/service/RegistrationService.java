package com.ntt.cad.randr.registration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntt.cad.randr.registration.entity.Registration;
import com.ntt.cad.randr.registration.repo.RegistrationRepo;

@Service
public class RegistrationService {

	@Autowired
	RegistrationRepo repo;
	
	public List<Registration> getAllRegistration() {
		return repo.findAll();
	}

	public Registration getRegistration(int id) {
		
		Registration reg = new Registration();
		Optional<Registration> ret = repo.findById((Integer)id);
		if (ret.isPresent())
			reg = ret.get();
		return reg;
	}

	public Registration addRegistration(Registration reg) {
		repo.save(reg);
		return reg;
	}

	public Registration updateRegistration(int regId, Registration reg) {
		Optional<Registration> registration = repo.findById((Integer)regId);
		if (registration.isPresent()) {
			reg.setId((long)regId);
			repo.save(reg);
		}
		return reg;
	}

	public Registration deleteRegistration(int id) {
		Optional<Registration> reg = repo.findById((Integer)id);
		if (reg.isPresent())
			repo.deleteById((Integer)id);
		return reg.get();
	}

}
