package student.controlAPI.repository.domain;

import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.*;

@Entity(name="alunos")
public class StudentDB {
	
	public StudentDB(){
		super();
	}
	
	public StudentDB(Long id, Timestamp created_at ,String externalID, String nome, String endereco, String curso, int periodo) {
		this.id = id;
		this.createdAt = created_at;
		this.externalID = externalID;
		this.nome = nome;
		this.endereco = endereco;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "created_at")
	private Timestamp createdAt;
	
	@Column(name = "external_id")
	private String externalID;
	
	private String nome;
	private String endereco;
	private String curso;
	private int periodo;
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public String getExternalID() {
		return externalID;
	}
	public void setExternalID(String externalID) {
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