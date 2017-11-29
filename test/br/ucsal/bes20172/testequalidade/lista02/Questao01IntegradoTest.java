package br.ucsal.bes20172.testequalidade.lista02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Questao01IntegradoTest {

	private static final String QUEBRA_LINHA = System.getProperty("line.separator");
	
	@Mock
	private Questao01 questao01;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void obterEncontrarMaiorNumeroTeste1() {
		// Dados de entrada
		String numerosEntrada = "1548\n678\n3\n1\n2";

		// Resultado esperado
		String saidaEsperada = "Informe 5 números:" + QUEBRA_LINHA + "Dentre os números informados, o maior foi 1548"
				+ QUEBRA_LINHA;

		// Preparar o mecanismo de entrada de dados do sistema, substituindo o
		// mesmo por um fluxo falso de dados
		InputStream inFake = new ByteArrayInputStream(numerosEntrada.getBytes());
		System.setIn(inFake);

		// Preparar o mecanismo de saída de dados do sistema para o console,
		// substituindo o
		// mesmo por um fluxo falso de destino de dados
		OutputStream outFake = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outFake));

		// Executar o método que está sendo testado e obter o resultado atual
		questao01.obterEncontrarMaiorNumero();
		String saidaAtual = outFake.toString();

		// Comparar o resultado esperado com o resultado atual
		Assert.assertEquals(saidaEsperada, saidaAtual);
	}

}
