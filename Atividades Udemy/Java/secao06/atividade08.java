package secao06;

import java.util.Scanner;

public class atividade08 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		if (numero %2 == 0) {
			if (numero > 0) {
				System.out.println("Número par e positivo.");
			}else {
				System.out.println("Número par e negativo.");
			}
		} else {
			if(numero > 0) {
				System.out.println("Número ímpar e positivo");
			} else {
				System.out.println("Número ímpar e negativo.");
			}
		}
		teclado.close();
	}

}