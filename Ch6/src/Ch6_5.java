import java.util.Scanner;

public class Ch6_5 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int  a,b,c;
		String go;
		do
		{
			System.out.printf("������һ������(a/b)��");
			String s=in.next();
			int index=s.indexOf('/');
			a=Integer.parseInt(s.substring(0, index));
			b=Integer.parseInt(s.substring(index+1)); /*�������a�ͷ�ĸb*/
			System.out.printf("���ɱ��ֽ�Ϊ��");
			while(true)
			{
				if(b%a!=0) /*�����Ӳ���������ĸ*/
					c=b/a+1; /*��ֽ��һ����ĸΪb/a+1�İ�������*/
				else
				{
					c=b/a;
					a=1;
				} /*������������������(��������)*/
				if(a==1)
				{
					System.out.printf("1/%d\n",c);
					break; /*aΪ1��־����*/
				}
				else
					System.out.printf("1/%d + ",c);
				
				a=a*c-b; /*��������ķ���*/
				b=b*c; /*��������ķ�ĸ*/

			}
			System.out.print("\n������y/n����");
			go=in.next();
		}while(go.equals("y"));
		System.out.print("\n���������");
	}
}
