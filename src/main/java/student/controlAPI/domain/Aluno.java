package student.controlAPI.domain;

import java.util.UUID;

public class Aluno {
	
	public Aluno(UUID externalID, String nome, String endereco, String curso, int periodo) {
		this.externalID = externalID;
		this.nome = nome;
		this.endereco = endereco;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	private UUID externalID;
	private String nome;
	private String endereco;
	private String curso;
	private int periodo;
	
	public UUID getExternalID() {
		return externalID;
	}
	public void setExternalID(UUID externalID) {
		this.externalID = externalID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	

}