package com.git.main.serviceIN;

import java.util.List;

import com.git.main.model.Employee;

public interface EmplServiceIN {

	List<Employee> getAllEmpl();

	Employee saveEmpl(Employee employee);

	Employee updateEMPL(int empId, Employee employee);

	void deleteEMPL(int empId);

}
