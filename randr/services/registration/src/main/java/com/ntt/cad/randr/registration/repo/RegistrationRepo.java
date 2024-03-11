package com.ntt.cad.randr.registration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntt.cad.randr.registration.entity.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

}
