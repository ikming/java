public class Ch9_7 
{
	public static void main(String[] args) 
	{
		int b[]={2,3,2},m[]={3,5,7};
		int a[]=new int[3];
		
		int s=shengyu(b,m);//����ͨ���ǰ�벿��
		
		int t=1;
		//����ͨ��ĺ�벿��
		for(int i=0;i<m.length;i++)
		{
			t=t*m[i];
		}
		System.out.print("��Ϊ��"+s+"+"+t+"x(x��Z)");
	
	}

	private static int shengyu(int[] b, int[] m) 
	{
		int s[]=new int[b.length];//��Ž��ÿһ��
		int t[]=new int[b.length];//�����������������С������
		int sum=0;
		
		/*����������������С������*/
		for(int i=0;i<b.length;i++)
		{
			//����������������������С���������±�ѭ������
			t[i]=lcd(m[(i%b.length+1)%b.length],m[(i%b.length+2)%b.length]);
		}
//		print(t);
		/*������ÿ��������*/
		for(int i=0;i<b.length;i++)
		{
			s[i]=item(b[i],m[i],t[i]);
		}
//		print(s);
		for(int i=0;i<b.length;i++)
		{
			sum=sum+s[i];
		}
		
		return sum;
	}
	
	
	 /*�Զ��庯������������С������*/
	static int lcd(int a,int b)   
	{
		int as,bs;
		int  temp;   
		
		as=a;
		bs=b;
			
		/*�����м�����������������������ŵ�a�С���ŵ�b��*/
		if(a<b)             
		{
			temp=a;
			a=b;
			b=temp;
		} 
		while(b!=0)           /*ͨ��ѭ����������������ֱ������Ϊ0*/
	    {
			temp=a%b;
			a=b;              /*������ֵ����*/
			b=temp;
	    }
		return as*bs/a;            /*������С�����������ú�����*/ 
	}
	
	/**���ؽ��һ����
	 * ����a������
	 * ����b������
	 * ����c�������������С������
	 */
	static int item(int a,int b,int c)
	{
		int i=1;
		int t=c;
		while(t%b!=a)
		{
			i++;
			t=c*i;
		}
		return t;
	}
	
	//������
	static void print(int[] s)
	{
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+" ");
	}

}
