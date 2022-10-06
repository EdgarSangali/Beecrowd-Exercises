import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int fatorial = 1, N;
	
	N = sc.nextInt();
	
	for (int i = 1; i<=N; i++) {
		fatorial *= i;
	}
	
	System.out.println(fatorial);
	
	sc.close();
	

	}

}
