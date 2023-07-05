package lanchonete.atendimento.cozinha;

public class Cozinha {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        Almoxarife almoxarife = new Almoxarife();
        Exportador exportador = new Exportador();

        almoxarife.pedirItens(exportador);

        cozinheiro.receberPedido();
        cozinheiro.selecionarIngredientesLanche();
        cozinheiro.lavarIngredientes();
        cozinheiro.prepararLanche();
        cozinheiro.adicionarLancheNoBalcao();
        
        cozinheiro.pedirParaTrocarGas(almoxarife);
        cozinheiro.pedirIngredientes(almoxarife);
    }
}
