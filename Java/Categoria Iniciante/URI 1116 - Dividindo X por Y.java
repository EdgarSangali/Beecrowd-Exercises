import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double X, Y;
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			X = sc.nextDouble();
			Y = sc.nextDouble();

			if (Y == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f\n", X / Y);
			}

		}

		sc.close();

	}

}
