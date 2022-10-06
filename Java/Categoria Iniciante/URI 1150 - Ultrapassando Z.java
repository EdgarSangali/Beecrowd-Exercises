import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			int X, Z, soma = 0, count = 0;
			X = sc.nextInt();
			Z = sc.nextInt();
			
			while (Z<=X) {
				Z = sc.nextInt();
			}
			
			while (soma<Z) {
				
				soma += X;
				count++;
				X++;
			}
			
			System.out.println(count);
			
			sc.close();
		
		
	}

}
