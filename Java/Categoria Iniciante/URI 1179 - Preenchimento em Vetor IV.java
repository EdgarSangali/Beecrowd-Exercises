import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X, contPar = 0, contImpar = 0;

		int[] Par = new int[5];
		int[] Impar = new int[5];

		for (int i = 0; i < 15; i++) {

			X = sc.nextInt();

			if (X % 2 == 0) {
				Par[contPar] = X;
				contPar++;
			} else {
				Impar[contImpar] = X;
				contImpar++;
			}

			if (contPar == 5) {
				contPar = 0;
				for (int j = 0; j < Par.length; j++) {
					System.out.println("par[" + j + "] = " + Par[j]);
				}
			}
			if (contImpar == 5) {
				contImpar = 0;
				for (int j = 0; j < Impar.length; j++) {
					System.out.println("impar[" + j + "] = " + Impar[j]);
				}
			}
		}

		for (int i = 0; i < contImpar; i++) {
			System.out.println("impar[" + i + "] = " + Impar[i]);
		}

		for (int i = 0; i < contPar; i++) {
			System.out.println("par[" + i + "] = " + Par[i]);
		}

		sc.close();

	}

}
