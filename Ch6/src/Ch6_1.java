import java.util.Scanner;


public class Ch6_1 
{
	static int gcd2(int a,int b)
	{
		if(a%b==0)
			return b;
		else
			return gcd2(b,a%b);
	}
	
	
	/*�Զ��庯�������������Լ��*/
	static int gcd(int a,int b)   
	{
		int  temp;         
		
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
		return a;            /*�������Լ�������ú�����*/ 
	}

	public static void main(String[] args) 
	{	
		Scanner in=new Scanner(System.in);
		int m,n,t1;  
		 
		System.out.print("�������һ��������");
		m=in.nextInt();		 /*ͨ���ն�����������*/
		System.out.print("������ڶ���������"); 
		n=in.nextInt();
		
		//�������Լ������
//		t1=gcd(m,n);                    
		t1=gcd2(m,n);  
		
		System.out.print("���Լ���� "+t1);  /*������Լ��*/
		
	}

}
