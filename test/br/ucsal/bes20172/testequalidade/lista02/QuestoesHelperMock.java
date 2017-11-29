package br.ucsal.bes20172.testequalidade.lista02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestoesHelperMock extends QuestoesHelper {

	// Map<nome-do-método, quantidade-vezes-metodo-foi-chamado>
	// private Map<String, Integer> chamadasMap = new HashMap<>();
	private List<String> chamadasList = new ArrayList<>();

	@Override
	public void obterNumeros(int[] vet) {
		// registrarChamada("obterNumeros");
		chamadasList.add("obterNumeros");
		vet[0] = 5;
		vet[1] = 3;
		vet[2] = 8;
		vet[3] = 12;
		vet[4] = 7;
	}

	@Override
	public int encontrarMaiorNumero(int[] vet) {
		if (Arrays.equals(vet, new int[] { 5, 3, 8, 12, 7 })) {
			// registrarChamada("encontrarMaiorNumero");
			chamadasList.add("encontrarMaiorNumero");
			return 12;
		}
		if (Arrays.equals(vet, new int[] { 4, 7, 8, 1, 2 })) {
			// registrarChamada("encontrarMaiorNumero");
			chamadasList.add("encontrarMaiorNumero");
			return 8;
		}
		return 0;
	}

	@Override
	public void exibirMaiorNumero(int maior) {
		if (maior == 12) {
			// registrarChamada("exibirMaiorNumero");
			chamadasList.add("exibirMaiorNumero");
		}
	}

	public void verificarChamada(String nomeMetodoPesquisa) throws ChamadaNaoEfetuada {
		// if (!chamadasMap.containsKey(nomeMetodo)) {
		// throw new ChamadaNaoEfetuada(nomeMetodo);
		// }
		if (contarQtdChamadas(nomeMetodoPesquisa) == 0) {
			throw new ChamadaNaoEfetuada(nomeMetodoPesquisa);
		}
	}

	public void verificarChamada(String nomeMetodoPesquisa, int qtdPesquisa)
			throws ChamadaEfetuadaQtdErrada, ChamadaNaoEfetuada {
		int qtd = contarQtdChamadas(nomeMetodoPesquisa);
		if (qtd == 0) {
			throw new ChamadaNaoEfetuada(nomeMetodoPesquisa);
		}
		if (qtd != qtdPesquisa) {
			throw new ChamadaEfetuadaQtdErrada(nomeMetodoPesquisa);
		}

	}

	private int contarQtdChamadas(String nomeMetodoPesquisa) {
		int qtd = 0;
		for (String nomeMetodo : chamadasList) {
			if (nomeMetodo.equalsIgnoreCase(nomeMetodoPesquisa)) {
				qtd++;
			}
		}
		return qtd;
	}

	// private void registrarChamada(String nomeMetodo) {
	// if (!chamadasMap.containsKey(nomeMetodo)) {
	// chamadasMap.put(nomeMetodo, 0);
	// }
	// chamadasMap.put(nomeMetodo, chamadasMap.get(nomeMetodo) + 1);
	// }

}
