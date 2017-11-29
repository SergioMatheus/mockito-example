package br.ucsal.bes20172.testequalidade.lista02;

public class Questao01 {

	private static final int QTD_NUM = 5;

	public QuestoesHelper questoesHelper;

	public Questao01(QuestoesHelper questoesHelper) {
		this.questoesHelper = questoesHelper;
	}

	public void obterEncontrarMaiorNumero() {
		int[] vet = new int[QTD_NUM];
		questoesHelper.obterNumeros(vet);
		questoesHelper.obterNumeros(vet);
		int maior = questoesHelper.encontrarMaiorNumero(vet);
		questoesHelper.exibirMaiorNumero(maior);
	}

	public static void main(String[] args) {
		QuestoesHelper questoesHelper = new QuestoesHelper();
		Questao01 questao01 = new Questao01(questoesHelper);
		questao01.obterEncontrarMaiorNumero();
	}
}
