import java.util.Scanner;

public class Ch7_5 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int i,j,h,k,m,u;
		int c[]=new int[100];//����ÿ�е�����
		double d,n,t;
		double f[]=new double[1000];//����������
		
		System.out.printf("����С��n����������ָ��n: ");
		n=in.nextDouble();
		System.out.printf("������еĵ�m���ָ��m: ");
		m=in.nextInt();
		
		k=1;
		t=1.0;
		i=1;
		c[0]=1;//�±����x+y��ֵ�����浱ǰ�е�����
		f[1]=1.0;
		
		while(true)
		{
			u=0;//�Ƿ�������Ʊ�־��Ϊ1��������Ϊ0���˳�
			
			//��i�и���Ϊǰһ�и����2
		    for(j=0;j<=i-1;j++)
		    {
		    	h=c[i-1]+j;				//h�������i�е�j��Ԫ����f[]�����е�����
		    	if(f[h]*2<n && f[h]>0)   //�������㣬��������
		        {
		    		k++;				//��������1
		    		f[k]=f[h]*2;		//��i����Ϊǰһ�����2
		    		u=1;
		    		if(j==0)
		    			c[i]=k;    		// ������������c(i)
		        }
		    	else break;
		    }
		    t=t*3;                 		// ���һ��Ϊ3����
		    if(t<n && t>0)				//�������㣬��������	
		    {
		    	k++;
		    	f[k]=t;					//���е����һ������
		    }        
		    if(u==0)
		    	break;
		    i++;
		}
		
		for(i=1;i<k;i++)        		// ð������
			for(j=i+1;j<=k;j++)
				if(f[i]>f[j])
		        {
					d=f[i];
					f[i]=f[j];
					f[j]=d;
				}
		
		System.out.printf("��������С��%.0f������Ϊ��%d\n",n,k);
		if(m<=k)
			System.out.printf("��С��������ĵ�%d��Ϊ��%.0f\n",m,f[m]);
		else
		   	System.out.printf("�������m�������е�������\n");
	}
}
