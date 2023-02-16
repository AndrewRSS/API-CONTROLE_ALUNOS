package student.controlAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.controlAPI.repository.domain.AlunoDB;

public interface AlunoRepository extends JpaRepository<AlunoDB, Long>{
}
