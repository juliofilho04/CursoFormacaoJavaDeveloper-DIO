package computador.apps;
public class MSNmessenger extends ServicoMensagemInstantanea{
	
	public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }
}