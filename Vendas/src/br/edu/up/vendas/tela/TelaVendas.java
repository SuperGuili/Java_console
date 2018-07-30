package br.edu.up.vendas.tela;

import java.util.Scanner;

import br.edu.up.vendas.entidade.Cliente;
import br.edu.up.vendas.entidade.Venda;

public class TelaVendas {

	Scanner sc = new Scanner(System.in);

	static Venda[] arrayVendas = new Venda[100];
	static long posicaoVenda = 0;

	/*
	 * public void mostrarTela() {
	 * 
	 * boolean menu = true; while (menu == true) { System.out.println("");
	 * System.out.println("Cadastro de Produtos:"); System.out.println("");
	 * System.out.println("Digite a op��o desejada:"); System.out.println("");
	 * System.out.println("1 - Casdastrar:"); System.out.println("2 - Alterar:");
	 * System.out.println("3 - Excluir:"); System.out.println("4 - Listar:");
	 * System.out.println("0 - Voltar ao MENU Principal:"); System.out.println("");
	 * 
	 * int opcao = sc.nextInt();
	 * 
	 * if (opcao == 1) { cadastrarProduto(); } else if (opcao == 2) {
	 * alterarProduto(); } else if (opcao == 3) { excluirProduto(); } else if (opcao
	 * == 4) { listarProdutos(); } else if (opcao == 0) { menu = false; break; }
	 * else { System.out.println("Op��o inv�lida"); } }
	 */// menu

	public void cadastrarVenda() {

		Venda venda = new Venda();
		
		venda.setIdVenda(posicaoVenda);
		System.out.println("Digite a DATA:");
		venda.setDataVenda(sc.next());
		System.out.println("Digite o ID do Cliente:");
		venda.setFkCliente(sc.nextLong());


		System.out.println("Digite a quantidade do Produto:");
		venda.setQuantidade(sc.nextInt());
			
			

		//arrayProdutosVenda[(int) posicaoProduto] = produto;
		//posicaoProduto++;
		System.out.println("Produto adicionado com sucesso!");
		//System.out.println("Digite o ID do Produto:");
		//venda.setFkProduto(sc.nextLong());

	}
	
	
	
}
