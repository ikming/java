
public class Ch11_5 
{
	public static void main(String[] args) 
	{	
		int n = 0;//����6��ǰ�沿�֣���n6��
		int N;//6�ƶ�ǰ����N=n6
		int M;//6�ƶ��������ײ��󣬼�M=6n
		
		int buf;
		int i = 0;//�������ֵĳ���
		while(true)//���
		{
			//�ƶ�ǰ
			N = n * 10 + 6;
		    buf = n;
		    //�������ֵĳ��ȣ�ȷ��6�Ƶ��ײ���Ȩ��
		    while(buf!=0)
		    {
		    	i++;
		        buf = buf/10;
		    }
		    //�ƶ���
		    M = (int)(6 * Math.pow(10,i)) + n;
		    //�������㣬������˳�ѭ��
		    if(M == (4*N))
		    {
		    	System.out.print("Ҫ�ҵ���Ϊ��"+N);
		        break;
		    }
		    n++;//��ٱ����޸�
		    i = 0;//����ֵ��λ
		}
	}
}
