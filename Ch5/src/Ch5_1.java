public class Ch5_1 
{
	static void BQBJ(int m,int n)				//mǮ��n���㷨
	{
	    int x,y,z;
	    for(x=0;x<=n;x++)				//��������
	    {
	        for(y=0;y<=n;y++)			//ĸ������
	        {
	            z=n-x-y;				//С������
	            if (z>0 && z%3==0 && x*5+y*3+z/3==m)
				{
	                System.out.printf("������%dֻ,ĸ����%dֻ,С����%dֻ\n",x,y,z);
				}
				else					//�޷����!
				{
					;
				}
	        }
	    }  
	}
	
	public static void main(String[] args) 
	{
		int m,n;

		m=100;						//��Ǯ
		n=100;						//�ټ�
		System.out.print(m+"Ǯ��"+n+"������������Ϊ��\n");
		BQBJ(m,n);
	}
}
