package controller;

public class ThreadVetor extends Thread{
	private int valor;
	private int[] vetor;
	
	public ThreadVetor(int valor, int[] vetor) {
		this.valor = valor;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		contaTempo();
	}
	
	private void contaTempo() {
		double tempoInicial;
		double tempoFinal;
		
		if(valor % 2 == 0) {
			tempoInicial = System.nanoTime();
			for(int x = 0; x <= vetor.length; x++) {}
			tempoFinal = System.nanoTime();
			double tempo = tempoFinal - tempoInicial;
			tempo /= Math.pow(10, 9);
			System.out.printf("tempo com o For: %.6f segundos \n", tempo);

		}else {
			tempoInicial = System.nanoTime();
			for(int x: vetor) {}
			tempoFinal = System.nanoTime();
			double tempo = tempoFinal - tempoInicial;
			tempo /= Math.pow(10, 9);
			System.out.printf("tempo com o For Each: %.6f segundos \n", tempo);
		}
	}
}
