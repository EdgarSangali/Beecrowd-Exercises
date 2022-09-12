import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X, N, totalCobaias = 0, totalCoelhos = 0, totalRatos = 0, totalSapos = 0;
		double percentualRatos = 0, percentualSapos = 0, percentualCoelhos = 0;
		String animal;

		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			X = sc.nextInt();
			animal = sc.next();
			totalCobaias += X;

			if (animal.equals("C")) {
				totalCoelhos += X;
			} else if (animal.equals("R")) {
				totalRatos += X;
			} else if (animal.equals("S")) {
				totalSapos += X;
			}

			percentualRatos = (double) (totalRatos * 100) / totalCobaias;
			percentualSapos = (double) (totalSapos * 100) / totalCobaias;
			percentualCoelhos = (double) (totalCoelhos * 100) / totalCobaias;
		}

		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);
		System.out.printf("Percentual de coelhos: %.2f", percentualCoelhos);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f", percentualRatos);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f", percentualSapos);
		System.out.print(" %\n");

		sc.close();

	}
}