package Polimorfismo.apps;

public class Telegram extends ServicoMensagemInstantanea 
{
    @Override
    public void enviarMensagem() 
	{
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() 
	{
        System.out.println("Recebendo mensagem pelo Telegram");
    }

    @Override
    public void salvarHistoricoMensagem() 
	{
        // Implementação do método
        System.out.println("Histórico de mensagens salvo no Telegram.");
    }
}
