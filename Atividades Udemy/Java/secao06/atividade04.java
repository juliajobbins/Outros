package secao06;

import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		float altura, peso_ideal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		System.out.println("Informe seu sexo (F/M): ");
		sexo = teclado.next().charAt(0);
		
		if(sexo == 'M') {
			peso_ideal = (float)(72.7 * altura) - 58;
			System.out.println("Seu peso ideal é: " + peso_ideal);
		}
		
		if(sexo == 'F') {
			peso_ideal = (float)(62.1 * altura) - (float)44.7;
			System.out.println("Seu peso ideal é: " + peso_ideal);
		}
		
		if(sexo != 'M' && sexo != 'F') {
			System.out.println("Sexo inválido.");
			peso_ideal = 0;
		}
		
		teclado.close();
	}

}