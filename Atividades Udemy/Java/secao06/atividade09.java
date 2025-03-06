package secao06;

import java.util.Scanner;

public class atividade09 {

	public static void main(String[] args) {
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o índice de poluição: ");
		indice = teclado.nextFloat();
		
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Atenção: Indústrias do 1º grupo devem suspender as atividades.");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Atenção: Indústrias do 1º e 2º grupo devem suspender as atividades.");
		}else if (indice >= 0.5) {
			System.out.println("Alerta: As indústrias de todos os grupos devem suspender as atividades.");
		}else {
			System.out.println("Índice de poluição normalizado.");
		}
		teclado.close();

	}

}