import java.util.ArrayList;
import java.util.List;

public class Ch5_2 
{
	//��ӡ�б�
	public static void print(List list) 
	{
		for (int i = 0; i < list.size(); i++) 
		{
			String title = (String) list.get(i);
			System.out.println("��"+(i + 1) + "���߷�:" + title);
		}
	}
	
	//�б���Ԫ�ؼ�ǰ׺1/2
	public static ArrayList addPre(List list,int num)
	{
		ArrayList al=new ArrayList();
		for (int i = 0; i < list.size(); i++) 
		{
			String title = (String) list.get(i);
			title=num+title;
			al.add(title);
		}
		return al;
	}

	public static void main(String[] args) 
	{
		int f1,f2,f3=0;
		f1=1;
		f2=2;
		
		String s1="1";
		String s2="11";
		String s3="2";
		
		List a1=new ArrayList();
		a1.add(s1);
		
		List a2=new ArrayList();
		a2.add(s2);
		a2.add(s3);
		
		List l1,l2;//��ʱ�����߷�
		List l=new ArrayList();
		
		for(int i=3;i<=10;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			
			List a3=new ArrayList();
			
			//��ǰһ���߷���ǰ׺1/2
			l1=addPre(a1,2);
			l2=addPre(a2,1);
			
			/*
			 * �ϲ�ǰ�����߷�
			 * ������ϵʽ
			 */
			a3.addAll(l2);
			a3.addAll(l1);
			
			a1=a2;
			a2=a3;
			
			//�����һ�ε����ݱ�������
			if(i==10)
				l=a3;
		}
		System.out.println("�߷��ܹ��У�"+f3+"��");
		System.out.println("�߷����£�");
		print(l);
	}

}
