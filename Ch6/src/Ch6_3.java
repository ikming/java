import java.util.Scanner;

public class Ch6_3 
{
	public static int divisor (int a,int b)    /*�Զ��庯�������������Լ��*/
	{
		int  temp;          
		if(a<b)             
		{ 
			temp=a;
			a=b;
			b=temp;
		} 
		while(b!=0)           /*ͨ��ѭ����������������ֱ������Ϊ0*/
	    {
			temp=a%b;
			a=b;              /*������ֵ����*/
			b=temp;
	    }
		return a;            
	}
	
	public static int multiple (int a,int b)  /*�Զ��庯������������С������*/
	{
		int temp;
		temp=divisor(a,b);  /*�ٴε����Զ��庯����������Լ��*/
		return  (a*b/temp); 
	}
	
	public static char tongFen(int fz1,int fm1,int fz2,int fm2)
	{
		char flag=' ';
		//��������С����������
		int gbs=multiple(fm1,fm2);
		//ͨ�ֺ���µķ���
		int xfz1=gbs/fm1*fz1;
		int xfz2=gbs/fm2*fz2;
		
		//��ӡ��ͨ�ֱ��ʽ
		System.out.println(fz1+"/"+fm1+" = "+xfz1+"/"+gbs);
		System.out.println(fz2+"/"+fm2+" = "+xfz2+"/"+gbs);
		
		//ͬ��ĸ�Ƚϴ�С��ֻҪ�ȽϷ��Ӽ���
		if(xfz1>xfz2)
			flag='>';
		else if(xfz1<xfz2)
			flag='<';
		else
			flag='=';
		
		return flag;
	}
		
	public static void main(String[] args) 
	{
		char flag=' ';
		Scanner in=new Scanner(System.in);
		//�����������������ַ�������
		System.out.print("�������һ��������");
		String s1=in.next();
		System.out.print("������ڶ���������");
		String s2=in.next();
		
		//���ַ����������ֽ�����ӡ���ĸ
		int index=s1.indexOf('/');
		int fz1=Integer.parseInt(s1.substring(0, index));
		int fm1=Integer.parseInt(s1.substring(index+1));
		
		int index2=s2.indexOf('/');
		int fz2=Integer.parseInt(s2.substring(0, index));
		int fm2=Integer.parseInt(s2.substring(index+1));
		
		if(fz1==fz2)
		{
			System.out.println("ͬ���ӱȽϴ�С");
			if(fm1>fm2)
				flag='<';
			else if(fm1<fm2)
				flag='>';
			else
				flag='=';
				
		}else if(fm1==fm2)
		{
			System.out.println("ͬ��ĸ�Ƚϴ�С");
			if(fz1>fz2)
				flag='>';
			else if(fz1<fz2)
				flag='<';
			else
				flag='=';
		}else 
		{
			System.out.println("����ӡ���ĸ�Ƚϴ�С");
			flag=tongFen(fz1,fm1,fz2,fm2);
		}
		
		System.out.print("������£�\n"+s1+" "+flag+" "+s2);

	}

}
