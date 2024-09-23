package aplicacoes;

import java.util.Scanner;

import arvores.AVLINT;

public class Menu {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		AVLINT avl = new AVLINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - inserir");
			System.out.println("2 - Apresentar FB de cada no da AVL");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrado o programa");
				break;
			case 1:
				System.out.println("Informa o valor do dado a ser inserido: ");
				int valor = le.nextInt();
				avl.root = avl.inserirH(avl.root, valor);
				break;
			case 2:
				System.out.println("\n*** Apresentação de FB dos nos AVL");
				avl.mostrarFB(avl.root);
				break;
				default:
					System.out.println("opção invalida");
			}
		}while (opcao != 0);
		le.close();

	}

}

