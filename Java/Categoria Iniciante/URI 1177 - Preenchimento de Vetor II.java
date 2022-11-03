import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] N = new int[1000];
		int pos = 0;

		while (pos < 999) {

			for (int j = 0; j < T; j++) {
				if (pos > 999)
					break;

				N[pos] = j;
				pos++;

			}
		}

		for (int i = 0; i < N.length; i++) {

			System.out.println("N[" + i + "] = " + N[i]);
		}

		sc.close();

	}

}
