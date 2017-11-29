package br.ucsal.bes20172.testequalidade.lista02;

import java.util.Scanner;

public class QuestoesHelper {
	
	public void obterNumeros(int[] vet) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe " + vet.length + " n�meros:");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
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

		System.out.println("N�meros informados: ");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i]);
		}

		System.out.println("\nN�mero em ordem inversa: ");
		for (int i = 0; i < vetInvertida.length; i++) {
			System.out.print(" " + vetInvertida[i]);
		}
	}

	public void exibirMaiorNumero(int maior) {
		System.out.println("Dentre os n�meros informados, o maior foi " + maior);
	}
}
