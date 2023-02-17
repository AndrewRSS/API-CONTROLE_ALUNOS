package student.controlAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.controlAPI.repository.domain.StudentDB;

public interface StudentRepository extends JpaRepository<StudentDB, Long>{
}
