package tech.getarrays.springangular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.springangular.model.Employee;
import tech.getarrays.springangular.repo.Employeerepo;

import java.util.UUID;

@Service
public class EmployeeService {
    private final Employeerepo employeeRepo;

    @Autowired
    public EmployeeService(Employeerepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

}
