import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int golsInternacional;
		int golsGremio;
		int vitoriasInternacional=0;
		int vitoriasGremio=0;
		int empates=0;
		int partidas=0;
		int opcao=1;
		
		while(opcao ==1) {
			partidas++;
			golsInternacional = sc.nextInt();
			golsGremio = sc.nextInt();
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			opcao = sc.nextInt();
			
			if(golsInternacional>golsGremio) {
				vitoriasInternacional++;
			}
			else if (golsGremio>golsInternacional) {
				vitoriasGremio++;
			}
			else {
				empates++;
			}
			
		while (opcao !=1 && opcao !=2) {
			System.out.println("Novo grenal (1-sim 2-nao)");
			opcao = sc.nextInt();
		}
		
		}
		
		System.out.println(partidas + " grenais");
		System.out.println("Inter:" + vitoriasInternacional);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		
		if(vitoriasInternacional>vitoriasGremio) {
			System.out.println("Inter venceu mais");
		}
		else if (vitoriasGremio>vitoriasInternacional) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
		
		
		
		sc.close();
								
	}

}
