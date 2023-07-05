package lanchonete.area.cliente;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cliente {
	Random random = new Random();

	boolean sanduiche = random.nextInt(3) == 1, vitamina = random.nextInt(3) == 1;
	public static int countSanduiche = 0, countVitamina = 0, dinheiro = saldoConta();

	public void fazerPedido() {
		
		if (sanduiche && ! vitamina) {
			System.out.println("Vou querer um sanduiche");
			countSanduiche++;
		}
		else if (vitamina && ! sanduiche) {
			System.out.println("Vou querer uma vitamina");
			countVitamina++;
		}
		else {
			System.out.println("Vou querer um combo");
		}
	}
	public void pagarConta() {
		
        consultarSaldoAplicativo();

		if (sanduiche && ! vitamina) {
			if (dinheiro >= 10) {
				System.out.println("Faz um débito pra mim, por favor");
			}
			else {
				System.out.println("Ix, patrão. Tô sem dinheiro kkkk");
			}
		}
		else if (vitamina && ! sanduiche) {
			if (dinheiro >= 8) {
                System.out.println("Faz um débito pra mim, por favor");			}
			else {
				System.out.println("Ix, patrão. Tô sem dinheiro kkkk");
			}
		}
		else {
			if (dinheiro >= 16) {
				System.out.println("Faz um débito pra mim, por favor");
			}
			else {
				System.out.println("Ix, patrão. Tô sem dinheiro kkkk");
			}
		}
	}
	private void consultarSaldoAplicativo() {
		System.out.println("Seu saldo é " + dinheiro);
	}
	static int saldoConta() {
        return ThreadLocalRandom.current().nextInt(0, 25);
    }
	public int getCountSanduiche() {
		return countSanduiche;
	}
	public int getCountVitamina() {
		return countVitamina;
	}
	public boolean isSanduiche() {
		return sanduiche;
	}
	public boolean isVitamina() {
		return vitamina;
	}
}