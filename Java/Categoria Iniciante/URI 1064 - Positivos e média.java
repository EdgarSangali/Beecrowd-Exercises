import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media = 0;
		int count = 0;

		for (int i = 0; i < 6; i++) {
			double N = sc.nextDouble();

			if (N > 0) {
				count++;
				media += N;

			}

		}

		media = media / count;
		
		System.out.println(count + " valores positivos");
		System.out.printf("%.1f\n", media);
		
		sc.close();

	}

}
