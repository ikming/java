
public class Ch11_10 
{
	//��������
	private int c;
	//��Ʒ��������
	private int[] w;
	//��Ʒ��ֵ����
	private int[] v;
	private int[][] m;//m(i, j)�Ǳ�������Ϊj,��ѡ��ƷΪ0,1,...,iʱ0-1�������������ֵ��
	//��¼���
	private int[] x;
	//����ֵ
	private int maxV;

	//���췽�������ݳ�ʼ��
	public Ch11_10(int[] w, int[] v, int c)
	{
		this.w = w;
		this.v = v;
		this.c = c;
		m = new int[w.length][c+1];
		x = new int[w.length];
	}

	/** 0-1��������  ��̬�滮���
	 *�ݹ�ʽ
	 *  m(i, j) = 0										j=0
	 *  m(i, j) = 0										i=0 && j < wi
	 *  m(i, j) = vi									i=0 && j >= wi
	 *  m(i, j) = m(i-1, j)								j < wi
	 *  m(i, j) = max{m(i-1, j), m(i-1, j-wi) + vi}		j >= wi
	 */
	public void knapsack()
	{
		//��ʼ��
		for (int i = 0; i < m.length; i++)
		{
			m[i][0] = 0;
		}
		for (int j = 0; j < m[0].length; j++)
		{
			if (w[0] <= j)
			{
				m[0][j] = v[0];
			}
			else
			{
				m[0][j] = 0;
			}
		}
		
		for (int i = 1; i < m.length; i++)
		{
			for (int j = 1; j < m[i].length; j++)
			{
				if (j < w[i])
				{
					m[i][j] = m[i-1][j];
				}
				else
				{
					m[i][j] = Math.max(m[i-1][j], m[i-1][j-w[i]] + v[i]);
				}
			}
		}
		maxV = m[m.length - 1][c];
		System.out.println("���ֵΪ��"+maxV );
	}

	//�õ����Ž�
	public int[] getResult()
	{
		int tmp = c;
		int i;
		for (i = m.length - 1; i > 0; i--)
		{
			//���ݶ�ά�������һ�У����������Ƿ���ȣ������ȣ�û�м��룬���򣬼���
			if (m[i][tmp] == m[i-1][tmp])
			{
				x[i] = 0;
			}
			else
			{
				x[i] = 1;
				tmp = tmp - w[i];
			}
		}
		x[i] = (m[0][c] != 0) ? 1 : 0; //��һ�У���������������㣬������
		return x;
	}

	//��ӡ����m
	public void printM()
	{
		for (int i = 0; i < m.length; i++)
		{
			
			for (int j = 0; j < m[i].length; j++)
			{
				System.out.printf("%2d  ",m[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int[] w = {6, 5, 2, 1, 1};//��Ʒ����
		int[] v = {48, 40, 12, 8, 7};//��Ʒ�۸�
		int c=8; //��������
		
		Ch11_10 k = new Ch11_10(w, v, c);//��ʼ������
		
		k.knapsack();//���ñ�����������䶯̬�滮��
		
		int[] x = k.getResult();//�õ����Ž�
		
		System.out.println("�������������£�1����ѡ�У�0����δѡ����");
		for (int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + " ");
		}
		System.out.println("\n��̬�滮�����£�");
		
		
		k.printM();//��ӡ��̬�滮��
	}
}