public class Ch8_7 
{
	static int a[]=new int[27];
	public static void main(String[] args) 
	{
		int i,j,k,s,n=0;
		
		for(i=0;i<=4;i++) /*i:ȡ������Ʊ������*/
			for(j=0;j<=3;j++) /*j:ȡ5����Ʊ������*/
			{
				s=i*3+j*5; /*������ɵ���Ʊ��ֵ*/
				for(k=0;a[k]!=0;k++) /*�����Ƿ�����ͬ������*/
					if(s==a[k])
						break;
				if(a[k]==0&&s!=0) /*û���ҵ���ͬ������������Ҫ���������*/
				{
					a[k]=s;
					n++;
				}
			}
		
		System.out.printf("%d �֣�",n); /*������*/
		for(k=0;a[k]!=0;k++)
			System.out.printf("%d ",a[k]);
	}
}
