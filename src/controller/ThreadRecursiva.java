package controller;

public class ThreadRecursiva extends Thread {
	long n; 
	public ThreadRecursiva (long n) {
		this.n=n; 
	}
	public void run() {		
		System.out.println("Thread Recursiva. Resultado: "+ FuncaoFat(n));
	}
	public long FuncaoFat(long n) {
		if (n == 0) {
			return 1;
		} else {
			return n * FuncaoFat(n - 1);
		}
	}
}
