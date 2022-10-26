import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double [] X = new double[100];
		
		for (int i = 0; i<100; i++) {
			X[i] = sc.nextDouble();
		}
		
		for (int i = 0; i<100; i++) {
			if (X[i] <=10) {
				System.out.printf("A[%d] = %.1f\n", i, X[i]);
			}
		}
		
		sc.close();

	}

}
