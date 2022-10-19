import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			int posicao;
			int [] X = new int[10];
			
			for (int i = 0; i<X.length; i++) {
				X[i] = sc.nextInt();
				posicao = i;
				
				if(X[i] <=0) {
					X[i] = 1;
				}
				System.out.println("X[" + posicao + "] = " + X[i]);
							}
		
		sc.close();

	}

}
