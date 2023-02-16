package student.controlAPI.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.controlAPI.domain.Aluno;
import student.controlAPI.repository.AlunoRepository;
import student.controlAPI.repository.domain.AlunoDB;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository repo;
	
	private List<Aluno> conversorAlunoDBforAluno(List<AlunoDB> alunoDB){
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		for(AlunoDB alunos: alunoDB) {
			Aluno aluno = new Aluno(UUID.fromString(""),"","","", 0);
			aluno.setExternalID(alunos.getExternalID());
			aluno.setNome(alunos.getNome());
			aluno.setCurso(alunos.getCurso());
			aluno.setEndereco(alunos.getEndereco());
			aluno.setPeriodo(alunos.getPeriodo());
			listaAlunos.add(aluno);
		}
		
		return listaAlunos;
		
	}
	
	public List<Aluno> getAlunos() {
		return conversorAlunoDBforAluno(repo.findAll());
	}
	
}
