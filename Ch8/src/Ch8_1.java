import java.util.Scanner;

public class Ch8_1 
{	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
		int n=sc.nextInt();
		
		//�ж��ǲ�������������ǣ��Ͳ��÷ֽ��ˣ����򣬷ֽ⡣
		if(PrimeNum(n))
		{
			System.out.println("����һ����������Ҫ�ֽ⣡");
		}
		else
		{
			System.out.println("��������Էֽ�Ϊ�� ");
		    for(int i=2;i<=n;)
		    {
		    	if(n%i==0)
		    	{
		    		if(n/i==1)//���һ���������ж�
		    		{
		    			System.out.print(i);
		    			break;
		    		}
		    		else
		    		{	System.out.print(i+"*");
		            	n=n/i;
		    		}
		        }
		    	else
		    	{
		    		i++;
		        }
		    }    
		}
	}
	
	/*�ж��ǲ�������*/
	public static  boolean PrimeNum(int a)
	{
		boolean flag=true;
		for(int j=2;j<=a/2;j++)
		{
			if(a%j==0)
			{
				flag=false;
		        break;
		    }
		}
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}