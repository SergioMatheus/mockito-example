package br.ucsal.bes20172.testequalidade.lista02;

import java.util.Scanner;

public class QuestoesHelper {
	
	public void obterNumeros(int[] vet) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe " + vet.length + " números:");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
	}

	public  int obterUmNumero(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número maior ou igual à zero:");
		return sc.nextInt();
	}
	
	public int encontrarMaiorNumero(int[] vet) {
		int maior = vet[0];
		for (int i = 1; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
			}
		}
		return maior;
	}
	
	public void inverterOrdemNumeros(int[] vet, int[] vetInvertida) {
		int aux = vet.length;
		for (int i = 0; i < vetInvertida.length; i++) {
			aux--;
			vetInvertida[i] = vet[aux];
		}

	}
	public void exibirVetores(int[] vet, int[] vetInvertida) {

		System.out.println("Números informados: ");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i]);
		}

		System.out.println("\nNúmero em ordem inversa: ");
		for (int i = 0; i < vetInvertida.length; i++) {
			System.out.print(" " + vetInvertida[i]);
		}
	}
	
	public boolean verificarNumeroPrimo(int n) {
		int contPrim = 0;
		for (int i=1;i<=n;i++) {
			if(n%i==0) {
				contPrim++;	
			}
		}
		if (contPrim ==2) {
			return true;
		}
		return false;
	}

	public  void exibirResultado(int n, boolean situacaoPrimo) {
		if(situacaoPrimo) {
			System.out.println("O número " + n + " é primo.");
		} else {
			System.out.println("O número " + n + " não é primo.");
		}
		
	}

	public void exibirMaiorNumero(int maior) {
		System.out.println("Dentre os números informados, o maior foi " + maior);
	}
}
