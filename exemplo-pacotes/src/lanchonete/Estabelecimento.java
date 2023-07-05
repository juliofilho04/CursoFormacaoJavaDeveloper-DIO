package lanchonete;

import lanchonete.area.cliente.Atendente;
import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		Atendente atendente = new Atendente();
        Cliente cliente = new Cliente();

        cliente.fazerPedido();
        atendente.pegarPedido();

		cozinheiro.adicionarLancheNoBalcao();
		
		atendente.servindoMesa();

        cliente.pagarConta();
		
	}
}