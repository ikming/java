public class Ch8_6 
{
	static int a[]=new int[14];//����ƣ�a[0]����
	public static void main(String[] args) 
	{
		int i,n,j=1;/*j:����(����)�±꣬��ʼʱΪ1��Ԫ��*/
		System.out.printf("�Ƶ�ԭʼ˳�����£�\n");
		
		
		for(i=1;i<=13;i++)/*i:Ҫ��������е��Ƶ����*/
		{
			n=0;//�պм�����
			while(n!=i)
			{
				if(a[j]==0)//���λ�ÿգ�n�ͼ���
				{
					n++;
					if(n==i)/*��������i���պ��ӣ����Ʒ���պ���*/
					{	a[j]=i;
						break;
					}
				}

				if(j==13)/*���ں��ӹ���һ��Ȧ��j�������һ��Ԫ����ָ��1��Ԫ��*/
					j=1;
				else 
					j=j+1;
			}
		}
		/*������*/
		for(i=1;i<=13;i++)
			System.out.printf("%d ",a[i]);
		System.out.printf("\n");
	}
}