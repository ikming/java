public class Ch8_2 
{
	public static void main(String[] args) 
	{
		long i,j,k;//��������ÿһλ
		long l,m,n;//������ÿһλ
		long term,mul;//������������
		long t1=0,t2=0,t3=0;//��ʽ���̵Ĳ��ֻ�
	    int flag;//������־
	    
	    for(i=0;i<=4;++i) /*�������ĵ�һλ*/
	    	for(j=5;j<=9;++j) /*�������ĵڶ�λ*/
	    		for(k=0;k<=4;++k) /*�������ĵ���λ*/
	    		{
	    			term=100*i+10*j+k; /*������*/
	    			for(flag=0,n=0;n<=4&&flag==0;) /*�����ĵ�һλ*/
	    			{
	    				t3=n*term*100;
	    				flag=jud(t3/100,"001"); /*�жϵ��������ֻ�*/
	    				n++;
	    			}
	    			if(flag==1)
	    			{
	    				for(flag=0,m=0;m<=4&&flag==0;) /*�����ĵڶ�λ*/
	    				{
	    					t2=m*term*10;
	    					flag=jud(t2/10,"1100"); /*�жϵڶ������ֻ�*/
	    					m++;
	    				}
	    				if(flag==1)
	    				{
	    					for(flag=0,l=5;l<=9&&flag==0;) /*�����ĵ���λ*/
	    					{
	    						t1=l*term;
	    						flag=jud(t1,"0000"); /*�жϵ�һ�����ֻ�*/
	    						l++;
	    						
	    					}
	    					if(flag==1&&jud(t1+t2+t3,"00101")==1) /*�жϳ�ʽ�Ļ�*/
	    					{
	    						mul=(n-1)*100+(m-1)*10+(l-1);//����
	    						print(term,mul,t1,t2,t3);//������
	    					}
	    				}
	    			}
	    		}
	}
	
	/* a��������
	 * b:����
	 * s1��s2��s3���м���̵Ļ� */
	static void print(long a,long b,long s1,long s2,long s3) /*��ӡ���*/
	{
		System.out.print("   "+a+"\n");
	    System.out.print("*) "+b+"\n");
	    System.out.printf("......................\n");
	    System.out.printf("  "+s1+"\n "+s2/10+"\n "+s3/100+"\n");
	    System.out.printf("......................\n");
	    System.out.printf(" "+a*b+"\n");
	}
	  
	/*�ж�һ������ÿһλ�Ƿ�����Ҫ����жϺ���
    *q:��Ҫ�жϵ�����
    *pflag:��־�ַ�����A��0��ʾ��Z��1��ʾ��
    *��־������˳�򣺸�ʮ��...*/
	static int jud(long q,String pflag) 
	{
		int i=0;
	    while(q!=0&&i<=pflag.length()-1) /*ѭ���ж϶�Ӧλ��ȡֵ��Χ�Ƿ���ȷ*/
	    	if(pflag.charAt(i)-'0'!=(q%10>=5?1:0)) /*��־λ���Ӧ��λ����������0*/
	    		return 0;
	    	else	
	    	{
	    		q/=10;
	    		++i; /*�������ȡ��һλ�����ж�*/
	    	}
	    	if(q==0&&i==pflag.length()) /*q��λ�����־�ַ����ĳ�����ͬʱ������1*/
	    		return 1;
	    	else 
	    		return 0;
	}
}