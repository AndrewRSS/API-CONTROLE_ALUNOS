package student.controlAPI.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0")
public class IndexController {
	
	private static final String welcome = "Bem vindo a API de controle de Alunos, segue o link da documentação ...";
	
	@GetMapping
	public String Welcome() {
		return welcome;
	}
}
