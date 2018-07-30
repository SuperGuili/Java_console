package br.edu.up.vendas.tela;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Bem vindo ao Sistema de Vendas!!!");

		Scanner sc = new Scanner(System.in);

		boolean menu = true;
		while (menu == true) {
			System.out.println("");
			System.out.println("---------------------------------");
			System.out.println("MENU Principal Escolha uma op��o:");
			System.out.println("---------------------------------");
			System.out.println("1 - Produtos:");
			System.out.println("2 - Clientes:");
			System.out.println("3 - Usu�rios:");
			System.out.println("");
			System.out.println("0 - SAIR do Sistema");
			System.out.println("");

			int opcao = sc.nextInt();

			if (opcao == 1) {
				TelaProduto telaProduto = new TelaProduto();
				telaProduto.mostrarTela();

			} else if (opcao == 2) {
				TelaCliente telaCliente = new TelaCliente();
				telaCliente.mostrarTela();

			} else if (opcao == 3) {
				TelaUsuario telaUsuario = new TelaUsuario();
				telaUsuario.mostrarTela();

			} else if (opcao == 0) {
				menu = false;
				System.exit(0);
			} else {
				System.out.println("Op��o inv�lida");
			}
		}
		sc.close();
	}

}
