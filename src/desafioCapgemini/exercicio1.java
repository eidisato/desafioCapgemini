package desafioCapgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// Lista onde o array será adicionado
		List<String> x = new ArrayList<>();

		// Solicitando um número para o usuário
		System.out.print("Digite um número: ");
		int n = scan.nextInt();

		// Laço de repetição for e adicionando ao arraylist 
		for (int i = 0; i < n; i++) {
			x.add(" ".repeat(n - i) + "*".repeat(i + 1));
		}

		// Imprimindo o arraylist x
		for (String imprimir : x) {
			System.out.println(imprimir);
		}
	}

}