package lanchonete.atendimento.cozinha;

import lanchonete.area.cliente.Atendente;
import lanchonete.area.cliente.Cliente;
import java.util.Random;

public class Cozinheiro {
	Random random = new Random();
	Cliente cliente = new Cliente();
	Atendente atendente = new Atendente();

	boolean sanduiche = random.nextInt(3) == 1, vitamina = random.nextInt(3) == 1;
	
	void receberPedido() {
		sanduiche = isSanduiche();
		vitamina = isVitamina();

		if (sanduiche && ! vitamina) {
			System.out.println("Beleza. Descendo um sanduiche");
		}
		else if (vitamina && ! sanduiche) {
			System.out.println("Beleza. Descendo uma vitamina");
		}
		else {
			System.out.println("Beleza. Descendo um combo");
		}
	}
    void selecionarIngredientesLanche() {
		sanduiche = isSanduiche();
		vitamina = isVitamina();
		
		if (sanduiche && ! vitamina) {
			System.out.println("*Selecionando: pão, ovo, proteína e vegetais*");
		}
		else if (vitamina && ! sanduiche) {
			System.out.println("*Selecionando: leite, banana e aveia*");
		}
		else {
			System.out.println("*Selecionando: pão, ovo, proteína e vegetais*");
			System.out.println("*Selecionando: leite, banana e aveia*");
		}
	}
    void lavarIngredientes() {
		System.out.println("*Lavando os ingredientes*");
	}
	void prepararLanche() {
		sanduiche = isSanduiche();
		vitamina = isVitamina();
		
		if (sanduiche && ! vitamina) {
			fritarIngredientesLanche();
			System.out.println("*Preparando um sanduiche*");
		}
		else if (vitamina && ! sanduiche) {
			baterVitaminaLiquidificador();
		}
		else {
			System.out.println("*Preparando um combo*");
			fritarIngredientesLanche();
			baterVitaminaLiquidificador();
		}
	}
	void baterVitaminaLiquidificador() {
		System.out.println("*Batendo a vitamina no liquidificador*");
	}
	void fritarIngredientesLanche() {
        System.out.println("*fritando a carne e o ovo*");
	}
	public void adicionarLancheNoBalcao() {
        sanduiche = isSanduiche();
		vitamina = isVitamina();

		if (sanduiche && ! vitamina) {
			System.out.println("*Adicionando sanduiche no balcão*");
		}
		else if (vitamina && ! sanduiche) {
			System.out.println("*Adicionando vitamina no balcão*");
		}
		else {
			System.out.println("*Adicionando combo no balcão*");
		}
	}
    void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	public boolean isSanduiche() {
		return sanduiche;
	}
	public boolean isVitamina() {
		return vitamina;
	}
}
