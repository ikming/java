import java.util.Scanner;


public class Ch5_4 
{

	/*
	 * ����a��ÿλ�ϵ�����
	 * ����length�����ĳ���
	 * ������length��a��ɵ���
	 */
	public static int getNum(int a,int length)
	{
		int v=0;
		int s=1;
		for(int i=0;i<length;i++)
		{
			v=v+a*s;
			s=s*10;
		}
		
		return v;
	}
	
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("������a��ֵ��");
		int a=in.nextInt();
//		int w=a;//��¼��λ������λ��һֱ���ֲ���
		System.out.print("������n��ֵ��");
		int n=in.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
//			sum=sum+a;
//			a=a*10+w;
			sum=sum+getNum(a,i);
		}
		
		System.out.print("���ʽ��ֵ��"+sum);

	}

}
