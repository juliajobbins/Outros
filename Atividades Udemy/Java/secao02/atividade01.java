package secao02;

import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		int num1, num2, soma, multiplicacao;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextInt();
				
		soma = num1 + num2;
		multiplicacao = soma * num1;
		
		System.out.println("O resultado da conta é: " + multiplicacao);
		
		teclado.close();
	}

}
