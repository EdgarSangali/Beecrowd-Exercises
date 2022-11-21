import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double soma = 0;
		int C = sc.nextInt();
		char T = sc.next().toUpperCase().charAt(0);
		
		double [][] M = new double[12][12];
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = sc.nextDouble();
			}
		}
		
		for (int j = 0; j < M.length; j++) {
			soma += M[j][C];
		}	
		
		if(T == 'M') {
			soma /= M.length;
		}
		
		System.out.println(String.format("%.1f", soma));
		
		sc.close();
		
	    }
		
	}
