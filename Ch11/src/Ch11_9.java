import java.util.Scanner;


public class Ch11_9 
{
	static final int MAXNUM=30;
	static int FalseCoin(int coin[],int low,int high)	//�㷨
	{
	    int i,sum1,sum2;
		int re=0;
		sum1=sum2=0;
	    if(low+1==high)//��ʣ������Ӳ��
	    {
	        if(coin[low]<coin[high]) //�����
			{
				re=low+1;//�±��0��ʼ����1
				return re;
			}
	        else 
			{
				re=high+1;
				return re;
			}
	    }
	    if((high-low+1)%2 == 0)				//n��ż��
	    {
	        for(i=low;i<=low+(high-low)/2;i++)
			{
	            sum1= sum1 + coin[i];       	//ǰ��κ�
			}
	        for(i=low+(high-low)/2+1;i<=high;i++)
			{
	            sum2 = sum2 + coin[i];       	//���κ�
			}
	        if(sum1>sum2) //ǰ����أ��ٱ��ں���
			{
				re=FalseCoin(coin,low+(high-low)/2+1,high);//�ݹ飬�ں����в�ѯ
				return re;
			}
	        else if(sum1<sum2)//�����أ��ٱ���ǰ���
			{
				re=FalseCoin(coin,low,low+(high-low)/2);//�ݹ飬��ǰ����в�ѯ
				return re;
			}
			else
			{
			}
	    }
	    else   //n������
	    {
	        for(i=low;i<=low+(high-low)/2-1;i++)
			{
	            sum1= sum1 + coin[i];       	//ǰ��κ�
			}
	        for(i=low+(high-low)/2+1;i<=high;i++)
			{
	            sum2 = sum2 + coin[i];       	//���κ�
			}
	        
	        if(sum1>sum2)   //ǰ����أ��ٱ��ں���
			{
				re=FalseCoin(coin,low+(high-low)/2+1,high);//�ݹ飬�ں����в�ѯ
	            return re;
			}
	        else if(sum1<sum2)//�����أ��ٱ���ǰ���
			{
				re=FalseCoin(coin,low,low+(high-low)/2-1);//�ݹ飬��ǰ����в�ѯ
	            return re;
			}
			else	//ǰ��һ���أ��ٱ����м�
			{
				re=low+(high-low)/2+1;//�����м�λ��
				return re;
			}
	    }
		return re;
	}
	public static void main(String[] args) 
	{
		int[] coin=new int[MAXNUM];
		int i,n;
		int weizhi;
	    System.out.println("�����㷨�����������⣡");
		System.out.print("�����������ܵĸ�����");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();						//�����ܵĸ���
		System.out.print("���������ҵ���٣�");
		for(i=0;i<n;i++)
		{
			coin[i]=input.nextInt();			//�������ҵ���٣�1����ٱң�2�������
		}
		weizhi=FalseCoin(coin,0,n-1);			//������ٱҷ��������
	    System.out.println("������"+n+"�������У���"+weizhi+"�������Ǽٵģ�");
	}
}