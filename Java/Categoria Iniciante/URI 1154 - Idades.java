import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = 0, count = 0;
		double soma = 0, media = 0;

		while (idade >= 0) {
			idade = sc.nextInt();

			if (idade >= 0) {
				soma += idade;
				count++;

			}
		}

		media = soma / count;
		System.out.printf("%.2f\n", media);

		sc.close();

	}

}
