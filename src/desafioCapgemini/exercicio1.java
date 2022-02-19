//Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
package desafioCapgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// Lista onde o array ser� adicionado
		List<String> x = new ArrayList<>();

		// Solicitando um n�mero para o usu�rio
		System.out.print("Digite um n�mero: ");
		int n = scan.nextInt();

		// La�o de repeti��o for e adicionando ao arraylist 
		for (int i = 0; i < n; i++) {
			x.add(" ".repeat(n - i) + "*".repeat(i + 1));
		}

		// Imprimindo o arraylist x
		for (String imprimir : x) {
			System.out.println(imprimir);
		}
	}

}