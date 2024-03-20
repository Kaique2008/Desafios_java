package estrururaCondicional;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int nota1,  nota2, nota3, nota4, media;
		
		System.out.println("Qual a primeira nota? ");
		nota1 = ler.nextInt();
		
		System.out.println("Qual a segunda nota? ");
		nota2 = ler.nextInt();
		
		System.out.println("Qual a terceira nota? ");
		nota3 = ler.nextInt();
		
		System.out.println("Qual a quarta nota ");
		nota4 = ler.nextInt();
		
		media = nota1+nota2+nota3+nota4 /4;
		
		if(media >= 6) {
			System.out.println("O aluno foi aprovado");
		}
		
		else {
			System.out.println("O aluno foi reprovado");
		}

	}

}
