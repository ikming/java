import java.util.Scanner;

public class ch2_2_2 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int s;
		int sum=0;
		
		//salary��ŷּ���׼
		int salary[]={0,500,2000,5000,20000,40000,60000,80000,100000};
		//rate��ŷּ�˰��
		int rate[]={5,10,15,20,25,30,35,40,45};
		
		System.out.print("�����������룺");
		s=in.nextInt();
		s=s-3500; //�۳�����
		
		int index=0;//��¼����
		//ѭ�����ң�������һ����index��¼�±�
		for(int i=0;i<salary.length;i++)
		{
			if(s<salary[i])
			{
				index=i;
				break;
			}
		}
		
		System.out.println("����"+index);
		//ѭ������۳��ۼ���
		for(int i=0;i<index-1;i++)
		{
			sum=sum+(int)((salary[i+1]-salary[i])*rate[i]*0.01);
		}
		//��������˰��
		sum=sum+(int)((s-salary[index-1])*rate[index-1]*0.01);
		System.out.print("��˰�ܶ"+sum);

	}

}
