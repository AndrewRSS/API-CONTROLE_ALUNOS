package student.controlAPI.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.controlAPI.domain.Student;
import student.controlAPI.repository.StudentRepository;
import student.controlAPI.repository.domain.StudentDB;

@Service
public class AlunoService {
	@Autowired
	private StudentRepository repo;
	
	private List<Student> studentDBToDtudentConverter(List<StudentDB> studentDB){
		List<Student> studentList = new ArrayList<Student>();
		for(StudentDB students: studentDB) {
			Student student = new Student("","","","", 0);
			student.setExternalID(students.getExternalID());
			student.setNome(students.getNome());
			student.setCurso(students.getCurso());
			student.setEndereco(students.getEndereco());
			student.setPeriodo(students.getPeriodo());
			studentList.add(student);
		}
		
		return studentList;
		
	}
	
	public List<Student> searchStudants() {
		return studentDBToDtudentConverter(repo.findAll());
	}
	
}
