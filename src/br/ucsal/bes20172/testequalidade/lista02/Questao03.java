package br.ucsal.bes20172.testequalidade.lista02;

public class Questao03 {

	public QuestoesHelper questoesHelper;

	public Questao03(QuestoesHelper questoesHelper) {
		this.questoesHelper = questoesHelper;
	}

	public void obterNumeroExibirSePrimo() {
		int numeroObtido =questoesHelper.obterUmNumero();
		boolean situacaoPrimo= questoesHelper.verificarNumeroPrimo(numeroObtido);
		questoesHelper.exibirResultado(numeroObtido, situacaoPrimo);
	}

	public static void main(String[] args) {
		QuestoesHelper questoesHelper = new QuestoesHelper();
		Questao03 questao03 = new Questao03(questoesHelper);
		questao03.obterNumeroExibirSePrimo();
	}
}
