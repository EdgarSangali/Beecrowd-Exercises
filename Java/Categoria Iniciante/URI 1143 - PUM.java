import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 1;
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(count + " ");
				count++;
			}
			System.out.println("PUM");
			count++;
		}

		sc.close();

	}

}
