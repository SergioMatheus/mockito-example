package br.ucsal.bes20172.testequalidade.lista02;

public class Questao02 {

	private static final int QTD_NUM = 5;

	public QuestoesHelper questoesHelper;

	public Questao02(QuestoesHelper questoesHelper) {
		this.questoesHelper = questoesHelper;
	}

	public void obterNumerosExibirInformadoEInvertido() {
		
		int[] vetInvertido = new int [QTD_NUM];
		int[] vet = questoesHelper.obterNumeros();
		questoesHelper.inverterOrdemNumeros(vet, vetInvertido);
		questoesHelper.exibirVetores(vet, vetInvertido);
	}

	public static void main(String[] args) {
		QuestoesHelper questoesHelper = new QuestoesHelper();
		Questao02 questao02 = new Questao02(questoesHelper);
		questao02.obterNumerosExibirInformadoEInvertido();
	}
}
