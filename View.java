package ��������ԭ��;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class View extends JPanel implements ActionListener{
	JPanel up,center,down;
	JLabel title,inputpassword;
	JPasswordField txtpassword;
	JButton sure;
	JPanel n = new JPanel();
	JPanel menubar = new JPanel();
	JButton b1,b2,b3,b4,b5;
	static int i = 0;	
	JPanel none = new JPanel();
	JPanel Summary2 = new JPanel();
	JPanel Summary3 = new JPanel();
	JPanel Summary4 = new JPanel();
	JPanel Summary5 = new JPanel();
	JPanel Summary6 = new JPanel();
	Calculation calculation = new Calculation();
	public View(){
		up = new JPanel(); center = new JPanel(); down = new JPanel();
		title = new JLabel("��������ԭ���㷨ʵ�֣��壩"); up.add(title);
		inputpassword = new JLabel("��������"); center.add(inputpassword);
		txtpassword = new JPasswordField(16); center.add(txtpassword);
		sure = new JButton("ȷ��");  down.add(sure);
		n.setLayout(new GridLayout(4,1));
		n.add(none);n.add(up); n.add(center); n.add(down);		
		this.add(n);
		Form2();
		Form3();
		Form4();
		Form5();
		Help();
		this.add(Summary2);
		this.add(Summary3);
		this.add(Summary4);
		this.add(Summary5);
		this.add(Summary6);
		sure.addActionListener(this);
	}
	public void Page(){
		b1 = new JButton("����С����ֵ��ԭ");
		b2 = new JButton("��������������λ����Ӽ���");
		b3 = new JButton("��������ԭ��˷�");
		b4 = new JButton("����Ӽ���");
		b5 = new JButton("����");
		menubar.setVisible(true);
		menubar.add(b1);menubar.add(b2);menubar.add(b3);menubar.add(b4);menubar.add(b5);
		this.add(menubar);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void Form2(){

		JPanel p1,p2,p3,p4;
		JLabel title,input,result;
		final JTextField txtinput;
		final JTextField txtresult;
		JButton b1,b2,b3,b4,b5,b6;	
		Summary2.setVisible(false);
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		title = new JLabel("����������ֵ��ԭ������������");							p1.add(title);
		input = new JLabel("�������������");	txtinput = new JTextField(20);	p2.add(input);p2.add(txtinput);
		result = new JLabel("��ֵ��ԭ���Ϊ��");	txtresult = new JTextField(20);	p3.add(result);p3.add(txtresult);
		b1 = new JButton("����");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				txtinput.setText(null);
				txtresult.setText(null);
			}
		});
		b2 = new JButton("ԭ->��ֵ");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String s = new String();
				int i = 0,j,flag=1;
				s = txtinput.getText();
				char[] c = s.toCharArray();
				j = c.length;
				while(i<j){
					if(c[i]=='0'||c[i]=='1')
					{	flag=1;	i++;	}
					else 
					{
						JOptionPane.showMessageDialog(null, "��������ȷ�Ķ�����������"); 
						flag=0;
						break;
					}
				}
				if(flag==1){
					s = Calculation.YuanToTrue(c);
					txtresult.setText(s);
				}
		}
		});
		b3 = new JButton("��->��ֵ");
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String s = new String();
				int i = 0,j,flag=1;
				s = txtinput.getText();
				char[] c = s.toCharArray();
				j = c.length;
				while(i<j){
					if(c[i]=='0'||c[i]=='1')
					{	flag=1;	i++;	}
					else 
					{
						JOptionPane.showMessageDialog(null, "��������ȷ�Ķ�����������"); 
						flag=0;
						break;
					}
				}
				if(flag==1){
					s = Calculation.FanToTrue(c);
					txtresult.setText(s);
				}
			}
			}
		);
		b4 = new JButton("��->��ֵ");
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String s = new String();
				int i = 0,j,flag=1;
				s = txtinput.getText();
				char[] c = s.toCharArray();
				j = c.length;
				while(i<j){
					if(c[i]=='0'||c[i]=='1')
					{	flag=1;	i++;	}
					else 
					{
						JOptionPane.showMessageDialog(null, "��������ȷ�Ķ�����������"); 
						flag=0;
						break;
					}
				}
				if(flag==1){
					s = Calculation.BuToTrue(c);
					txtresult.setText(s);
				}
			}
		});
		b5 = new JButton("��->��ֵ");
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String s = new String();
				int i = 0,j,flag=1;
				s = txtinput.getText();
				char[] c = s.toCharArray();
				j = c.length;
				while(i<j){
					if(c[i]=='0'||c[i]=='1')
					{	flag=1;	i++;	}
					else 
					{
						JOptionPane.showMessageDialog(null, "��������ȷ�Ķ�����������"); 
						flag=0;
						break;
					}
				}
				if(flag==1){
					s = Calculation.YiToTrue(c);
					txtresult.setText(s);
				}
			}
		});
		b6 = new JButton("����");
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				txtinput.setText(null);
				txtresult.setText(null);
				menubar.setVisible(true);
				Summary2.setVisible(false);
			}
		});
		
		p4.setLayout(new GridLayout(1,6));
		p4.add(b1);p4.add(b2);p4.add(b3);p4.add(b4);p4.add(b5);p4.add(b6);
		Summary2.setLayout(new GridLayout(5,1));
		Summary2.add(none);Summary2.add(p1);Summary2.add(p2);Summary2.add(p3);Summary2.add(p4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	public void Form3(){
		JPanel p1,p2,p3,p4,p5,p6;
		JLabel title,input1,input2,resultplus,resultminus;
		final JTextField txtinput1;
		final JTextField txtinput2;
		final JTextField txtresultplus;
		final JTextField txtresultminus;
		JButton b1,b2,b3,b4;
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		title = new JLabel("���������ĵ�����λ����Ӽ�����");								p1.add(title);
		input1 = new JLabel("�������һ������");		txtinput1 = new JTextField(20);			p2.add(input1);p2.add(txtinput1);
		input2 = new JLabel("������ڶ�������");		txtinput2 = new JTextField(20);			p3.add(input2);p3.add(txtinput2);
		resultplus = new JLabel("�ӷ����Ϊ��");		txtresultplus = new JTextField(20);	p4.add(resultplus);p4.add(txtresultplus);
		resultminus = new JLabel("�������Ϊ��");	txtresultminus = new JTextField(20);p5.add(resultminus);p5.add(txtresultminus);
		
		b1 = new JButton("����");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				txtinput1.setText(null);
				txtinput2.setText(null);
				txtresultplus.setText(null);
				txtresultminus.setText(null);
			}
		});
		b2 = new JButton("�ӷ�");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String num1,num2;
				int i=0,j,flag=1;
				try{
					num1 = txtinput1.getText();
					num2 = txtinput2.getText();
					char[] c1 = num1.toCharArray();
					char[] c2 = num2.toCharArray();
					j = c1.length;
					while(i<j){
						if(c1[i]=='0'||c1[i]=='1')
						{	flag=1;	i++;	}
						else 
						{
							JOptionPane.showMessageDialog(null, "��һ�����������"); 
							flag=0;
							break;
						}
					}
					i=0;
					j = c2.length;
					while(i<j){
						if(c2[i]=='0'||c2[i]=='1')
						{	flag=1;	i++;	}
						else 
						{
							JOptionPane.showMessageDialog(null, "�ڶ������������"); 
							flag=0;
							break;
						}
					}
					c1 = Calculation.Complement(c1);
					c2 = Calculation.Complement(c2);
					num1 = String.valueOf(c1);
					num2 = String.valueOf(c2);	
					if(flag==1){
						num1 = Calculation.JiaFa(num1,num2);
						txtresultplus.setText(num1);
					}			
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "��������ȷ�Ķ�����������"); 
				}				
			}
		});
		b3 = new JButton("����");
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String num1,num2;
				int i,j,flag=1;
				try{
					num1 = txtinput1.getText();
					num2 = txtinput2.getText();
					char[] c1 = num1.toCharArray();
					char[] c2 = num2.toCharArray();
					i=0;
					j = c1.length;
					while(i<j){
						if(c1[i]=='0'||c1[i]=='1')
						{	flag=1;	i++;	}
						else 
						{
							JOptionPane.showMessageDialog(null, "��һ�����������"); 
							flag=0;
							break;
						}
					}
					i=0;
					j = c2.length;
					while(i<j){
						if(c2[i]=='0'||c2[i]=='1')
						{	flag=1;	i++;	}
						else 
						{
							JOptionPane.showMessageDialog(null, "�ڶ������������"); 
							flag=0;
							break;
						}
					}
					c1 = Calculation.Complement(c1);
					c2 = Calculation.Complement(c2);
					c2 = Calculation.QiuBu(c2);
					num1 = String.valueOf(c1);
					num2 = String.valueOf(c2);
					if(flag==1){
						num2 = Calculation.JiaFa(num1,num2);
						txtresultminus.setText(num2);
					}
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "��������ȷ�Ķ�����������"); 
				}
			}
		});
		b4 = new JButton("����");
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				menubar.setVisible(true);
				Summary3.setVisible(false);
			}
		});
		p6.add(b1);p6.add(b2);p6.add(b3);p6.add(b4);
		Summary3.setVisible(false);
		Summary3.setLayout(new GridLayout(6,1));
		Summary3.add(p1);Summary3.add(p2);Summary3.add(p3);Summary3.add(p4);Summary3.add(p5);Summary3.add(p6);
		b4.addActionListener(this);
	}
	public void Form4(){
		JPanel p1,p2,p3,p4,p5;
		JLabel title,input1,input2,result;
		final JTextField txtinput1;
		final JTextField txtinput2;
		final JTextField txtresult;
		JButton b1,b2,b3;

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		title = new JLabel("����������ԭ��˷�");									p1.add(title);
		input1 = new JLabel("�����뱻������");txtinput1 = new JTextField(20);	p2.add(input1);p2.add(txtinput1);
		input2 = new JLabel("�����������"); txtinput2 = new JTextField(20);		p3.add(input2);p3.add(txtinput2);
		result = new JLabel("�˷����Ϊ��"); txtresult = new JTextField(20);		p4.add(result);p4.add(txtresult);
		
		b1 = new JButton("����");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				txtinput1.setText(null);
				txtinput2.setText(null);
				txtresult.setText(null);
			}
		});
		b2 = new JButton("�˷�");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String num1,num2;
				int i=0,j,flag=1;
				try{
					num1 = txtinput1.getText();
					num2 = txtinput2.getText();
					char[] c1 = num1.toCharArray();
					char[] c2 = num2.toCharArray();
					num1 = String.valueOf(c1);
					num2 = String.valueOf(c2);
					j = c1.length;
					while(i<j){
						if(c1[i]=='0'||c1[i]=='1')
						{	flag=1;	i++;	}
						else 
						{
							JOptionPane.showMessageDialog(null, "��������ȷ�Ķ����Ʊ���������"); 
							flag=0;
							break;
						}
					}
					i=0;
					j = c2.length;
					while(i<j&&flag==1){
						if(c2[i]=='0'||c2[i]=='1')
						{	flag=1;	i++;	}
						else 
						{
							JOptionPane.showMessageDialog(null, "��������ȷ�Ķ����Ƴ�����"); 
							flag=0;
							break;
						}
					}
					if(flag==1){
						txtresult.setText(Calculation.ChengFa(c1,c2));
					}
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "��������ȷ�Ķ���������"); 
				}			
			}
		});
		b3 = new JButton("����");
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				menubar.setVisible(true);
				Summary4.setVisible(false);
			}
		});
		p5.setLayout(new GridLayout(1,3));
		p5.add(b1);p5.add(b2);p5.add(b3);
		Summary4.setVisible(false);
		Summary4.setLayout(new GridLayout(5,1));
		Summary4.add(p1);Summary4.add(p2);Summary4.add(p3);Summary4.add(p4);Summary4.add(p5);
	}
	public void Form5(){
		JPanel p0,p1,p2,p3,p4,p5,p6;
		JLabel title,E1,E2,E3,E4,M1,M2,M3,M4;
		final JTextField txtE1;
		final JTextField txtE2;
		final JTextField txtE3;
		final JTextField txtE4;
		final JTextField txtM1;
		final JTextField txtM2;
		final JTextField txtM3;
		final JTextField txtM4;
		JButton b1,b2,b3,b4;
		
		p0 = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();	p2.setLayout(new GridLayout(4,1));
		p3 = new JPanel();	p3.setLayout(new GridLayout(4,1));
		p4 = new JPanel();	p4.setLayout(new GridLayout(4,1));
		p5 = new JPanel();	p5.setLayout(new GridLayout(4,1));
		p6 = new JPanel();
		title = new JLabel("�������ļӼ�����");p1.add(title);
		E1 = new JLabel("��һ�����Ľ��룺");	p2.add(E1);
		txtE1 = new JTextField(10);			p3.add(txtE1);
		M1 = new JLabel("β����");			p4.add(M1);
		txtM1 = new JTextField(20);			p5.add(txtM1);
		E2 = new JLabel("�ڶ��������룺");	p2.add(E2);
		txtE2 = new JTextField(10);			p3.add(txtE2);
		M2 = new JLabel("β����");			p4.add(M2);
		txtM2 = new JTextField(20);			p5.add(txtM2);
		E3 = new JLabel("�ӷ��Ľ��룺");		p2.add(E3);
		txtE3 = new JTextField(10);			p3.add(txtE3);
		M3 = new JLabel("β����");				p4.add(M3);
		txtM3 = new JTextField(20);			p5.add(txtM3);
		E4 = new JLabel("�����Ľ��룺");		p2.add(E4);
		txtE4 = new JTextField(10);			p3.add(txtE4);
		M4 = new JLabel("β����");				p4.add(M4);
		txtM4 = new JTextField(20);			p5.add(txtM4);
		p0.add(p2);p0.add(p3);p0.add(p4);p0.add(p5);
		b1 = new JButton("����");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				txtE1.setText(null);
				txtE2.setText(null);
				txtE3.setText(null);
				txtE4.setText(null);
				txtM1.setText(null);
				txtM2.setText(null);
				txtM3.setText(null);
				txtM4.setText(null);
			}
		});
		b2 = new JButton("�ӷ�");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){				
				String sj1 = Calculation.jiemaQiubu(txtE1.getText()),
						sj2 = Calculation.jiemaQiubu(txtE2.getText()), 
						st1 = Calculation.weishuQiubu(txtM1.getText()),
						st2 = Calculation.weishuQiubu(txtM2.getText());
				try{
						if ((sj1.length() != sj2.length())|| (st1.length() != st2.length())) {
							JOptionPane.showMessageDialog(null, "���������Ȳ�ͬ�����������룡"); 
						} 
						else {
							String s[] = Calculation.myAdd(sj1, sj2, st1, st2);
							txtE3.setText(s[0]);
							txtM3.setText(s[1].substring(0, 1) + "0." + s[1].substring(1));
						}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "��������ȷ�Ķ���������", "����",
							JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
		b3 = new JButton("����");
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				String sj1 = Calculation.jiemaQiubu(txtE1.getText()),
						sj2 = Calculation.jiemaQiubu(txtE2.getText()),
						st1 = Calculation.weishuQiubu(txtM1.getText()),
						st2 = Calculation.weishuQiubu(txtM2.getText()), temp;
				try{
						if ((sj1.length() != sj2.length())|| (st1.length() != st2.length())) {
							JOptionPane.showMessageDialog(null, "�����볤����ȵ����ݣ�", "����",
									JOptionPane.ERROR_MESSAGE);
						} 
						else {
							temp = st2.substring(0, st2.lastIndexOf("1"));
							char c[] = temp.toCharArray();
							for (int i = 0; i < c.length; i++) {
								if (c[i] == '0')
									c[i] = '1';
								else
									c[i] = '0';
							}
							st2 = new String(c) + st2.substring(st2.lastIndexOf("1"));
							String s[] = Calculation.myAdd(sj1, sj2, st1, st2);
							txtE4.setText(s[0]);
							txtM4.setText(s[1].substring(0, 1) + "0." + s[1].substring(1));
						}
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "��������ȷ�Ķ���������", "����",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b4 = new JButton("����");
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				menubar.setVisible(true);
				Summary5.setVisible(false);
			}
		});
		p6.add(b1); p6.add(b2); p6.add(b3); p6.add(b4);
		Summary5.setVisible(false);
		Summary5.setLayout(new GridLayout(3,1));
		Summary5.add(p1);Summary5.add(p0);Summary5.add(p6);
	}
	public void Help(){
		JPanel p1;
		JLabel text1,text2;
		JButton b1;
		p1 = new JPanel();
		text1 = new JLabel("*******������ȫ����Ҫ��׼�Ķ���������������*******");
		text2 = new JLabel("��Ҫ����������µ籾��˾��ϵ�绰��10086");
		b1 = new JButton("����");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				menubar.setVisible(true);
				Summary6.setVisible(false);
			}
		});
		p1.add(b1);
		Summary6.setLayout(new GridLayout(3,1));
		Summary6.setVisible(false);
		Summary6.add(text1);Summary6.add(text2);Summary6.add(p1);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		if(e.getActionCommand().equals("ȷ��")){
			String s =  String.valueOf(txtpassword.getPassword());;
			if(s.equals("0") && i < 3){
				n.setVisible(false);
				Page();
				menubar.setVisible(true);
			}
			else if(i < 2)
			{
				i++;
				JOptionPane.showMessageDialog(null, "�����������"); 				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "�����������Ѵﵽ3�Σ���ֹ��¼��ȷ�����˳�");
				System.exit(0);
			}
		}		
		if(e.getActionCommand().equals("����С����ֵ��ԭ")){
			menubar.setVisible(false);
			Summary2.setVisible(true);
		}
		if(e.getActionCommand().equals("��������������λ����Ӽ���")){
			menubar.setVisible(false);
			Summary3.setVisible(true);
		}
		if(e.getActionCommand().equals("��������ԭ��˷�")){
			menubar.setVisible(false);
			Summary4.setVisible(true);
		}
		if(e.getActionCommand().equals("����Ӽ���")){
			menubar.setVisible(false);
			Summary5.setVisible(true);
		}
		if(e.getActionCommand().equals("����")){
			menubar.setVisible(false);
			Summary6.setVisible(true);
		}		
	}	
}