import java.util.Scanner;

public class Ch9_2 
{
	/*��n���нǹȲ�����֤*/
	static void proveJiaoGu(int n)
	{
	    int count=1;
	    while(n!=1 && count<=1000)
	    {
	    	/*������Ϊ1000*/
	    	if(n%2==0)   /*nΪż��*/
	    	{
	    		System.out.printf("%d/2=%d\n",n,n/2);
	    		n = n/2;
	    	}
	    	else
	    	{
	    		System.out.printf("%d*3+1=%d\n",n,n*3+1); /*nΪ����*/
	    		n=n*3+1;
	    	}
	    	count++;
	    }
	    
	    if(count<1000 && n==1)
	        System.out.print("���������ǹȲ���\n");
	}

	public static void main(String[] args) 
	{
		int n;
		Scanner in=new Scanner(System.in);
	    System.out.print("������һ����:");
	    n=in.nextInt();
	    System.out.print("��֤�������£�\n");
	    
	    proveJiaoGu(n);//���ýǹȲ��뷽��������֤
	    

	}

}
