import java.util.Arrays;
import java.util.Scanner;


public class Ch3_5 
{

	public static void main(String[] args) 
	{
		for(int input=1000;input<=9999;input++)
		{
			System.out.println("\n"+input+" ��֤���£�");
//			
//			if(input==10000)
//				break;
//			else if(input%1111==0)
			if(input%1111==0)
			{
			   System.out.println("����ȫ����ͬ!");
			   continue;
			}
			else
		   	{
			   int flag=0; //�������
			   int input2=input;
			   do
			   {
				   input2=he(fen(input2));   //����he()��fen()����
				   flag++;
			   }while(input2!=6174);
		    
			   if(input2==6174)
			   {
				   System.out.println("������"+flag+"�Σ�"+"����Ϊ��!");
		     
			   }
			   else
				   System.out.println("����Ϊ��!");
		   }
		}   
		System.out.println("�������!");
	}
		 
	public static int[] fen(int input)  // ���4λ��
	{
		int a[]=new int [4];
		a[0]=input/1000; //ǧλ��
		input=input%1000;
		a[1]=input/100;  //��λ��
		input=input%100;
		a[2]=input/10;   //ʮλ��
		input=input%10;
		a[3]=input;   // ��λ��
		Arrays.sort(a);  //��С��������
		return a;  
	}
		 
	public static int he(int a[])  //�ϲ�4λ�����������������С����λ��
	{
		Arrays.sort(a);
		int max=a[3]*1000+a[2]*100+a[1]*10+a[0];   //������λ��
		int min=a[0]*1000+a[1]*100+a[2]*10+a[3];  //��С��λ��
		System.out.println(max+"-"+min+"="+(max-min));
		return max-min;
	}
}