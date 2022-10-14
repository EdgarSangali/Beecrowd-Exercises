import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, X, Y, j, total;

		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			int soma = 0;
			X = sc.nextInt();
			Y = sc.nextInt();

			for (j = X, total = 0; total < Y; j++) {
				if (j % 2 != 0) {
					soma += j;
					total += 1;
				}

			}

			System.out.println(soma);
		}

		sc.close();

	}

}
