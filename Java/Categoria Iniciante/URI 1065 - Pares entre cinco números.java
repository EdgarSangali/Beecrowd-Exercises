import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int pares = 0;
		
		for (int i = 0; i<5; i++) {
			int N = sc.nextInt();
			
			if (N % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println(pares + " valores pares");
		
		sc.close();
		
	}

}
