import java.util.Scanner;

public class Ch9_6 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("������һ������");
		int num=in.nextInt();
//		KaBuLieKe83(num,0);
		
		kaBuLieKe(num);	//���÷�����֤�����п�����
	}
	         
	private static void kaBuLieKe(int n)
	{
	 	int count=0;
	 	int cha=0;
	 	
	 	/*ѭ�������ֱ����Ϊ�����п˳���*/
	 	do
	 	{
	 		/*��λ����ɵ����������С������
	 		 *����1�������������� 
	 		 *����0�����������С��
	 		 */
	 		cha = getTheMaxOrMin(n, 1) - getTheMaxOrMin(n, 0); 
	 		System.out.println(count + ":" + getTheMaxOrMin(n, 1) + "-"  
	                + getTheMaxOrMin(n, 0) + " = " + cha);  
	 		 count++;   
	 		 n=cha;
	 	}while(cha!=6174);
	 	System.out.println("��֤ͨ��");   
		
	}

		/**  
	     * 83�������п˳�����ͦ���棬ʵ��һ��  
	     */  
	public static void KaBuLieKe83(int n, int count) 
	{   
		int cha = getTheMaxOrMin(n, 1) - getTheMaxOrMin(n, 0);   
	    System.out.println(count + ":" + getTheMaxOrMin(n, 1) + "-"  
	                + getTheMaxOrMin(n, 0) + " = " + cha);   
	    count++;   
	    if (n == 6174) {   
	    	System.out.println("I did it 6174");   
	    } else {   
	    	KaBuLieKe83(cha, count);   
	    }   
	}   
	  
	/**  
	  * ��ȡ�������к�����������2310,�õ�3210����ʱֻҪ��λ  
	  */  
	public static int getTheMaxOrMin(int n, int maxOrMin) 
	{   
		if (n < 1000 || n > 9999)   
			return -1;  
		
		/*�ֽ�����ֵ�ÿλ��aΪ���λ*/
		int a = getThe(n, 4);   
		int b = getThe(n, 3);   
		int c = getThe(n, 2);   
		int d = getThe(n, 1);   
	  
		int temp = 0;   
	     
		//�ѷֽ�������ַŵ�������
		int[] list = new int[] {a,b,c,d};   
		
		/*ð�ݷ�����������
		 * maxOrMin == 1����������
		 * maxOrMin == 0����������
		 */
		for (int i = 0; i < 4; i++) 
		{   
			for (int j = i; j < 4; j++) 
			{   
				if (maxOrMin == 1 ? (list[i]<list[j]) : (list[i]>list[j])) 
				{   
					temp =list[i];   
					list[i]= list[j];   
					list[j] = temp;   
				}   
			}   
		}   
	    return list[0] * 1000 + list[1] * 100 + list[2] * 10 + list[3];   
	}
	
	/**  
	  * ��ȡN�Ӻ���ǰ����iλ  
	  */  
	public static int  getThe(int num, int i) 
	{   
		if (i > getBitCount(num) || i < 1)   
			return -1;   
	    return (num % ((int) Math.pow(10, i))) / (int) Math.pow(10, i - 1);   
	}   
	  
	/**  
	  * ��ȡһ������λ��  
	  */  
	public static int getBitCount(int n) 
	{   
		int i = 1;   
	    while (n / 10 > 0) 
	    {   
	    	i++;   
	        n /= 10;   
	    }   
	    return i;   
	}   
} 