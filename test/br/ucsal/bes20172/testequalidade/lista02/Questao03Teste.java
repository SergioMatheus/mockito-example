package br.ucsal.bes20172.testequalidade.lista02;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class Questao03Teste {

	@Mock
	private QuestoesHelper questoesHelper;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void obterNumerosExibirInformadoEInvertido() {

		int numeroObtido=2;
		Boolean situacaoPrimo=false;
		Questao03 questao03 = new Questao03(questoesHelper);
		Mockito.when(questoesHelper.obterUmNumero()).thenReturn(2);
		Mockito.when(questoesHelper.verificarNumeroPrimo(numeroObtido)).thenReturn(true);
		Mockito.doNothing().when(questoesHelper).exibirResultado(numeroObtido, situacaoPrimo);
		questoesHelper.obterUmNumero();
		questoesHelper.verificarNumeroPrimo(numeroObtido);
		questoesHelper.exibirResultado(numeroObtido, situacaoPrimo);
		
		questao03.obterNumeroExibirSePrimo();
		Mockito.verify(questoesHelper);
		
	}
}