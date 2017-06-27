package main;

import java.util.Scanner;

public class Menu {

	private static Scanner sc = new Scanner(System.in);
	private Controle controle = new Controle();
	private final String LN = System.lineSeparator();

	public String exibeMenu() {

		return "(C)adastrar Aluno" + LN + "(E)xibir Alno" + LN + "(N)ovo Aluno"
				+ LN + "(A)locar Aluno no Grupo" + LN
				+ "(R)egistrar Resposta de Aluno" + LN
				+ "(I)mprimir Alunos que Responderam" + LN
				+ "(O)ra, vamos fechar o programa!" + LN + LN + LN + "Opção> ";
	}

	public void processaOpcoes() throws Exception {

		Boolean sair = false;

		while (sair != true) {
			System.out.print(exibeMenu());
			String opcao = sc.nextLine().toUpperCase();

			switch (opcao) {
			case "C":
				cadastrar();

				break;

			case "E":
				consultaAluno();

				break;

			case "N":
				criarGrupo();

				break;

			case "A":
				alocarAluno();

				break;

			case "R":
				registraResposta();

				break;

			case "I":
				imprimirAlunos();

				break;

			case "O":
				sair = true;

				break;

			default:
				System.out.print("OPÇÃO INVÁLIDA!" + LN);
			}

		}
	}

	private void imprimirAlunos() {
		// TODO Auto-generated method stub

	}

	private void registraResposta() {
		// TODO Auto-generated method stub

	}

	private void alocarAluno() {
		System.out.println("(A)locar Aluno ou (I)mprimir Grupo? ");
		String opcao = sc.nextLine();
		if(opcao.equalsIgnoreCase("A")){
			System.out.println("Matricula: ");
			String matricula = sc.nextLine();
			System.out.println("Grupo: ");
			String grupo = sc.nextLine();
			controle.alocaAluno(grupo, matricula);
		}else{
			System.out.println("Grupo: ");
			String grupo = sc.nextLine();
			controle.imprimirGrupo(grupo);
		}

	}

	private void criarGrupo() throws Exception {
		System.out.print("Grupo: ");
		String nome = sc.nextLine().toUpperCase();
		if (controle.criaGrupo(nome)) {
			System.out.println("CADASTRO REALIZADO!" + LN);
		} else {
			System.out.println("GRUPO JÁ CADASTRADO!" + LN);
		}
	}

	private void consultaAluno() {
		System.out.print("Matricula: ");
		String matricula = sc.nextLine();
		System.out.print(controle.consultaAluno(matricula) + LN);
	}

	private void cadastrar() throws Exception {
		System.out.print("Matricula: ");
		String matricula = sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Curso: ");
		String curso = sc.nextLine();
		if (controle.cadastraAluno(matricula, nome, curso)) {
			System.out.println("CADASTRO REALIZADO!" + LN);
		} else {
			System.out.println("MATRICULA JA CADASTRADA!" + LN);

		}

	}
}
