import java.util.Scanner;

public class Ch11_7 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int num,i,max,min,sum,avg;
		max=0; /*�ȼ��赱ǰ�����ֵmaxΪ0*/
		min=100; /*�ȼ��赱ǰ����СֵminΪ100*/
		sum=0; /*�����ۼӺͱ����ĳ�ֵ��Ϊ0*/
		for(i=1;i<=10;i++)
		{
			System.out.print("���"+i+"��ί��������� ");
			num=in.nextInt(); /*������ί������*/
			sum+=num; /*�����ܷ�*/
			if(num>max)max=num; /*ͨ���Ƚ�ɸѡ�����е���߷�*/
			if(num<min)min=num; /*ͨ���Ƚ�ɸѡ�����е���ͷ�*/
		}
		System.out.printf("ȥ��һ����߷�:%d \nȥ��һ����ͷ�:%d ",max,min);
		avg=(sum-max-min)/8;
		System.out.printf("\nƽ���÷�:%d ",avg); /*������*/
		}

}
