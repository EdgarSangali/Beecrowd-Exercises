import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int X = sc.nextInt();

		while (count < 6) {
			if (X % 2 != 0) {
				count++;
				System.out.println(X);
			}
			X++;
		}

		sc.close();

	}

}
