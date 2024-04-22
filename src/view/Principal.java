package view;

import controller.ThreadNãoRecursiva;
import controller.ThreadRecursiva;

public class Principal {
	public static void main(String[] args) {
		
		long n = 5; 
		
		ThreadRecursiva tr = new ThreadRecursiva(n);
		long inicio = System.nanoTime(); 
		tr.start();
		long fim =  System.nanoTime();
		long duracao = fim- inicio; 
        double segundos = (double) duracao / 1_000_000_000.0;
        System.out.println("Thread Recursiva. Tempo decorrido: " + segundos + " segundos");
		
		ThreadNãoRecursiva tn = new ThreadNãoRecursiva(n);
		inicio = System.nanoTime(); 
		tn.start();
		fim =  System.nanoTime();
		duracao = fim- inicio; 
        segundos = (double) duracao / 1_000_000_000.0;
        System.out.println("Thread Não Recursiva. Tempo decorrido: " + segundos + " segundos");
		
	}

}
