import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int AB = ((a + b) + Math.abs(a - b)) / 2;
		int ABC = ((AB + c) + Math.abs(AB - c)) / 2;

		System.out.println(ABC + " eh o maior");

		sc.close();

	}

}