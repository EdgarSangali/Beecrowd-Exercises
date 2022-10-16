import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int T, PA, PB, anos;
		double G1, G2;

		T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			anos = 0;
			PA = sc.nextInt();
			PB = sc.nextInt();
			G1 = sc.nextDouble();
			G2 = sc.nextDouble();

			while (PB >= PA) {

				PA += (PA * G1) / 100;
				PB += (PB * G2) / 100;
				anos++;

				if (anos > 100) {
					break;
				}

			}

			if (anos > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.println(anos + " anos.");
			}

		}

		sc.close();

	}

}
