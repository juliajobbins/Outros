package secao07;

import java.util.Scanner;
public class atividade07 {

	public static void main(String[] args) {
		 int identificacao, contador_total = 0, contador_1 = 0, contador_2 = 0, contador_3 = 0, contador_4 = 0, defeito;
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Informe a identificação do mouse: ");
		 identificacao = teclado.nextInt();
		 
		 while (identificacao != 0) {
			 System.out.println("Situações:");
			 System.out.println("1 - Necessita de esfera");
			 System.out.println("2 - Necessita de limpeza");
			 System.out.println("3 - Necessita de troca de cabo ou conector");
			 System.out.println("4 - Danificado ou inutilizado");
			 System.out.println("Informe a situação: ");
			 defeito = teclado.nextInt();
			 
			 if(defeito == 1) {
				 contador_1 = contador_1 + 1;
			 }
			 if(defeito == 2) {
				 contador_2 = contador_2 + 1;
			 }
			 if(defeito == 3) {
				 contador_3 = contador_3 + 1;
			 }
			 if(defeito == 4) {
				 contador_4 = contador_4 + 1;
			 }
			 contador_total = contador_total + 1;
			 
			 System.out.println("Informe a identificação do mouse: ");
			 identificacao = teclado.nextInt();
		 }
		 
		 float p1, p2, p3, p4;
		 p1 = ((float)contador_1 / (float)contador_total) * (float)100.00;
		 p2 = ((float)contador_2 / (float)contador_total) * (float)100.00;
		 p3 = ((float)contador_3 / (float)contador_total) * (float)100.00;
		 p4 = ((float)contador_4 / (float)contador_total) * (float)100.00;
		 
		 System.out.printf("Quantidade de mouses:  %d\n", contador_total);
		 System.out.println("Situação \t\t\t\t\tQuantidade \t\tPercentual");
		 System.out.printf("1 - Necessita de esfera \t\t\t%d \t\t\t%.2f\n", contador_1, p1);
		 System.out.printf("2 - Necessita de limpeza \t\t\t%d \t\t\t%.2f\n", contador_2, p2);
		 System.out.printf("3 - Necessita de troca de cabo ou conector \t%d \t\t\t%.2f\n", contador_3, p3);
		 System.out.printf("4 - Danificado ou inutilizado \t\t\t%d \t\t\t%.2f", contador_4, p4);
		 teclado.close();

	}
	
}