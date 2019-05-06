import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
	private Socket socketCliente;
	
	public Cliente() throws Exception{
		System.out.println("Fazendo conexão");
		socketCliente = new Socket("172.16.3.61", 999);	
	}
	
	public void conectar() throws Exception{
		PrintWriter escritor = new PrintWriter(socketCliente.getOutputStream());
		System.out.println("tá indo...");
		System.out.println("Enviado para o servidor!");
		escritor.write("SAUVESKATEBOARD");
		escritor.close();
	}

}
