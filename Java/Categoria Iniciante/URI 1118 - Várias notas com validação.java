import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, opcao = 1;

		while (opcao == 1) {

			nota1 = sc.nextDouble();
			while (nota1 > 10 || nota1 < 0) {
				System.out.println("nota invalida");
				nota1 = sc.nextDouble();
			}

			nota2 = sc.nextDouble();
			while (nota2 > 10 || nota2 < 0) {
				System.out.println("nota invalida");
				nota2 = sc.nextDouble();
			}

			double media = (nota1 + nota2) / 2;
			System.out.printf("media = %.2f\n", media);

			System.out.println("novo calculo (1-sim 2-nao)");

			opcao = sc.nextDouble();

			while (opcao != 1 && opcao != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				opcao = sc.nextDouble();

			}
		}

		sc.close();

	}

}
