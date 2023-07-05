package lanchonete.area.cliente;

public class Atendente {
	Cliente cliente = new Cliente();

    public void pegarPedido() {
		int sanduiche = cliente.getCountSanduiche();
		int vitamina = cliente.getCountVitamina();

		if (sanduiche == 1 && vitamina == 0) {
			System.out.println("OK. Já volto com seu sanduiche");
		}
		else if (vitamina == 1 && sanduiche == 0) {
			System.out.println("OK. Já volto com sua vitamina");
		}
		else {
			System.out.println("OK. Já volto com seu combo");
		}
    }
	public void enviarPedidoACozinha() {
		int sanduiche = cliente.getCountSanduiche();
		int vitamina = cliente.getCountVitamina();
		
		if (sanduiche == 1 && vitamina == 0) {
			System.out.println("Jorginhow. Desce um sanduiche pra mim ae");
		}
		else if (vitamina == 1 && sanduiche == 0) {
			System.out.println("Jorginhow. Desce uma vitamina pra mim ae");
		}
		else {
			System.out.println("Jorginhow. Desce um combo pra mim ae");
		}
	}
	public void servindoMesa() {
		pegarLancheBalcao();
		System.out.println("*Servindo a mesa*");
	}
	private void pegarLancheBalcao() {
		System.out.println("*Pegando lanche no balcao*");
	}
}
