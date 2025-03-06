package secao07;

import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		int numero, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		while(numero != 0) {
			if (numero > maior) {
				maior = numero;
			}
			System.out.println("Informe um número: ");
			numero = teclado.nextInt();
		}
		System.out.println("O maior número é " + maior);
		teclado.close();
	}

}