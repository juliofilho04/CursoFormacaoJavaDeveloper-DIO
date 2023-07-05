package lanchonete.atendimento.cozinha;

public class Almoxarife {
	void pedirItens(Exportador exportador) {
		exportador.entregarItens();
		controlarEntrada();
	}
	private void controlarEntrada() {
		System.out.println("*Controlando a entrada dos itens*");
	}
	private void controlarSaida() {
		System.out.println("*Controlando a saída dos itens*");
	}
	void entregarIngredientes() {
		System.out.println("*Entregando: saco de pão, ovos, proteínas, vegetais, caixa de leite, bananas e caixa de aveia*");
		controlarSaida();
	}
	void trocarGas() {
		System.out.println("*Trocando o gás*");
	}
}