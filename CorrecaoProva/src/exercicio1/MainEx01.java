package exercicio1;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainEx01 extends JFrame{
	public static void main(String[] args) {
		MainEx01 main = new MainEx01(); 
		main.setVisible(true);
	}
	public MainEx01(){
		super();
		String ra = "160464";
		this.setLocationRelativeTo(null);
		this.setSize(600,600);
	
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		
		JScrollPane scroll = new JScrollPane();
		JTable table = new JTable();
		
		scroll.setViewportView(table);
		jp.add(scroll,BorderLayout.CENTER);
		
		table.setModel(new Ex01(ra));
		
		this.setContentPane(jp);
	}
}
