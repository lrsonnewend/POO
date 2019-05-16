package conexoes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Servidor extends Thread {
	private ServerSocket socketServidor;
	private static ArrayList<BufferedWriter>clientes;           
	private String nome;
	private Socket con;
	private InputStream in;  
	private InputStreamReader inr;  
	private BufferedReader bfr;
	
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

