package com.testrest.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.testrest.restapi.modal.Department;
import com.testrest.restapi.repository.DepartmentRepository;

@Service
public class DepartmentService {

	DepartmentRepository repository;
	
	public DepartmentService(DepartmentRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Department> getAll(){
		return this.repository.findAll();
	}
	
	public Department getById(Integer id) {
		return this.repository.findById(id).get();
	}
	
	public Department add(Department department) {
		return this.repository.save(department);
	}
	
	public Department update(Integer id, Department department){
		Optional<Department> dept = this.repository.findById(id);
		if(dept.isPresent()) {
			dept.get().setName(department.getName());
			return this.repository.save(dept.get());
		}
		 throw new RuntimeException();
	}
	
	public void delete(Integer id){
		this.repository.deleteById(id);
	}
	
}
