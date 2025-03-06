package secao08;

import java.util.Scanner;

public class atividade05 {

	public static void main(String[] args) {
		int[] vetor = new int[50];
		boolean tem_maior_50 = false;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe um valor para o vetor %d/10: \n", (i + 1));
			vetor[i] = teclado.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if(vetor[i] > 50) {
				System.out.printf("O número %d está na posição: %d\n", vetor[i], (i + 1));
				tem_maior_50 = true;
			}
		}
		if(!tem_maior_50) {
			System.out.println("Não existem números maiores que 50.");
		}
		teclado.close();
	}

}