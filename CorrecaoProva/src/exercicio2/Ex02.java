package exercicio2;

import javax.swing.JFrame;

public class Ex02 extends JFrame {

	public static void main(String[] args) {
		Ex02 main = new Ex02();
		main.setSize(500,500);
		main.setLocationRelativeTo(null);
		main.setVisible(true);
	}
	public Ex02(){
		super();
		MyPanel jp = new MyPanel();
		this.setContentPane(jp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
