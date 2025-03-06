package secao06;

import java.util.Scanner;

public class atividade05 {

	public static void main(String[] args) {
		float p, m;
		String e = "excesso";
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o peso de peixes: ");
		p = teclado.nextFloat();
		
		if(p > 50) {
			m = (float)(p - 50) * (float)4.00;
			System.out.printf("Você deverá pagar R$ %.2f em multas", m);
		} else {
			m = 0;
			e = "0.0";
			System.out.println("Multas: " + m);
			System.out.println("Excesso: " + e);
		}
		teclado.close();
	}

}