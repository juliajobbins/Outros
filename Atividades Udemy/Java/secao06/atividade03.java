package secao06;

import java.util.Scanner;
public class atividade03 {

	public static void main(String[] args) {
		int numero, p = 0, i =0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		if(numero % 2 == 0) {
			p = numero;
		} else {
			i = numero;
		}
		
		System.out.println(p);
		System.out.println(i);
		teclado.close();
	}

}