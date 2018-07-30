package br.edu.up.vendas.tela;

import java.util.Scanner;

import br.edu.up.vendas.entidade.Cliente;

public class TelaCliente {

	Scanner sc = new Scanner(System.in);

	static Cliente[] arrayClientes = new Cliente[100];
	static long posicao = 0;

	public void mostrarTela() {

		boolean menu = true;
		while (menu == true) {
			System.out.println("");
			System.out.println("Cadastro de Clientes:");
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
				cadastrarCliente();
			} else if (opcao == 2) {
				alterarCliente();
			} else if (opcao == 3) {
				excluirCliente();
			} else if (opcao == 4) {
				listarClientes();
			} else if (opcao == 0) {
				menu = false;
				break;
			} else {
				System.out.println("Op��o inv�lida");
			}

		}
	}

	public void cadastrarCliente() {

		Cliente cliente = new Cliente();
		System.out.println("Digite o nome do Cliente:");
		cliente.setNomeCliente(sc.next());

		System.out.println("Digite o CPF :");
		cliente.setCpf(sc.next());

		System.out.println("Digite o Telefone do Cliente:");
		cliente.setTelefone(sc.next());

		cliente.setIdCliente(posicao);

		arrayClientes[(int) posicao] = cliente;
		posicao++;

		System.out.println("cadastrado com sucesso");

	}

	public void alterarCliente() {
		System.out.println("Insira o c�digo do Cliente:");
		long id = sc.nextInt();

		Cliente cliente = null;

		for (int x = 0; x < arrayClientes.length; x++) {

			Cliente p = arrayClientes[x];
			if (p != null && p.getIdCliente() == id) {
				cliente = p;
				break;
			}
		}
		if (cliente == null) {
			System.out.println("Cliente n�o encontrado");
		} else {
			System.out.println("Digite o nome do Cliente:");
			cliente.setNomeCliente(sc.next());

			System.out.println("Digite CPF do Cliente:");
			cliente.setCpf(sc.next());

			System.out.println("Digite Telefone do Cliente:");
			cliente.setTelefone(sc.next());

			System.out.println("Cliente alterado com sucesso!");
		}

	}

	public void excluirCliente() {
		System.out.println("Insira o c�digo do Cliente:");
		long id = sc.nextInt();

		for (int x = 0; x < arrayClientes.length; x++) {

			Cliente p = arrayClientes[x];
			if (p == null) {
				continue;
			}

			if (p != null && p.getIdCliente() == id) {
				arrayClientes[x] = null;
				break;
			}
		}
		System.out.println("Cliente exclu�do com sucesso");

	}

	public void listarClientes() {
		System.out.println("Lista de Clientes:");

		for (int x = 0; x < arrayClientes.length; x++) {

			Cliente cliente = arrayClientes[x];
			if (cliente == null) {
				continue;
			}
			System.out.println("id: " + cliente.getIdCliente());
			System.out.println("Nome: " + cliente.getNomeCliente());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("Telefone: " + cliente.getTelefone());
			System.out.println("");
		}
	}

}
