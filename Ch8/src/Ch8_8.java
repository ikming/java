import java.util.Scanner;

public class Ch8_8 
{
	/*����n��ֳɲ�����m�Ļ��ָ���*/
	static int q(int n,int m)
	{
	    /*��Ч����*/
		if(n<1 || m<1)
			return 0;
		
		 /*1������n������1ʱ���κ�������nֻ��һ�ֻ��ַ�ʽ���� n = 1+1+1+..+1 (n��1���)��*/
	    if(n==1 || m==1)
	        return 1;
	    
	    /*2����m����n��û�����壬���ֻ�ܵ�������ֲ�������ּ��š�*/
	    if(m>n)
	        return q(n,n);
	    
	    /*3����n�Ļ����������q(n,n-1)������ɡ�*/
	    if(n==m)
	        return q(n,m-1) + 1;
	    
	    /*4����n�Ļ����� q(n,m-1)���ֺ�q(n-m,m)�������*/
	    return q(n,m-1) + q(n-m,m);
	}
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
	    int a,b;
	    System.out.print("��������������");
	    a=in.nextInt();
    
	    System.out.print("�������ܲ�������ֵ��");
	    b=in.nextInt();
	    System.out.printf("��ַ�����%d\n",q(a,b));
	}
}