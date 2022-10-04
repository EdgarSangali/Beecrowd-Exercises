import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A, N, soma=0;
		
		 A = sc.nextInt();
		 N = sc.nextInt();
		
		while (N <=0) {
			N = sc.nextInt();
		}
		
		for (int i = 1; i<=N;i++) {
			
			soma += A;
			A++;			
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}