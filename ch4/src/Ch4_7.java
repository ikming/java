
public class Ch4_7 
{
	public static void main(String[] args) 
	{
		double t,m; 
		int j,n;
		int x;//xΪ0��������������Ϊ1������������
		int count;//������
		count=0;
		t=2;
		
		for(n=2;n<=50;n++)
		{
			t=t*2; /* �۳��� t Ϊ 2^n */
			m=t-1;
			x=0;
			for(j=3;j<Math.sqrt(m)+1;j+=2) /* ���̷��б� m�Ƿ����� */
				if(m%j==0)
				{
					x=1;
					break;
				}
			if(x==0) /* �������õ����� */
			{
				count=count+1;
				System.out.printf(" 2^%d-1=%.0f \n",n,m);
			}
		}
		
		System.out.printf(" ָ�� n ��[2,50]��÷ɭ��������%d ����",count);
	}
}
