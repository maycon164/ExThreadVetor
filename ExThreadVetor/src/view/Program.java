package view;

import controller.ThreadVetor;

public class Program {
	public static void main(String[] args) {
		int[] vetor = new int[1000];

		for(int x = 0; x < 1000; x++ ) {
			int numero = (int) (Math.random() * 100) + 1;
			vetor[x] = numero;
		}
		
		Thread t1 = new ThreadVetor(1, vetor);
		Thread t2 = new ThreadVetor(2, vetor);
		
		t1.start();
		t2.start();
	}
}
