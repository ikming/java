public class Ch6_8 
{
	public static void main(String[] args) 
	{
		// ��ٷ�
		for (int i = 0;i<10000; i++) 
		{    
			int count = i;      // count��ס������0, 1, 2, 3, 4......
			int j;
			for (j = 0; j < 5; j++) 
			{  // ÿ����ѭ���ж�5��
				if ((count - 1) % 5 == 0)  // ��������������Ե�1���ٷֳ�5��
					count = (count - 1) / 5 * 4; // ��ô�ͽ����ӳԵ�һ���ֳ�5��, ����4��
				else
					break;     // ���������Ե�1���ٷֳ�5��, ��ôֱ�����ѭ��������һ��
			}
			if(j==5)
			{
				System.out.println("ԭ�����������ӣ�"+i);    // ѭ��5��֮��, ������Ա�5����������
//				break;
			}
		}
		System.out.print("���������");
	}
 
}