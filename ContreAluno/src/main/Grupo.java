package main;

import java.util.HashSet;
import java.util.Set;

public class Grupo {
	
	private String nome;
	private Set<Aluno> alunos = new HashSet<>();
	public Grupo(String nome) throws Exception{
		if(nome == null || nome.equals("")){
			throw new Exception ("Nome do grupo nao pode ser null nem vazio.");
		}
		this.nome = nome;
	
	}
	public static void alocaAlunos(String grupo, String matricula) {
	//	grupo.add()
	}
	

}
