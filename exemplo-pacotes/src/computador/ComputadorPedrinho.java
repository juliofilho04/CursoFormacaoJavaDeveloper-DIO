package computador;

import computador.apps.FacebookMessenger;
import computador.apps.MSNmessenger;
import computador.apps.ServicoMensagemInstantanea;
import computador.apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido = "tlg"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNmessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}