import java.util.Scanner;

public class Ch5_8 
{
	/*
	 * ����red����ɫ��ĸ���
	 * ����yellow����ɫ��ĸ���
	 * ����green����ɫ��ĸ���
	 * ����n��ȡ����ĸ���
	 */
	static void threeball(int red,int yellow,int green,int n)		//�㷨
	{
		int i,j,k;

		System.out.printf("�ܹ������¼��ֿ���!\n");
		System.out.printf("\t����\t����\t����\n");
		for(i=0;i<=red;i++)         					//��ɫ��
		{
			for(j=0;j<=yellow;j++)   					//��ɫ��
			{
				for(k=0;k<=green;k++)				//��ɫ��
				{
					if(i+j+k== n)				//�ж��Ƿ����
					{
						System.out.printf("\t%d\t%d\t%d\n",i,j,k);
					}
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int red,yellow,green;
		int n;

		System.out.printf("��ɫ��������⣡\n");
		System.out.printf("����������������Ϊ:");
		Scanner input=new Scanner(System.in);
		red=input.nextInt();						//���������
		System.out.printf("����������������Ϊ:");
		yellow=input.nextInt();						//���������
		System.out.printf("�����������������Ϊ:");
		green=input.nextInt();						//���������
		System.out.printf("��������ȡ���������Ϊ:");
		n=input.nextInt();							//ȡ���������

		threeball(red,yellow,green,n);				//���
	}
}