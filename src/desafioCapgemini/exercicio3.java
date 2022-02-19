/*
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. 
 * Dada uma string qualquer, desenvolva um algoritmo que encontre o n�mero de pares de substrings que s�o anagramas.
 */
package desafioCapgemini;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String palavra;

		System.out.println("Digite uma palavra");
		palavra = scan.nextLine();

		// Lista onde as letras ser�o adicionadas
		ArrayList<String> listaDeAnagramas = new ArrayList<String>();

		// La�o de repeti��o para verificar se existe algum anagrama na palavra digitada
		// pelo usu�rio
		for (int i = 0; i < palavra.length(); i++) {

			for (int j = 1; j < palavra.length(); j++) {

				if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {

					if (palavra.charAt(i) == palavra.charAt(i + 1)) {
						String x = palavra.substring(i, i + 1);
						listaDeAnagramas.add(x);
					} else {

						String k = palavra.substring(i, j);
						String l = palavra.substring(i + 1, j + 1);
						String m = palavra.substring(i, i + 1);
						listaDeAnagramas.add(k);
						listaDeAnagramas.add(l);
						listaDeAnagramas.add(m);

					}
				}
			}
		}

		// Imprimindo quantidade de anagramas encontrados
		System.out.println(listaDeAnagramas.size());
	}
}