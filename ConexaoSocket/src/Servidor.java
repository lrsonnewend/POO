import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	private ServerSocket socketServidor;
	
	public Servidor() throws IOException{
		System.out.println("Server start");
		socketServidor = new ServerSocket(999);
	}	
		
	public void iniciar() throws Exception{
		while(true) {
			Socket listen = socketServidor.accept();
			InputStreamReader streamReader = new InputStreamReader(listen.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			String message = reader.readLine();
			System.out.println(message);
			reader.close();
		}
	}
}

