package secao08;

import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("Informe um valor para o vetor %d/20: \n", (i+1));
			vetor[i] = teclado.nextInt();
			soma = soma + vetor[i];
		}
		System.out.println("A soma é " + soma);
		teclado.close();
	}

}