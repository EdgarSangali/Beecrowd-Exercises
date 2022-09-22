import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float primeiraNota, notaValidada = 0, totalNotasValidadas = 0, media = 0;

		while (totalNotasValidadas != 2) {
			primeiraNota = sc.nextFloat();

			if (primeiraNota >= 0 && primeiraNota <= 10) {

				notaValidada += primeiraNota;
				totalNotasValidadas += 1;
			}

			else {
				System.out.println("nota invalida");
			}
		}

		media = notaValidada / 2;
		System.out.printf("media = %.2f\n", media);

		sc.close();

	}

}