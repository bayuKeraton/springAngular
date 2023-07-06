package tech.getarrays.springangular.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.springangular.model.Employee;

import java.util.Optional;

public interface Employeerepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
