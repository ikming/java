import java.util.Scanner;

public class Ch6_6 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		int remainder[]=new int[101]; //remainder:���������Ӧ���̵�λ��
		int quotient[]=new int[101]; // quotient:���δ���̵�ÿһλ
		int m,n,i,j;
		
		System.out.printf("������һ������(A/B)(0<A<B<=100)��");
		String s=in.next();
		
		/*�������������ͳ���*/
		int index=s.indexOf('/');
		m=Integer.parseInt(s.substring(0, index));
		n=Integer.parseInt(s.substring(index+1)); 
		 
		System.out.printf("%d/%d �ľ�ȷֵ��0.",m,n);
		for(i=1;i<=100;i++) /*i: �̵�λ��*/
		{
			/*m:���������� remainder[m]:��������Ӧ���̵�λ��*/
			remainder[m]=i; 
			m*=10; //��������10λ
			quotient[i]=m/n; //�̱�������
			m=m%n; //������
			
			/*����Ϊ0 ���ʾ������С��*/
			if(m==0) 
			{
				for(j=1;j<=1;j++)
					System.out.printf("%d",quotient[j]); /*�����*/
				break; /*�˳�ѭ��*/
			}
			
			/*����������Ӧ��λ��ǰ���Ѿ����ֹ�*/
			if(remainder[m]!=0) 
			{
				for(j=1;j<=i;j++)
					System.out.printf("%d",quotient[j]); //�����ѭ��С��
				
				/*���ѭ���ڵ�λ��*/
				System.out.printf("\n��һ������ѭ������ѭ���� С������ %d λ��ʼ���� %d λ��\n",remainder[m],i);
				
				break; //�˳�
			}
		}
	}
}
