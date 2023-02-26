package controlAPI.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import student.controlAPI.domain.Student;
import student.controlAPI.repository.StudentRepository;
import student.controlAPI.repository.domain.StudentDB;
import student.controlAPI.service.StudentService;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {
	
    @Mock
    private StudentRepository repository;
	
    @InjectMocks
    private StudentService service;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    public void searchStudents() {
    	int ano = 2023;
    	int mes = 2;
    	int dia = 25;
    	Timestamp time = Timestamp.valueOf(String.format("%04d-%02d-%02d 00:00:00",ano, mes, dia));
    	StudentDB studentDB = new StudentDB(1l, time, "2d859947-b451-4cc8-bd4b-11669921b04c", "Joao", "Avenida", "ADS", 1);
    	List<StudentDB> listStudentDB = new ArrayList<StudentDB>();
    	listStudentDB.add(studentDB);
    	
    	when(repository.findAll()).thenReturn(listStudentDB);
    	
    	Student student = new Student( "2d859947-b451-4cc8-bd4b-11669921b04c", "Joao", "Avenida", "ADS", 1);    	
    	List<Student> listStudent = new ArrayList<Student>();
    	listStudent.add(student);
    	
    	List<Student> expected = service.searchStudents();
    	
    	for (int i = 0; i < expected.size(); i++) {
    		assertEquals(listStudent.get(i).getExternalID(), listStudentDB.get(i).getExternalID());
    	}
    }   
}
 
