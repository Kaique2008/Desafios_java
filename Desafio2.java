package estrururaCondicional;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite o valor");
		valor = ler.nextInt();
		
		if (valor ==1) {
			System.out.println("Domingo");
		}
		
		else if (valor ==2) {
			System.out.println("Segunda");
		}
		
		else if (valor ==3) {
			System.out.println("Terça");
		}
		
		else if (valor ==4) {
			System.out.println("Quarta");
		}
		
		else if (valor ==5) {
			System.out.println("Quinta");
		}
		
		else if (valor ==6) {
			System.out.println("Sexta");
		}
		
		else if (valor ==7) {
			System.out.println("Sábado");
		}
		
		else if (valor >= 8) {
			System.out.println("Dia inválido");
		}

	}

}
