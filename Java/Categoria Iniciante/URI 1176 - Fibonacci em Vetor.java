import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T, N;
		long a, b, c;
		a = 0;
		b = 1;
		c = 0;

		long[] fib = new long[61];

		for (int i = 0; i < fib.length; i++) {
			fib[i] = c;
			a = b;
			b = c;
			c = a + b;

		}

		T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			N = sc.nextInt();

			System.out.println("Fib(" + N + ") = " + fib[N]);
		}

		sc.close();

	}

}