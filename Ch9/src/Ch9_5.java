import java.util.Scanner;

public class Ch9_5 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("������һ����������2λ����");
		int num=in.nextInt();
		
		int length=getLength(num);//�����ĳ���
		
		int reverse=getReverse(num,length);//�����ķ�����
		
		if(num==reverse)//�жϱ����뷴�����Ƿ���ȣ�
			System.out.print(num+"�ǻ�����");
		else
			System.out.print(num+"���ǻ�����");
			

	}

	/*������*/
	private static int getReverse(int num, int length) 
	{
		int i;
		int tmp;
		int sum=0;
		
		/*�������ֳ��ȣ��Ӻ���ǰѭ������ÿһλ*/
		for(i=1;i<=length;i++)
		{
			tmp=num%10;//ȡ��ǰ�������һλ����
			//����10�Ĵη���������������Ȩ�أ��ۼ�
			sum=sum+tmp*pow(length-i);
			num=num/10;//ɾ�����һλ
		}
		return sum;
	}

	/*��10�Ĵη�*/
	private static int pow(int n) 
	{
		int i;
		int s=1;
		for(i=0;i<n;i++)
		{
			s=s*10;//��ͣ�ĳ���10
		}
		return s;
	}

	/*������num�ĳ���*/
	private static int getLength(int num) 
	{
		int count=0;
		/*ÿ�δ�����β��ȡ��һ�����������ж�*/
		while(num!=0)
		{
			count++;
			num=num/10;//�ض�β�����һλ
		}
		return count;
	}

}
