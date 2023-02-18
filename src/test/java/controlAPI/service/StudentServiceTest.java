package controlAPI.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import student.controlAPI.domain.Student;
import student.controlAPI.service.StudentService;

@RunWith(SpringRunner.class)
public class StudentServiceTest {

	@Autowired
	private StudentService service;
	
	@Test
	public void testSearchStudents() {
		List<Student> list = service.searchStudants();
	}
}
