import java.util.Scanner;

public class Ch10_4 
{
	public static void main(String[] args) 
	{
		int computer,user;
		int last=21;
	
		System.out.printf("��ʤ����������⣡\n");
		while(true)
		{
			System.out.printf("----------  Ŀǰ���л�� %d �� ----------\n",last);
		    System.out.printf("�û�ȡ�������:") ;
		    Scanner input=new Scanner(System.in);
		    user=input.nextInt();					//�û�ȡ�������
		    if(user<1 || user>4 || user>last)
		    {
		    	System.out.printf("��Υ���ˣ���ȡ�Ļ����������!\n\n");
				continue;
		    }
		    last = last - user;						//ʣ��������
		    if(last == 0)
			{
		       	System.out.printf("\n�û�ȡ�����һ�����,��˼����Ӯ��!\n"); 
				break;
			}
			else
			{
				computer =  5 - user;			//�����ȡ�������
				last = last - computer;
				System.out.printf("�����ȡ�������:%d  \n",computer);
				if(last == 0)
				{
					System.out.printf("\n�����ȡ�����һ�����,����û�Ӯ��!\n"); 
					break;
				}
			}
		}
	}
}