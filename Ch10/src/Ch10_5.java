import java.util.Random;
import java.util.Scanner;

public class Ch10_5 
{
	static Random r=new Random(); 
	static Scanner in=new Scanner(System.in);

	static int people(int t)
	{
		int a;
		do
		{
			System.out.printf("�뱨����");
			a=in.nextInt();
			if(a>2||a<1||t+a>30)
				System.out.printf("���������ر���\n");
			else
				System.out.printf("��ı�����%d \n",t+a);
		}while(a>2||a<1||t+a>30);
		return t+a; /*���ص�ǰ���Ѿ�ȡ�ߵ����ۼӺ�*/
	}
	
	static int computer(int s)
	{
		int c;
		System.out.printf("������ı�����");
		if((s+1)%3==0) /*��ʣ�������ģΪ1����ȡ1*/
		{	
			s++;
			System.out.printf(" %d \n",s);
		}
		else if((s+2)%3==0)/*��ʣ�������ģΪ2����ȡ2*/
		{
			s+=2; 
			System.out.printf(" %d \n",s);
		}
		else              /*�������ȡ1��2*/
		{
			c=r.nextInt(2)+1; 
			s+=c;
			System.out.printf(" %d \n",s);
		}
		return s;
	}
	
	public static void main(String[] args) 
	{
		Random r=new Random(); 
		int tol=0;//������ʼֵΪ0
		System.out.printf(" * * * * * * * *��30* * * * * * * \n");
		System.out.printf("��Ϸ��ʼ\n");
		
		/*ȡ�����������������˭���ߵ�һ��*/
		if(r.nextInt(2)==1) 
			tol=people(tol); //��Ϊ1�������ߵ�һ��
		
		while(tol!=30) /*��Ϸ��������*/
		{
			tol=computer(tol);
			if(tol==30) /*�����ȡһ��������Ϊ30�����ʤ��*/
			{
				System.out.printf("\n������! ");
				break;
			}
			
			tol=people(tol);
			if(tol==30) /*��ȡһ��������Ϊ30����ʤ��*/
			{
				System.out.printf("\n��Ӯ��! ");
				break;
			}
		}
		System.out.printf("\n * * * * * * * *��Ϸ���� * * * * * * * * ");
	}
}


