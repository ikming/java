public class Ch8_5 
{

	static final int A=12;//��ƿ����
	static final int B=8; //��ƿ����
	static final int C=5; //Сƿ����
	
	static int a = A;//��ƿ��ʵ�ʾ���
	static int b = 0;//��ƿ��ʵ�ʾ���
	static int c = 0;//Сƿ��ʵ�ʾ���
	
	public static void main(String[] args) 
	{
		while(a != A/2)
		{
			if(b==0)A_To_B();     //��ƿ����ƿ����
            if(c==C)C_To_A();     //Сƿ����ƿ����
            else if(b!=0)B_To_C();//��ƿ��Сƿ����
		} 
	}

	/*��ƿ����ƿ����*/
	static void A_To_B()
	{
		if(a>B)
			b=B;
		else
			b=a;
		a=a-b;
		System.out.printf("\na->b:\t a=%d\tb=%d\tc=%d\t",a,b,c);
	} 
	
	/*��ƿ��Сƿ����*/
	static void B_To_C()
	{
		int n = c;
		if(b+c>C)
		{	
			c=C;
			b=b-(C-n);
		}
		else 
		{	
			c=b+c;
			b=0;
		}
		System.out.printf("\nb->c:\t a=%d\tb=%d\tc=%d\t",a,b,c);
	}
	
	/*Сƿ����ƿ����*/
	static void C_To_A()
	{
		a =a+c;
		c = 0;
		System.out.printf("\nc->a:\t a=%d\tb=%d\tc=%d\t",a,b,c);
	}
     
}  


