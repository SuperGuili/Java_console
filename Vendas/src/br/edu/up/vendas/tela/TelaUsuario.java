package br.edu.up.vendas.tela;

import java.util.Scanner;

import br.edu.up.vendas.entidade.Usuario;

public class TelaUsuario {
	Scanner sc = new Scanner(System.in);

	static Usuario[] arrayUsuarios = new Usuario[100];
	static long posicao = 0;

	public void mostrarTela() {

		boolean menu = true;
		while (menu == true) {
			System.out.println("");
			System.out.println("Cadastro de Usu�rios:");
			System.out.println("");
			System.out.println("Digite a op��o desejada:");
			System.out.println("");
			System.out.println("1 - Casdastrar:");
			System.out.println("2 - Alterar:");
			System.out.println("3 - Excluir:");
			System.out.println("4 - Listar:");
			System.out.println("0 - Voltar ao MENU Principal:");
			System.out.println("");

			int opcao = sc.nextInt();

			if (opcao == 1) {
				cadastrarUsuario();
			} else if (opcao == 2) {
				alterarUsuario();
			} else if (opcao == 3) {
				excluirUsuario();
			} else if (opcao == 4) {
				listarUsuarios();
			} else if (opcao == 0) {
				menu = false;
				break;
			}

			else {
				System.out.println("Op��o inv�lida");
			}

		}
	}

	public void cadastrarUsuario() {

		Usuario usuario = new Usuario();

		System.out.println("Digite o nome do Usu�rio:");
		usuario.setNomeUsuario(sc.next());

		System.out.println("Digite o Login :");
		usuario.setLogin(sc.next());

		System.out.println("Digite a senha:");
		usuario.setSenha(sc.next());

		usuario.setIdUsuario(posicao);

		arrayUsuarios[(int) posicao] = usuario;
		posicao++;

		System.out.println("Usuário cadastrado com sucesso:");

	}

	public void alterarUsuario() {
		System.out.println("Insira o c�digo do Usu�rio:");
		long id = sc.nextInt();

		Usuario usuario = null;

		for (int x = 0; x < arrayUsuarios.length; x++) {

			Usuario p = arrayUsuarios[x];
			if (p != null && p.getIdUsuario() == id) {
				usuario = p;
				break;
			}
		}
		if (usuario == null) {
			System.out.println("Usuário n�o encontrado");
		} else {
			System.out.println("Digite o nome do Usuário:");
			usuario.setNomeUsuario(sc.next());

			System.out.println("Digite o login do Usuário:");
			usuario.setLogin(sc.next());

			System.out.println("Digite a senha do Usuário:");
			usuario.setSenha(sc.next());

			System.out.println("Usuário alterado com sucesso!");
		}
	}

	public void excluirUsuario() {
		System.out.println("Insira o c�digo do Usu�rio:");

		long id = sc.nextInt();

		for (int x = 0; x < arrayUsuarios.length; x++) {

			Usuario p = arrayUsuarios[x];
			if (p == null) {
				continue;
			}

			if (p != null && p.getIdUsuario() == id) {
				arrayUsuarios[x] = null;
				break;
			}
		}
		System.out.println("Usuario exclu�do com sucesso");

	}

	public void listarUsuarios() {
		System.out.println("Lista de Usu�rios:");

		for (int x = 0; x < arrayUsuarios.length; x++) {

			Usuario p = arrayUsuarios[x];
			if (p == null) {
				continue;
			}
			System.out.println("id: " + p.getIdUsuario());
			System.out.println("Nome: " + p.getNomeUsuario());
			System.out.println("Login: " + p.getLogin());
			System.out.println("Senha: " + p.getSenha());
			System.out.println("");
		}
	}

}
