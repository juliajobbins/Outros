package secao03;

import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Informe a quantidade mínima:");
		quantidade_minima = teclado.nextInt();
		
		System.out.println("Informe a quantidade máxima");
		quantidade_maxima = teclado.nextInt();
		
		estoque_medio = (quantidade_minima + quantidade_maxima) / 2;
		
		System.out.println("O estoque médio é " + estoque_medio);
		
		teclado.close();

	}

}