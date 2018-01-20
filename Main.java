package 计算机组成原理;
import javax.swing.JFrame;
public class Main extends JFrame{
	View pass;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Main main = new Main();
	}
	public Main(){
		pass = new View();
		this.add(pass);
		this.setTitle("计算机组成原理");
		this.setResizable(false); 
		this.setSize(700, 300);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置完全关闭
		this.setVisible(true);
	}
}


