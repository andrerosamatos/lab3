package main;

public class Aluno {
	

	private String matricula;
	private String nome;
	private String curso;
	
	public Aluno(String matricula, String nome, String curso)
		throws Exception{
		if(matricula == null || matricula.equals("")){
			throw new Exception ("Matricula nao pode ser null nem vazia.");
		}
		if(nome == null || nome.equals("")){
			throw new Exception ("Nome nao pode ser null nem vazio.");
		}
		if(curso == null || curso.equals("")){
			throw new Exception ("Curso nao opde ser null nem vazio.");
		}
		
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getCurso() {
		return curso;
	}
	
	@Override
	public String toString() {
		return "Aluno: " + matricula + " - " +  nome + " - " + curso;
	}
		
	
}
