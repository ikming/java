import java.util.Date;
public class Ch4_1
{
	public static void main(String[] args) 
	{
		Ch4_1 test=new Ch4_1();
//		long time1=new Date().getTime();
		System.out.println("100�����������£�");
		int count=0;
		for(int i=2;i<100;i++) //ѭ���ж�ÿ�����ǲ�������
		{
			if(test.isPrimeNumber(i)==true)
			{
				System.out.print(i+" ");
				count++;
				if(count%10==0)
					System.out.print("\n");
			}
		}
//		long time=new Date().getTime()-time1;
//		System.out.println("\n"+time+"����");
	}
	
	/**�ж�һ���������Ƿ�Ϊ����
	 * @param number ������Ҫ�жϵ�������
	 */
	public boolean isPrimeNumber(int number)
	{
		boolean flag=true;
		if(number<=0)
			throw new IllegalArgumentException("number�ǲ��Ϸ��Ĳ�����");
		for(int i=2;i<=Math.sqrt(number);i++)//�������ѭ������2��3����һֱ���������ƽ������
		{
			if(number%i==0)//�����һ������������˵����������
			{
				flag=false;
				break;//������������˳�
			}
		}
		return flag;
	} 
}
