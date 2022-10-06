import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int N, proximo, atual = 1, anterior = 0;
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			if (i==N) {
				System.out.println(anterior);
			}
			else {
				System.out.print(anterior + " ");
				proximo = anterior + atual;
				anterior = atual;
				atual = proximo;
			}
		}
			
		sc.close();
    }
	
}

