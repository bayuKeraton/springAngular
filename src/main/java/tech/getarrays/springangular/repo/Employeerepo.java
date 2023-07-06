package tech.getarrays.springangular.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.springangular.model.Employee;

public interface Employeerepo extends JpaRepository<Employee, Long> {
}
