public class Ch7_3 
{
	public static void main(String[] args) 
	{
		int n,d=0,i;
		int flag=1;
		
		for(n=1;n<=7;n++)  //����nȡֵ��ΧΪ1~6
		{
			for(d=1;d<=4;d++) //����aȡֵ��Χ1~4
				/*Լ����������Ϊ26����Ϊ880*/
				if(4*n+6*d==28&&n*(n+d)*(n+d+d)*(n+d+d+d)==585)
				{
					System.out.println("���"+n+"�����"+d);
					flag=0;
					break;
				}
			if(flag==0)
				break;
		}
		
		System.out.print("�Ȳ�����ǰ15�");
		/*���ǰ20��*/
		for(i=0;i<15;i++)
			System.out.print(" "+(n+i*d));
	}
}
