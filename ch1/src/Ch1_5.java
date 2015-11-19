import java.util.Scanner;

public class Ch1_5 
{
	public static void main(String[] args) 
	{
  		System.out.print("������������");
  		Scanner scanner = new Scanner(System.in);
   		int num = scanner.nextInt();
  		
  		int[][] ary = getTriangle(num);//�õ��������
  		
  		print(ary);//��ӡ�������
	}

	//�õ��������
	private static int[][] getTriangle(int num) 
	{
		int[][] ary = new int[num][num];//�ö�ά����洢
  
		for(int i = 0; i < ary.length; i++)//���ߡ�б����1
		{
			ary[i][0] = 1;
			ary[i][i] = 1;
		}
  
		for(int i = 1; i < ary.length; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				//���沿�֣����ڵ�ǰλ�õ��Ϸ������Ͻ�֮��
				ary[i][j] = ary[i-1][j-1] + ary[i-1][j];
			}
		}
		return ary;
	}
	
	private static void print(int[][] ary)
	{
		for(int i=0;i<ary.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf(" %-3d", ary[i][j]);
			}
			System.out.println();
		}
	}
			
}
