package ��������ԭ��;
import javax.swing.JFrame;
public class Main extends JFrame{
	View pass;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Main main = new Main();
	}
	public Main(){
		pass = new View();
		this.add(pass);
		this.setTitle("��������ԭ��");
		this.setResizable(false); 
		this.setSize(700, 300);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ȫ�ر�
		this.setVisible(true);
	}
}


