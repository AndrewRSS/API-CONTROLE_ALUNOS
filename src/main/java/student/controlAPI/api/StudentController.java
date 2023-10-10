package student.controlAPI.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.controlAPI.domain.Student;
import student.controlAPI.service.StudentService;

@RestController
@RequestMapping("/api/v0/student") // revisar depois
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/list")
	public ResponseEntity<List<Student>> getStudents() {
		return new ResponseEntity<>(studentService.searchStudents(), HttpStatus.OK);	
	}
}
