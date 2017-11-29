package br.ucsal.bes20172.testequalidade.lista02;

import org.junit.Before;
import org.junit.Test;

public class Questao01UnitarioExemploMock2Test {

	private Questao01 questao01;

	private QuestoesHelperMock questoesHelperMock;

	@Before
	public void setup() throws ChamadaNaoEfetuada, ChamadaEfetuadaQtdErrada {
		questoesHelperMock = new QuestoesHelperMock();
		questao01 = new Questao01(questoesHelperMock);
	}

	@Test
	public void obterEncontrarMaiorNumeroTeste1() throws ChamadaEfetuadaQtdErrada, ChamadaNaoEfetuada  {
		
		questao01.obterEncontrarMaiorNumero();

		// Verificar se foram feitas as chamadas esperadas.
		questoesHelperMock.verificarChamada("obterNumeros", 1);
		questoesHelperMock.verificarChamada("encontrarMaiorNumero",1 );
		questoesHelperMock.verificarChamada("exibirMaiorNumero",1);
	}
}
