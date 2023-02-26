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
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public List<Student> studentDBToDtudentConverter(List<StudentDB> studentDB){
		List<Student> studentList = new ArrayList<Student>();
		for(StudentDB students: studentDB) {
			Student student = new Student(students.getExternalID(),students.getNome(),students.getCurso(),students.getEndereco(), students.getPeriodo());
			studentList.add(student);
		}
		
		return studentList;
		
	}
	
	public List<Student> searchStudents() {
		List<StudentDB> studentDBList = repo.findAll();
		
		return studentDBToDtudentConverter(studentDBList);
	}
	
}
