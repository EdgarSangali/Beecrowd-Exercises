import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menor = 0, posMenor = 0, N;
		N = sc.nextInt();

		int[] X = new int[N];

		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();

			if (i == 0) {
				menor = X[i];
				posMenor = i;
			} else if (X[i] < menor) {
				menor = X[i];
				posMenor = i;
			}

		}

		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posMenor);

		sc.close();

	}

}
