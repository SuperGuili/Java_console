package br.edu.up.vendas.tela;

import java.util.Scanner;

import br.edu.up.vendas.entidade.Produto;

public class TelaProduto {

	Scanner sc = new Scanner(System.in);

	static Produto[] arrayProdutos = new Produto[100];
	static long posicao = 0;

	public void mostrarTela() {

		boolean menu = true;
		while (menu == true) {
			System.out.println("");
			System.out.println("Cadastro de Produtos:");
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
				cadastrarProduto();
			} else if (opcao == 2) {
				alterarProduto();
			} else if (opcao == 3) {
				excluirProduto();
			} else if (opcao == 4) {
				listarProdutos();
			} else if (opcao == 0) {
				menu = false;
				break;
			} else {
				System.out.println("Op��o inv�lida");
			}
		}
	}

	public void cadastrarProduto() {

		Produto produto = new Produto();

		System.out.println("Digite o nome do Produto:");
		produto.setNomeProduto(sc.next());

		System.out.println("Digite Pre�o do Produto:");
		produto.setPrecoProduto(sc.nextDouble());

		System.out.println("Digite a quantidade do Produto:");
		produto.setQuantidadeProduto(sc.nextInt());
		produto.setIdProduto(posicao);

		arrayProdutos[(int) posicao] = produto;
		posicao++;
		System.out.println("Produto cadastrado com sucesso!");

	}

	public void alterarProduto() {

		System.out.println("Insira o ID do Produto:");
		long id = sc.nextInt();

		Produto produto = null;

		for (int x = 0; x < arrayProdutos.length; x++) {

			Produto p = arrayProdutos[x];

			if (p != null && p.getIdProduto() == id) {
				produto = p;
				break;
			}
		}
		if (produto == null) {
			System.out.println("Produto n�o encontrado");
		} else {
			System.out.println("Digite o nome do Produto:");
			produto.setNomeProduto(sc.next());

			System.out.println("Digite Pre�o do Produto:");
			produto.setPrecoProduto(sc.nextDouble());

			System.out.println("Digite a quantidade do Produto:");
			produto.setQuantidadeProduto(sc.nextInt());

			System.out.println("Produto alterado com sucesso!");
		}

	}

	public void excluirProduto() {

		System.out.println("Insira o ID do Produto:");
		long id = sc.nextInt();

		for (int x = 0; x < arrayProdutos.length; x++) {

			Produto p = arrayProdutos[x];
			if (p == null) {
				continue;
			}

			if (p != null && p.getIdProduto() == id) {
				arrayProdutos[x] = null;
				break;
			}
		}
		System.out.println("exclu�do com sucesso");

	}

	public void listarProdutos() {
		System.out.println("Lista de Produtos:");
		for (int x = 0; x < arrayProdutos.length; x++) {

			Produto produto = arrayProdutos[x];
			if (produto == null) {
				continue;
			}
			System.out.println("id: " + produto.getIdProduto());
			System.out.println("Nome: " + produto.getNomeProduto());
			System.out.println("Pre�o: " + produto.getPrecoProduto());
			System.out.println("Quantidade: " + produto.getQuantidadeProduto());
			System.out.println("");
		}
	}
}
