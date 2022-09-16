import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M, N, soma;

		while (((M = sc.nextInt()) > 0) && ((N = sc.nextInt()) > 0)) {
			soma = 0;

			if (M > N) {
				for (N = N; N <= M; N++) {
					System.out.print(N + " ");
					soma += N;
				}
				System.out.println("Sum=" + soma);
			} else {
				for (M = M; M <= N; M++) {
					System.out.print(M + " ");
					soma += M;
				}
				System.out.println("Sum=" + soma);
			}
		}

		sc.close();

	}

}
