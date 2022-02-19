/*D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 *A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. 
 *O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
 *Possui no m�nimo 6 caracteres.
 *Cont�m no m�nimo 1 digito.
 *Cont�m no m�nimo 1 letra em min�sculo.
 *Cont�m no m�nimo 1 letra em mai�sculo.
 *Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
 *D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � uma senha forte. 
 *Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de caracteres que devem ser adicionados 
 *para uma string qualquer ser considerada segura.
*/

package desafioCapgemini;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// Iniciando vari�veis
		boolean numero = false;
		boolean maiusculo = false;
		boolean minusculo = false;
		boolean simbolo = false;
		String senha;

		do {
			// Solicitando senha ao usu�rio
			System.out.println("\nDigite sua senha");
			senha = scan.nextLine();

			// La�o de condi��o para verificar tamanho da senha digitada pelo usu�rio
			if (senha.length() < 6) {
				System.out.println("A senha precisa conter no m�nimo 6 caracteres");
			} else {
				// La�o de repeti��o for para verificar os caracteres
				for (char c : senha.toCharArray()) {
					// Verificando se as condi��es da senha est�o de acordo com as informa��es do
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

				// Informando ao usu�rio se a senha est� de acordo com o solicitado ou n�o,
				// indicando as condi��es que faltam para a senha.
				if (numero == true && maiusculo == true && minusculo == true && simbolo == true) {
					System.out.println("\nSenha v�lida!\n");
				} else {
					System.out.println("\nSenha fraca!\n");
				}
				if (numero == true) {

				} else {
					System.out.println("A senha precisa ter pelo menos um n�mero");
				}
				if (maiusculo == true) {

				} else {
					System.out.println("A senha precisa ter pelo menos uma letra mai�scula");
				}
				if (minusculo == true) {

				} else {
					System.out.println("A senha precisa ter pelo menos uma letra min�scula");
				}
				if (simbolo == true) {

				} else {
					System.out.println("A senha precisa ter pelo menos um s�mbolo");
				}

			}
			// Condi��o para repetir o c�digo enquanto a senha n�o for valida.
		} while (numero == false || maiusculo == false || minusculo == false || simbolo == false);
	}

}
