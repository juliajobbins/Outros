package secao03;

import java.util.Scanner;

public class atividade07 {

	public static void main(String[] args) {
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		
		peso_ideal = (float)(72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + peso_ideal);
		teclado.close();
				

	}

}