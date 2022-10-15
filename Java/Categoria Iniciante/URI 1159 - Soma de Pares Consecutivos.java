import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N;

		while ((N = sc.nextInt()) != 0) {
			int soma = 0;

			for (int i = N, j = 1; j <= 5; i++) {

				if (i % 2 == 0) {

					soma += i;
					j += 1;
				}

			}

			System.out.println(soma);
		}

		sc.close();

	}

}
