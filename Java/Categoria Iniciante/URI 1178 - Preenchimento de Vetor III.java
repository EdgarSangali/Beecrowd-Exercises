import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i, j;
		double X = sc.nextDouble();
		double[] N = new double[100];

		for (i = 0, j = 0; i < N.length; X /= 2, i++, j++) {
			N[j] = X;

			System.out.printf("N[%d] = %.4f\n", i, N[j]);
		}

		sc.close();

	}

}
