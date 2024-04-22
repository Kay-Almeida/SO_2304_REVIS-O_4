package controller;

public class ThreadNãoRecursiva extends Thread {
	long n; 
	public ThreadNãoRecursiva (long n) {
		this.n=n; 
	}
	public void run () {
		long fatorial = n; 
		while(n!=1) {
			n=n-1; 
			fatorial = (fatorial*n);
		}
		System.out.println("Thread Não Recursiva. Resultado: "+ fatorial);	
	}
	
}
