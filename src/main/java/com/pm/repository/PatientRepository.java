package com.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pm.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,String > {

	
	boolean existsByEmail(String email);
	Patient findByEmail(String email);
}
