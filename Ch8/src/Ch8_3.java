public class Ch8_3 
{
	public static void main(String[] args) 
	{
		int i;//������
		int j;//����
		int l;//��
		
		/*1. �������ķ�Χ��10000��99999*/
		for(i=10000;i<=99999;i++) 
			/*1.�����ķ�Χ��10��99*/
			for(j=10;j<=99;j++) 
				/*1. ��������&& 2.��l��100��999֮����ʮλ����Ϊ7*/
				if(i%j==0&&(l=i/j)>100&&l<=999&&l%100>=70&&l%100<80)
					/*3.�̵ĵ�һλ������Ļ�Ϊ��λ�����Һ���λΪ77*/
					if(j*(l/100)>100&&j*(l/100)%100==77)
						/*4. �������ĵ���λһ��Ϊ4*/
						if(i%1000-i%100==400)
							/*5. 7���Գ����Ļ�Ϊһ����λ�����ҵڶ�λΪ7*/
							if(j*7>100&&j*7%100>=70&&j*7%100<80) 
								/*6. �̵����һλ����Ϊ0����������Ļ�Ϊһ����λ��*/
								if(l%10!=0&&(j*(l%10))<100&&j*(l%10)>10) 
									System.out.printf("%d/%d=%d ",i,j,l);
		
	} 

}

