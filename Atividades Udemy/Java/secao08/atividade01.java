package secao08;

import java.util.ArrayList;

public class atividade01 {

	public static void main(String[] args) {
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			vetor.add(i);
			if(i % 2 == 0) {
				if(i > 0) {
					pares.add(i);
				}
			}
		}
		for (Integer n : pares) {
			System.out.println(n);
		}

	}

}