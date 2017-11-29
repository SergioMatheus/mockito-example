package br.ucsal.bes20172.testequalidade.lista02;
import java.util.Scanner;

public class Questao03 {
	
	public  Scanner sc = new Scanner(System.in);	

	public  int obterNumero(){
		System.out.println("Informe um número maior ou igual à zero:");
		return sc.nextInt();
	}

	public boolean verificarNumeroPrimo(int n) {
		int contPrim = 0;
		for (int i=1;i<=n;i++) {
			if(n%i==0) {
				contPrim++;	
			}
		}
		if (contPrim > 2) {
			return false;
		}
		return true;
	}

	public  void exibirResultado(int n, boolean situacaoPrimo) {
		if(situacaoPrimo) {
			System.out.println("O número " + n + " é primo.");
		} else {
			System.out.println("O número " + n + " não é primo.");
		}
		
	}
}