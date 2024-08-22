package com.testrest.restapi.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testrest.restapi.modal.Department;
import com.testrest.restapi.service.DepartmentService;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;



@RestController
public class DepartmentResource {
	DepartmentService service;
	
	public DepartmentResource(DepartmentService service) {
		this.service = service;
	}
	
	@GetMapping(value= "/departments")
	public List<Department> getAll(){
		return this.service.getAll();
	}
	
	@GetMapping(value= "/departments/{id}")
	public Department getById(@PathVariable Integer id){
		return this.service.getById(id);
	}
	
	@PostMapping(value= "/departments")
	public Department add(Department department){
		return this.service.add(department);
	}
	
	@PutMapping(value= "/department/{id}")
	public Department update(@PathVariable Integer id,@RequestBody Department department){
		return this.service.update(id,department);
	}
	
	@DeleteMapping(value= "/departments/{id}")
	public void delete(@PathVariable Integer id){
		this.service.delete(id);
	}
}
