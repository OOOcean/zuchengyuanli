package 计算机组成原理;
public class Calculation {
	//原码->真值
	public static String YuanToTrue(char[] c1){
		String s = new String();
		int i=0,j=0,x=0;		
		if(c1[0]=='0')s+='+';
		else s+='-';
		i = c1.length;
		while(i>1){
			x += Integer.parseInt(String.valueOf(c1[i-1]))*pow(2,j);
			i--;j++;
		}
		s += String.valueOf(x);
		return s;
	}	
	//求十进制数
	private static int pow(int a, int n) {
		// TODO 自动生成的方法存根
		if(n==0){
	        return 1;
	    }
		else{
	        return a*pow(a,n-1);
	    }
	}
	//反码->真值
	public static String FanToTrue(char[] c2) {
		// TODO 自动生成的方法存根
		String s = new String();
		int i=1,j=0,k,x=0;
		if(c2[0]=='0')s+='+';
		else s+='-';
		k=c2.length;
		while(i<k){
			if(c2[i]=='0')
				c2[i]='1';
			else
				c2[i]='0';
			i++;
		}
		while(i>1){
			x += Integer.parseInt(String.valueOf(c2[i-1]))*pow(2,j);
			i--;j++;
		}
		s += String.valueOf(x);
		return s;
	}
	//补码->真值
	public static String BuToTrue(char[] c3) {
		// TODO 自动生成的方法存根
		String s = new String();
		int i=1,j=0,k,x=0;
		int flag=1;
		if(c3[0]=='0')s+='+';
		else s+='-';
		k=c3.length;
		while(i<k){
			if(c3[i]=='0')
				c3[i]='1';
			else
				c3[i]='0';
			i++;
		}
		i--;
		while(i>0){
			if(c3[i]=='1'&&flag==1)
			{
				c3[i]='0';
				flag=1;
			}
			else if(c3[i]=='0'&&flag==1)
			{
				flag=0;
				c3[i]='1';
			}
			else if(flag==0)
			{
				break;
			}
			i--;
		}
		while(k>1){
			x += Integer.parseInt(String.valueOf(c3[k-1]))*pow(2,j);
			k--;j++;
		}
		s += String.valueOf(x);
		return s;
	}
	//移码->真值
	public static String YiToTrue(char[] c4) {
		// TODO 自动生成的方法存根
		String s = new String();
		int i=1,j=0,k,x=0;
		int flag=1;
		k=c4.length;
		while(i<k){
			if(c4[i]=='0')
				c4[i]='1';
			else
				c4[i]='0';
			i++;
		}
		i--;
		while(i>0){
			if(c4[i]=='1'&&flag==1)
			{
				c4[i]='0';
				flag=1;
			}
			else if(c4[i]=='0'&&flag==1)
			{
				flag=0;
				c4[i]='1';
			}
			else if(flag==0)
			{
				break;
			}
			i--;
		}
		if(c4[0]=='0')s+='-';
		else if(c4[0]=='1')s+='+';
		while(k>1){
			x += Integer.parseInt(String.valueOf(c4[k-1]))*pow(2,j);
			k--;j++;
		}
		s += String.valueOf(x);
		return s;
	}
	//加法
	public static String JiaFa(String a, String b) {
	    int carry=0;
	    int sum=0;
	    int opa=0;
	    int opb=0;
	    StringBuilder result=new  StringBuilder();
	    while(a.length()!=b.length()){
	        if(a.length()>b.length()){
	            b="0"+b;
	        }else{
	            a="0"+a;
	        }
	    }
	    for(int i=a.length()-1;i>=0;i--){
	        opa=a.charAt(i)-'0';
	        opb=b.charAt(i)-'0';
	        sum=opa+opb+carry;
	        if(sum>=2){
	            result.append((char) (sum-2 +'0'));
	            carry=1;
	        }else{
	            result.append((char) (sum +'0'));
	            carry=0;
	        }	       
	    }
	     if(carry==1){
	            result.append("1");
	        }
	    return result.reverse().toString();
	    }
	//补码
	public static char[] Complement(char[] c) {
		// TODO 自动生成的方法存根
		if(c[0]=='1'){
			int i=1,k,flag=1;
			k=c.length;
			while(i<k){
				if(c[i]=='0')
					c[i]='1';
				else
					c[i]='0';
				i++;
			}
			i--;
			while(i>0){
				if(c[i]=='1'&&flag==1)
				{
					c[i]='0';
					flag=1;
				}
				else if(c[i]=='0'&&flag==1)
				{
					flag=0;
					c[i]='1';
				}
				else if(flag==0)
				{
					break;
				}
				i--;
			}
		}
		return c;
	}
	//求补
	public static char[] QiuBu(char[] c) {
		// TODO 自动生成的方法存根
			int i=0,k;
			int flag=1;
			k=c.length;
			while(i<k){
				if(c[i]=='0')
					c[i]='1';
				else
					c[i]='0';
				i++;
			}
			i--;
			while(i>=0){
				if(c[i]=='1'&&flag==1)
				{
					c[i]='0';
					flag=1;
				}
				else if(c[i]=='0'&&flag==1)
				{
					flag=0;
					c[i]='1';
				}
				else if(flag==0)
				{
					break;
				}
				i--;
			}		
		return c;
	}
	//乘法
	public static String ChengFa(char[] c1, char[] c2) {
		// TODO 自动生成的方法存根
		String s1,s2;
		int i,x=0,j=0;
		s1 = String.valueOf(c1);
		s2 = String.valueOf(c1);
		i = c1.length;
		while(i>0){
			x += Integer.parseInt(String.valueOf(c2[i-1]))*pow(2,j);
			i--;j++;
		}
		for(i=1;i<x;i++){
			s1 = JiaFa(s1,s2);
		}
		return s1;
	}
	//获取阶码
	static String calculate(String s1, String s2) {
		char ac = '0';//进位
		char a1[] = s1.toCharArray(), a2[] = s2.toCharArray();
		for (int i = a1.length - 1; i >= 0; i--) {
			if (a1[i] == '0' && a2[i] == '0' && ac == '0') {
				a2[i] = '0';
				ac = '0';
			} else if (a1[i] == '0' && a2[i] == '0' && ac == '1') {
				a2[i] = '1';
				ac = '0';
			} else if (a1[i] == '0' && a2[i] == '1' && ac == '0') {
				a2[i] = '1';
				ac = '0';
			} else if (a1[i] == '1' && a2[i] == '0' && ac == '0') {
				a2[i] = '1';
				ac = '0';
			} else if (a1[i] == '0' && a2[i] == '1' && ac == '1') {
				a2[i] = '0';
				ac = '1';
			} else if (a1[i] == '1' && a2[i] == '1' && ac == '0') {
				a2[i] = '0';
				ac = '1';
			} else if (a1[i] == '1' && a2[i] == '0' && ac == '1') {
				a2[i] = '0';
				ac = '1';
			} else if (a1[i] == '1' && a2[i] == '1' && ac == '1') {
				a2[i] = '1';
				ac = '1';
			}
		}
		return new String(a2);
	}
	public static String jiemaQiubu(String s)//求补
	{
		if (s.startsWith("0") || s.startsWith("1")) {
			s = "00" + s;
		}
		if (s.startsWith("+")) {
			s = "00" + s.substring(1);
		}
		if (s.startsWith("-")) {
			String temp = s.substring(1, s.lastIndexOf("1"));
			char c[] = temp.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '0')
					c[i] = '1';
				else
					c[i] = '0';
			}
			temp = new String(c);
			s = "11" + temp + s.substring(s.lastIndexOf("1"));
		}
		return s;
	}
	public static String weishuQiubu(String s)/* 尾数求变形补码(缺省小数点，多加长度个0) */
	{
		if (s.startsWith("0")) {
			String str = s.substring(2).replaceAll("1", "0");
			s = "00" + s.substring(2) + str;
		}
		if (s.startsWith("+")) {
			String str = s.substring(3).replaceAll("1", "0");
			s = "00" + s.substring(3) + str;
		}
		if (s.startsWith("-")) {
			String temp = null, str = s.substring(3).replaceAll("1", "0");
			temp = s.substring(3, s.lastIndexOf("1"));
			char c[] = temp.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '0')
					c[i] = '1';
				else
					c[i] = '0';
			}
			temp = new String(c);
			s = "11" + temp + s.substring(s.lastIndexOf("1")) + str;
		}
		return s;
	}
	public static int toSubstract(String sj1, String sj2)/* 求阶差 */
	{
		int sum = 0, signal = 0;
		char cj2[] = sj2.substring(0, sj2.lastIndexOf("1")).toCharArray();
		for (int i = 0; i < cj2.length; i++) {
			if (cj2[i] == '0')
				cj2[i] = '1';
			else
				cj2[i] = '0';
		}
		sj2 = new String(cj2) + sj2.substring(sj2.lastIndexOf("1"));
		String temp = calculate(sj1, sj2);
		if (temp.startsWith("00"))/* 第二个数阶码小 */
		{
			signal = 1;
			temp = temp.substring(2);
		}
		if (temp.startsWith("11"))/* 第一个数阶码小 */
		{
			signal = -1;
			String str = temp.substring(2, temp.lastIndexOf("1"));
			char c[] = str.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '0')
					c[i] = '1';
				else
					c[i] = '0';
			}
			temp = new String(c) + temp.substring(temp.lastIndexOf("1"));
		} 
		int n[] = new int[temp.length()];
		for (int i = 0; i < n.length; i++) {
			if (temp.substring(i, i + 1).equals("0"))
				n[i] = 0;
			else
				n[i] = 1;
		}
		for (int i = n.length - 2; i >= 0; i--) {
			for (int j = i; j >= i; j--) {
				n[i] = n[i] * 2;
			}
		}
		for (int i = 0; i < n.length; i++) {
			sum = sum + n[i];
		}
		sum = sum * signal;
		return sum;
	}
	public static String bumaHuanyuan(String s)/* 变形补码还原真值处理，无小数点 */
	{
		if (s.startsWith("00")) {
			s = "+" + s.substring(2);
		} else if (s.startsWith("11")) {
			String temp = s.substring(2, s.lastIndexOf("1"));
			char c[] = temp.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '0')
					c[i] = '1';
				else
					c[i] = '0';
			}
			temp = new String(c);
			s = "-" + temp + s.substring(s.lastIndexOf("1"));
		}
		return s;
	}
	public static String[] myAdd(String sj1, String sj2, String st1, String st2) {
		String s[] = new String[2];
		int n = 0, count = 0, len = (st1.length() - 2) / 2;
		n = toSubstract(sj1, sj2);/* 求阶差 */
		if (n < 0)/* 第一个数的尾数右移 */
		{
			for (int i = n; i < 0; i++) {
				st1 = st1.substring(0, 1) + st1.substring(0, st1.length() - 1);
			}
			sj1 = sj2;/* 统一阶码 */
		}
		if (n > 0)/* 第二个数的尾数右移 */
		{
			for (int i = 1; i <= n; i++) {
				st2 = st2.substring(0, 1) + st2.substring(0, st2.length() - 1);
			}
			sj2 = sj1;/* 统一阶码 */
		}
		st1 = calculate(st1, st2);/* 尾数求和 */
		while (!(st1.startsWith("001") || st1.startsWith("110")))/* 规格化 */
		{
			if (st1.startsWith("000") || st1.startsWith("111"))/* 尾数左移 */
			{
				st1 = st1.substring(1) + "0";
				count++;
			} else if (st1.startsWith("01") || st1.startsWith("10"))/* 尾数右移 */
			{
				st1 = st1.substring(0, 1) + st1.substring(0, st1.length() - 1);
				count--;
			}
		}
		while (count > 0)/* 阶码循环减一 */
		{
			String temp = sj1.replaceAll("0", "1");
			temp = temp.substring(1) + "1";
			sj1 = calculate(sj1, temp);
			count--;
		}
		while (count < 0) {
			String temp = sj1.replaceAll("1", "0");
			temp = temp.substring(1) + "1";
			sj1 = calculate(sj1, temp);
			count++;
		}
		sj1 = bumaHuanyuan(sj1);
		st1 = st1.substring(0, len + 3);
		if (st1.endsWith("1"))/* 尾数舍入处理 */
		{
			String temp = st1.replaceAll("1", "0");
			temp = temp.substring(1) + "1";
			st1 = calculate(st1, temp);
		} else if (st1.endsWith("0")) {
		}
		st1 = st1.substring(0, st1.length() - 1);
		st1 = bumaHuanyuan(st1);/* 尾数补码还原处理 */
		s[0] = sj1;
		s[1] = st1;
		return s;
	}
}