package com.testrest.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testrest.restapi.modal.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
