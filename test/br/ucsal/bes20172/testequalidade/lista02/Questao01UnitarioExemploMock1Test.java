package br.ucsal.bes20172.testequalidade.lista02;

import org.junit.Before;
import org.junit.Test;

public class Questao01UnitarioExemploMock1Test {

	private Questao01 questao01;

	@Before
	public void setup() throws ChamadaNaoEfetuada, ChamadaEfetuadaQtdErrada {

		QuestoesHelper questoesHelper1 = new QuestoesHelper();

		QuestoesHelper questoesHelperMock = new QuestoesHelperMock();

		System.out.println("questoesHelper1 - ANTES");
		int[] vet1 = { 5, 3, 8, 12, 7 };
		int maior1 = questoesHelper1.encontrarMaiorNumero(vet1);
		System.out.println("maior1 = " + maior1);
		System.out.println("questoesHelper1 - DEPOIS\n");

		System.out.println("questoesHelper2 - ANTES");
		int[] vet2 = { 5, 3, 8, 12, 7 };
		int maior2 = questoesHelperMock.encontrarMaiorNumero(vet2);
		System.out.println("maior2 = " + maior2);

		int[] vet3 = { 4, 7, 8, 1, 2 };
		int maior3 =  questoesHelperMock.encontrarMaiorNumero(vet3);
		System.out.println("maior3 = " + maior3);

		System.out.println("questoesHelper2 - DEPOIS");

		((QuestoesHelperMock) questoesHelperMock).verificarChamada("encontrarMaiorNumero", 2);

		// questao01 = new Questao01(questoesHelper1);
	}

	@Test
	public void obterEncontrarMaiorNumeroTeste1() {

	}
}
