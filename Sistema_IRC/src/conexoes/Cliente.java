package conexoes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import javax.swing.*;

public class Cliente extends JFrame implements ActionListener, KeyListener{
	private Socket socketCliente;
	private static final long serialVersionUID = 1L;
	private JTextArea texto;
	private JTextField txtMsg;
	private JButton btnSend;
	private JButton btnSair;
	private JLabel lblHistorico;
	private JLabel lblMsg;
	private JPanel pnlContent;
	private OutputStream ou ;
	private Writer ouw; 
	private BufferedWriter bfw;
	private JTextField txtIP;
	private JTextField txtPorta;
	private JTextField txtNome;
	
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