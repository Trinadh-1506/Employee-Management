package net.trinadh.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.trinadh.springboot.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}