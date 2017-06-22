package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Controle {

	private HashMap<String, Aluno> alunos = new HashMap<>();
	private HashMap<String, Grupo> grupos = new HashMap<>(); 

	public boolean cadastraAluno(String matricula, String nome, String curso)
			throws Exception {
		Aluno aluno = new Aluno(matricula, nome, curso);

		if (!verificaCadastro(aluno)) {
			alunos.put(matricula, aluno);
			return true;
		}
		return false;
	}

	public boolean criaGrupo(String nome) throws Exception {
		Grupo grupo = new Grupo(nome);
		
		if (!verificaGrupo(grupo)) {
			grupos.put(nome, grupo);
			return true;
		}
		return false;
	}

	public void alocaAluno(String grupo, String matricula) {
		if (grupos.containsValue(grupo)){
			if(alunos.containsKey(matricula)){
				Grupo.alocaAlunos();
		}else{System.out.println("");
			
		}
	}

	private boolean verificaCadastro(Object aluno) {
		return alunos.containsValue(aluno);

	}

	public String consultaAluno(String matricula) {
		Aluno cadastro = alunos.get(matricula);
		if (cadastro != null) {
			return cadastro.toString();
		}
		return "Aluno não cadastrado.";
	}
	
	private boolean verificaGrupo(Object grupo) {
		return grupos.containsValue(grupo);
	}

}
