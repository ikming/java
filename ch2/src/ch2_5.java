
public class ch2_5 
{
	public static void main(String[] args) 
	{
		int t;
		//i�������λ�ϵ�����
		for (int i = 1; i <= 9; i++) 
		{
			//j�������λ�ϵ�����
			for (int j = 0; j <= 9; j++) 
			{
				if(i!=j)
				{
					//i��j��ɵ���λ��
					t=i*1000+i*100+j*10+j;
					//k��ȡֵ������λ���ֿ�ƽ���õ��Ĵ�ŷ�Χ
					for (int k = 30; k < 100; k++) 
					{
						if (k == Math.sqrt(t)) 
						{
							System.out.println("���ƺ��룺"+k * k);
						}
					}
				}
			}

		}
	}
}
