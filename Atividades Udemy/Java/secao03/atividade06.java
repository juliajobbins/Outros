package secao03;

import java.util.Scanner;

public class atividade06 {

	public static void main(String[] args) {
		float valor_hora, salario;
		int horas_trabalhadas; 
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual valor você ganha por hora?");
		valor_hora = teclado.nextFloat();
		
		System.out.println("Quantas horas você trabalhou esse mês?");
		horas_trabalhadas = teclado.nextInt();
		
		salario = valor_hora * horas_trabalhadas;
		
		System.out.println("Seu sálario esse mês será: " + salario);
		
		teclado.close();
		

	}

}