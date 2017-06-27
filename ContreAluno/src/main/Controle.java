package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Controle {

	private HashMap<String, Aluno> alunos = new HashMap<>();
	private HashMap<String, Grupo> grupos = new HashMap<>(); 

	public boolean cadastraAluno(String matricula, String nome, String curso)
			throws Exception {
		Aluno aluno = new Aluno(matricula, nome, curso);

		if (verificaCadastro(matricula)) {
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

	public String alocaAluno(String grupo, String matricula) {
		if (verificaCadastro(matricula)) {
			if (grupos.containsValue(grupo)) {
				Grupo.alocaAlunos(grupo, matricula);
			} else {
				return "Grupo nao criado.";
			}
		}
		return "Aluno nao cadastrado.";
	}

	private boolean verificaCadastro(String matricula) {
		if (!alunos.containsKey(matricula)){
			return true;
		}
		return false;
	}
	

	public String consultaAluno(String matricula) {
		Aluno cadastro = alunos.get(matricula);
		if (alunos.containsKey(matricula)) {
			return cadastro.toString();
		}
		return "Aluno não cadastrado.";
	}
	
	private boolean verificaGrupo(Object grupo) {
		if (grupos.containsValue(grupo)){
		return true;
		}
		return false;
	}

	public void imprimirGrupo(String grupo) {
		if(verificaGrupo(grupo)){
			grupos.get(grupo).toString();
			
		}
	}

}
