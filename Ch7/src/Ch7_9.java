import java.util.Scanner;

public class Ch7_9 
{
	final static int N=30;
	static long f[] = new long[N]; 
	
	/*쳲���������*/   
    public static void fibonacciArray(int n)
    {    
         
        f[0]=1;    
        f[1]=1;    
        for(int i =2;i < n;i++)
        {  
            f[i]=f[i-2]+f[i-1]; //����ĵ���������ʼΪǰ�������ĺ�   
        }    
       //        System.out.println(java.util.Arrays.toString(f)); //������ת����String���   
    }    
   
    public static void print(long[] array)
    {
    	for(int i=0;i<array.length;i++)
    	{
    		if(array[i]==0)
    			break;
    		System.out.print(array[i]+" ");
    		
    	}
    		
    }
    
    
    public static void main(String[] args) 
    {
    	Scanner in=new Scanner(System.in);
    	System.out.print("�������·ݣ�");
    	int n=in.nextInt();
    	fibonacciArray(n);
    	System.out.print("ǰ"+n+"�·ݸ������£�\n");
    	print(f);
    }    
   
}   
                        