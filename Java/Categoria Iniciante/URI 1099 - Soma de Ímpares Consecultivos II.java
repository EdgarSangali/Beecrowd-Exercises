import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, X, Y, soma;

		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			soma = 0;
			X = sc.nextInt();
			Y = sc.nextInt();

			if (X < Y) {
				for (int j = X + 1; j < Y; j++) {
					if (j % 2 != 0) {
						soma += j;
					}
				}
			} else {
				for (int j = Y + 1; j < X; j++) {
					if (j % 2 != 0) {
						soma += j;
					}
				}
			}

			System.out.println(soma);
		}

		sc.close();
	}

}
