import java.util.Scanner;


public class Ch6_2 
{
	//��������СԪ�ص��±�
	public static int minIndex(int[] num)
	{
		int min,index;
		index=0;
		min=num[0];
		for(int i=1;i<3;i++)
			if(num[i]<min)
				{
					min=num[i];
					index=i;
				}
		return index;
	}
	
	//�ж�����Ԫ���Ƿ�ȫ�����
	public static boolean allSame(int[] num)
	{
		boolean flag=false;
		int count=0;
		for(int i=0;i<2;i++)
		{
			if(num[i]==num[i+1])
				count++;
		}
		if(count==2)
			flag=true;
		return flag;
		
	}
	
	//����С������
	public static int lcd(int[] num)
	{
		int t1;
		int t2;
		int t3;
		int index;
		
		//��������Ԫ�س�ʼֵ
		t1=num[0];
		t2=num[1];
		t3=num[2];
		
		while(!allSame(num))
		{
			for(int i=0;i<3;i++)
				System.out.print(num[i]+" ");
			System.out.print("\n");
			
			index=minIndex(num);//�ҳ���������СԪ�ص��±�
			switch(index)//����С�꣬�ӳ�ʼֵ
			{
				case 0:
					num[0]=num[0]+t1;
					break;
				case 1:
					num[1]=num[1]+t2;
					break;
				case 2:
					num[2]=num[2]+t3;
					break;
			}
		}
		
		for(int i=0;i<3;i++)
			System.out.print(num[i]+" ");
		System.out.print("\n");
		
		return num[0];
	}
	
	
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int num[]=new int[3];
		System.out.println("��������");
		for(int i=0;i<3;i++)
		{
			System.out.print("�������"+(i+1)+"������");
			num[i]=in.nextInt();
		}
		
		//������С����������
		int lcd=lcd(num);
		
		System.out.print("��С��������"+lcd);


	}
}
