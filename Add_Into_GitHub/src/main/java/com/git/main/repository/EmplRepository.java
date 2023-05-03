package com.git.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.main.model.Employee;

public interface EmplRepository extends JpaRepository<Employee, Integer> {

}
