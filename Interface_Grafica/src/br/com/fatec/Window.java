package br.com.fatec;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame implements ActionListener {
	private JButton j1, j2;
	private int count = 0;
	private JLabel lcount;
	
	public Window() {
		super("Exemplo de JButtons e Eventos");
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 3));
		j1 = new JButton("Somar");
		j2 = new JButton("Subtrair");
		lcount = new JLabel(""+count);
		c.add(j1);c.add(j2);c.add(lcount);
		j1.addActionListener(this); j2.addActionListener(this);
		pack();
		setVisible(true);
		setDefaultCloseOperation(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == j1)
			count+=1;
		
		else if(e.getSource() == j2)
			count-=1;
		
		lcount.setText(""+count);
	}
}
