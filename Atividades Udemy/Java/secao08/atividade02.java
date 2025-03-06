package secao08;

import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] soma = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o valor do primeiro vetor: ");
			vetor1[i] = teclado.nextInt();
			System.out.println("Informe o valor do segundo vetor: ");
			vetor2[i] = teclado.nextInt();
			soma[i] = vetor1[i] + vetor2[i];
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("O valor da soma dos vetores é: " + soma[i]);
		}
		teclado.close();
	}

}