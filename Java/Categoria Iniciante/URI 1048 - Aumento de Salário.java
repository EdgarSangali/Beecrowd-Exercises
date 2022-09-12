import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, novoSalario, reajuste;
		int percentual;

		salario = sc.nextDouble();

		if (salario >= 0.00 && salario <= 400.00) {
			novoSalario = salario * 1.15;
			reajuste = novoSalario - salario;
			percentual = 15;

		}

		else if (salario >= 400.01 && salario <= 800.00) {
			novoSalario = salario * 1.12;
			reajuste = novoSalario - salario;
			percentual = 12;
		}

		else if (salario >= 800.01 && salario <= 1200.00) {
			novoSalario = salario * 1.10;
			reajuste = novoSalario - salario;
			percentual = 10;
		}

		else if (salario >= 1200.01 && salario <= 2000.00) {
			novoSalario = salario * 1.07;
			reajuste = novoSalario - salario;
			percentual = 7;
		}

		else {
			novoSalario = salario * 1.04;
			reajuste = novoSalario - salario;
			percentual = 4;
		}

			System.out.printf("Novo salario: %.2f\n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f\n", reajuste);
			System.out.println("Em percentual: " + percentual + " %");		
		
		
		sc.close();

	}

}