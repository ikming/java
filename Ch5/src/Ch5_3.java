import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class Ch5_3 
{
	public static void main(String[] args) 
	{
		int count=0;
		int w[]=new int[5];
		int s[]=new int[5];
		Scanner in=new Scanner(System.in);
		System.out.print("������Ӳ�����ࣺ");
		int n=in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("��������ֵ��");
			w[i]=in.nextInt();
			System.out.print("������������");
			s[i]=in.nextInt();
		}
		
		//�����е�Ӳ�Ұ��մӴ�С��˳�����a1��
		List a1=new ArrayList();
		for(int i=0;i<n;i++)
			for(int j=0;j<s[i];j++)
				a1.add(w[i]+"");
		
		System.out.print("\n������Ǯ����");
		int money=in.nextInt();
		
		//a2����洢�ҵ�Ǯ
		List a2=new ArrayList();
		for(int i=0;i<a1.size();i++)
		{
			if(money>=Integer.parseInt((String)a1.get(i)))
			{
				a2.add(a1.get(i));
				money=money-Integer.parseInt((String)a1.get(i));
				count++;
			}
				
		}
		
		System.out.println("����Ҫ�ã�"+count+"ö���÷����£�");
		
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			c[i]=Collections.frequency(a2, w[i]+"");
			System.out.println("��ֵ "+w[i]+"��"+c[i]+"ö");
		}
	}
}
