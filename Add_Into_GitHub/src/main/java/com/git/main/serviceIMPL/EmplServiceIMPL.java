package com.git.main.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.main.model.Employee;
import com.git.main.repository.EmplRepository;
import com.git.main.serviceIN.EmplServiceIN;

@Service
public class EmplServiceIMPL implements EmplServiceIN {

	@Autowired
	EmplRepository emplRepository;

	@Override
	public List<Employee> getAllEmpl() {

		return emplRepository.findAll();
	}

	@Override
	public Employee saveEmpl(Employee employee) {

		return emplRepository.save(employee);
	}

	@Override
	public Employee updateEMPL(int empId, Employee employee) {

		Optional<Employee> findById = emplRepository.findById(empId);

		if (findById.isPresent()) {
			employee.setEmpId(findById.get().getEmpId());
			return emplRepository.save(employee);
		} else {
			return new Employee();
		}
	}

	@Override
	public void deleteEMPL(int empId) {
		Optional<Employee> findById = emplRepository.findById(empId);

		if (findById.isPresent()) {
			
			emplRepository.deleteById(findById.get().getEmpId());
			
		} else {
			 
		}
	}

}
