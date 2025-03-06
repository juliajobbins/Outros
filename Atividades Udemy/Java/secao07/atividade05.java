package secao07;

import java.util.Scanner; 

public class atividade05 {

	public static void main(String[] args) {
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um nome de usuário: ");
		nome = teclado.next();
		System.out.println("Informe uma senha: ");
		senha = teclado.next();
		
		while(nome.equals(senha)) {
			System.out.println("Erro: o nome de usuário e a senha devem ser diferentes.");
			System.out.println("Informe um nome de usuário: ");
			nome = teclado.next();
			System.out.println("Informe uma senha: ");
			senha = teclado.next();
		}
		System.out.println("Parabéns! Você acessou o programa!");
		teclado.close();
	}

}