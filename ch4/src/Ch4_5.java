
public class Ch4_5 
{
	public static void main(String[] args) 
	{
		System.out.println("1000���ڵĻ����������£�");
		for(int i = 2;i <= 1000;i++)
		{
			/*
			 * prime(i)�ж�i�ǲ�������������ֵΪ1��������
			 * huiWen(i)�ж�i�ǲ��ǻ��ģ�����ֵΪ1���ǻ���
			 */
			if(prime(i)==1&&huiWen(i)==1)
			{
				System.out.printf("%d ",i);
			}
		}
		System.out.printf("\n");

	}

	static int prime(int a)
	{
		for(int i = 2;i <= java.lang.Math.sqrt(a) ;i++)
		{
			if(a%i==0)
				return 0;
		}
		return 1;
	}
	
	static String trans(int bk)//����ת�����ַ���
	{
		int a = bk;
		String res = "";
		while(a!=0)
		{
			int b = a%10; 
			res = b + res;
			a = a/10;
		}
		return res;
	}
	
	static int huiWen(int a)
	{
		//trans(a)����aת�����ַ���
		String str = trans(a);
//		String str=String.valueOf(a);
		int ls = str.length();
		for(int i = 0;i < ls;i++)
		{
			if(str.codePointAt(i)!=str.codePointAt(ls - 1 - i))
			{
				return 0;
			}
		}
		return 1;
	}
}
