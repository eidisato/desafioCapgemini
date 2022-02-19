/*Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 *A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
 *O site considera uma senha forte quando ela satisfaz os seguintes critérios:
 *Possui no mínimo 6 caracteres.
 *Contém no mínimo 1 digito.
 *Contém no mínimo 1 letra em minúsculo.
 *Contém no mínimo 1 letra em maiúsculo.
 *Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
 *Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. 
 *Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados 
 *para uma string qualquer ser considerada segura.
*/

package desafioCapgemini;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// Iniciando variáveis
		boolean numero = false;
		boolean maiusculo = false;
		boolean minusculo = false;
		boolean simbolo = false;
		String senha;

		do {
			// Solicitando senha ao usuário
			System.out.println("\nDigite sua senha");
			senha = scan.nextLine();

			// Laço de condição para verificar tamanho da senha digitada pelo usuário
			if (senha.length() < 6) {
				System.out.println("A senha precisa conter no mínimo 6 caracteres");
			} else {
				// Laço de repetição for para verificar os caracteres
				for (char c : senha.toCharArray()) {
					// Verificando se as condições da senha estão de acordo com as informações do
					// enunciado
					if (c >= '0' && c <= '9') {

						numero = true;
					} else if (c >= 'A' && c <= 'Z') {
						maiusculo = true;
					} else if (c >= 'a' && c <= 'z') {
						minusculo = true;
					} else {
						simbolo = true;
					}
				}

				// Informando ao usuário se a senha está de acordo com o solicitado ou não,
				// indicando as condições que faltam para a senha.
				if (numero == true && maiusculo == true && minusculo == true && simbolo == true) {
					System.out.println("\nSenha válida!\n");
				} else {
					System.out.println("\nSenha fraca!\n");
				}
				if (numero == true) {

				} else {
					System.out.println("A senha precisa ter pelo menos um número");
				}
				if (maiusculo == true) {

				} else {
					System.out.println("A senha precisa ter pelo menos uma letra maiúscula");
				}
				if (minusculo == true) {

				} else {
					System.out.println("A senha precisa ter pelo menos uma letra minúscula");
				}
				if (simbolo == true) {

				} else {
					System.out.println("A senha precisa ter pelo menos um símbolo");
				}

			}
			// Condição para repetir o código enquanto a senha não for valida.
		} while (numero == false || maiusculo == false || minusculo == false || simbolo == false);
	}

}
