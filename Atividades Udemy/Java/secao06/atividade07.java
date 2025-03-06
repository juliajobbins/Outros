package secao06;

import java.util.Scanner;
public class atividade07 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, q1, q2, q3, q4;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o 1º número: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o 2º número: ");
		num2 = teclado.nextInt();
		System.out.println("Informe o 3º número: ");
		num3 = teclado.nextInt();
		System.out.println("Informe o 4º número: ");
		num4 = teclado.nextInt();
		
		q1 = num1 * num1;
		q2 = num2 * num2;
		q3 = num3 * num3;
		q4 = num4* num4;
		
		if(q3 >= 10000) {
			System.out.println(q3);
		} else {
			System.out.printf("Número 1: %d Quadrado: %d\n", num1, q1);
			System.out.printf("Número 2: %d Quadrado: %d\n", num1, q2);
			System.out.printf("Número 3: %d Quadrado: %d\n", num1, q3);
			System.out.printf("Número 4: %d Quadrado: %d\n", num1, q4);
		}
		teclado.close();
	}
	
}