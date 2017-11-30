package br.ucsal.bes20172.testequalidade.lista02;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class Questao02Teste {

	@Mock
	private QuestoesHelper questoesHelper;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void obterNumerosExibirInformadoEInvertido() {

		Questao02 questao02 = new Questao02(questoesHelper);

		int vet[] = {0,1,2,3,4};
		int vetInvertida[] = {4,3,2,1,0};
		Mockito.when(questoesHelper.obterNumeros()).thenReturn(vet);
		Mockito.doNothing().when(questoesHelper).inverterOrdemNumeros(vet, vetInvertida);
		Mockito.doNothing().when(questoesHelper).exibirVetores(vet, vetInvertida);
		questoesHelper.obterNumeros();
		questoesHelper.inverterOrdemNumeros(vet, vetInvertida);
		questoesHelper.exibirVetores(vet, vetInvertida);
		
		questao02.obterNumerosExibirInformadoEInvertido();
		Mockito.verify(questoesHelper);
		
	}
}
