package student.controlAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.controlAPI.repository.domain.StudentDB;

@Repository
public interface StudentRepository extends JpaRepository<StudentDB, Long>{
}
