
public class Ch4_3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int k,d=0,t,i,j,a[]=new int[6];
		System.out.println("�������Ϊ��");
		for(k=10001;k<99999;k+=2)
		{
			t=0;//������׼��0������������1����������
			for(j=3;j<=Math.sqrt(k);j+=2)
				if(k%j==0) /* ���������� */
				{
					t=1;
					break;
				}
			if(t==0) /* k Ϊ 5 λ���� */
			{
//				a[1]=k%10; //���k�ĸ�λ��
//				a[5]=k/10000;//���k����λ��
				d=(k/10)%1000;//ȡ��k���м�3λ��
				for(j=2;j<=Math.sqrt(d);j++)
					if(d%j==0) /* ���������� */
					{
						t=1; 
						break;
					}
			}
			if(t==0) /* d Ϊ 3 λ���� */
			{
				a[1]=k%10; //���k�ĸ�λ��
				a[5]=k/10000;//���k����λ��
				a[2]=d%10;//���d�ĸ�λ����Ҳ��k��ʮλ��
				a[4]=d/100;//���d�İ�λ����Ҳ��k��ǧλ��
				a[3]=(d/10)%10;//���d��ʮλ����Ҳ��k�İ�λ��
				
				for(i=1;i<=4;i++) /* �Ƚ�ȷ��û����ͬ���� */
					for(j=i+1;j<=5;j++)
						if(a[i]==a[j])
						{
							t=1;
							break;
						}
			}
			if(t==0)
			{
				for(j=1;j<=5;j++) /* �ų�ż�������м�����Ϊ 1��9 */
					if(a[j]%2==0 || a[3]==1 || a[3]==9)
					{
						t=1;
						break;
					}
			}
			if(t==0)
				System.out.printf("%d ",k); /* ���������� */
			}
	}
}
