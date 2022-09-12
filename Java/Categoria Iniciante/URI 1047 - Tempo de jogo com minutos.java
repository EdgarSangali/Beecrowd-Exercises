import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int h1, m1, h2, m2, hm1, hm2, H24, resultado;
		
		h1 = sc.nextInt();
		m1 = sc.nextInt();
		h2 = sc.nextInt();
		m2 = sc.nextInt();
		hm1 = (h1 * 60) + m1;
		hm2 = (h2*60) + m2;
		H24 = 24*60;
		resultado = 0;
		
		if( hm2 > hm1) {
			resultado = hm2 - hm1;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (resultado / 60), (resultado % 60));
		}	
		
		else if (hm1 > hm2) {
			resultado = (H24 - hm1) + hm2;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n" , (resultado / 60), (resultado % 60));
		}
		else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n" , 24 , 0);
		}
		
		
		sc.close();
		
	}
}
