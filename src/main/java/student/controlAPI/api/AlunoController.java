package student.controlAPI.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.controlAPI.domain.Aluno;
import student.controlAPI.service.AlunoService;

@RestController
@RequestMapping("/api/v0/alunos") // revisar depois
public class AlunoController {

	@Autowired
	private AlunoService alunoService;

	@GetMapping("/lista")
	public ResponseEntity<List<Aluno>> getAlunos() {
		return new ResponseEntity<>(alunoService.getAlunos(), HttpStatus.OK);	
	}
}
