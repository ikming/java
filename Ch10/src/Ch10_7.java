import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ch10_7 
{
	/*���������ÿһλ��������ŵ�Set����������ظ�����*/
	public static Set intToSet(int num,int n)
	{
		Set s=new HashSet();
		//ѭ����������ÿһλ�����뵽Set������
		for(int i=0;i<4;i++)
		{
			s.add(num%10);//�ظ������ֱ����˵�
			num=num/10;
		}
		
		return s;
	}
	
	public static void main(String[] args) 
	{
		Set s1;//��ż�������ɵ����ָ�λ
		Set s2;//�������������ָ�λ
		Scanner in=new Scanner(System.in);
		int c,g;
		int w=0;//��¼����λ����ͬ������λ����
		int n;//��¼����λ��ͬ�ĸ���
		
		Random r=new Random(); 
		int z=1000+9*r.nextInt(1000); /*�������һ��4λ�����*/
		
		int zb=z;//���棬����

		s1=intToSet(z,4);//������ÿһλ�ŵ�������
	  
		System.out.printf("���Ѿ������һ��4λ���֣���� \n");
		
		/*c: ��������������*/
		for(c=1;;c++) 
		{
			System.out.printf("������һ��4λ����");
			g = in.nextInt(); /*���˲�*/ 
			
			s2=intToSet(g,4);//������ÿһλ�ŵ�������
			
			Iterator ite2 = s2.iterator();//���ɵ�����

			n=0;
			/*ѭ���жϼ������ظ�Ԫ��*/
			while (ite2.hasNext()) 
			{
				if (s1.contains(ite2.next())) 
				{
					n++;//����������ҵ�һ���ظ�Ԫ�أ��������ͼ�1
				}
			}
			System.out.println("�������ָ�����"+n);   
			
			z=zb;
			w=0;
			/*ѭ���ж����ֵ�ÿһλ�Ƿ����*/
			for(int i=0;i<4;i++)
			{
				if(g%10==z%10)
					w++;//�����ȣ���������1
				g/=10;
				z/=10;
			}
			
			System.out.println("��������λ�ø�����"+w+"\n"); 
			
			if(w==4)
			{
				System.out.println("�����ܹ��õĴ�����"+c); 
				break;
			}
		}
	}
}
