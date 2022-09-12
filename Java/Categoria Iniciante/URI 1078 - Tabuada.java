import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int resultado = 0;
		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			resultado = i * N;
			System.out.println(i + " x " + N + " = " + resultado);
		}

		sc.close();

	}

}
