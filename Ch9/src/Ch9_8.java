import java.util.Scanner;

public class Ch9_8 
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		Scanner in=new Scanner(System.in);
		System.out.print("��������֤��Χ�����������ڵ�����");
		int max=in.nextInt(); /*��������*/
		
		for(a=1;a<=max;a++)
		{
			b=a*a*a; /*�����������η�*/
			System.out.printf("%d�����η� = %d = ",a,b);
		
			/*������У�����Ϊa*a-a+1,�Ȳ�ֵΪ2*/
			for(d=0,c=0;c<a;c++) 
			{
				/*�����е�ǰa��ĺ�*/
				d+=a*a-a+1+c*2; 
				/*����ǵ�һ�����+��*/
				System.out.printf(c==0?"%d":"+%d",a*a-a+1+c*2);
			}
			if(d==b)
				System.out.print(" ��֤ͨ��\n"); //��������������֤ͨ��
			else 
				System.out.printf(" ��֤ʧ��\n"); //����ʧ��
		}
	}


}
