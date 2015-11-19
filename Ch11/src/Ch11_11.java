public class Ch11_11
{
	static int count;								//�Ե�����
	static char color[] = "rwbwwbrbwr".toCharArray();				//��ɫ�������е����� 
	static int Blue, White, Red;
	 
	static void swap(char[] c,int x, int y)			//�Ե�����ʾ
	{
		int i;
	   char temp;

	   temp= c[x];							//�Ե�����
	   c[x] = c[y];
	   c[y] = temp;
	   count++;							//�ۼӶԵ����� 

	   System.out.printf("��%d�ζԵ���",count);
	   for (i = 0; i < color.length; i++)		//����ƶ����Ч�� 
	   {
		  System.out.printf(" %c", color[i]);
	   }
	   System.out.printf("\n");
	}

	static void threeflags()					//��ɫ���㷨
	{
	   while (color[White] == 'b')				//���� 
	   {
		  Blue++;							//����ƶ�����
		  White++;						//����ƶ�����
	   }
	   while (color[Red] == 'r')				//���� 
	   {
		  Red--;							//��ǰ�ƶ����� 
		}
	   while (White <= Red)			
	   {
		  if (color[White] == 'r')				//���� 
		  {
			 swap(color,White, Red);	//�Ե�����Ͱ��� 
			 Red--;	  
			 while (color[Red] == 'r')			//���Ǻ��� 
			 {
				Red--;					//��ǰ�ƶ�����
			 }
		  }
		   
		   while (color[White] == 'w')			//����
		  {
			 White++;	
		  }
		   
		  if (color[White] == 'b')				//���� 
		  {
			  swap(color,White, Blue);	//�Ե�
			  Blue++;	
			  White++;	
		  }
	   }
	}

	public static void main(String[] args) 
	{
		 int i;

		 Blue=0;							//��ʼ��
		 White=0;
		 Red=color.length - 1;
		 count=0;

		 System.out.printf("��ɫ���������!\n");
		 System.out.printf("��ɫ���������Ч��:\n");
		 System.out.printf("           ");
		 for (i = 0; i <= Red; i++)			//���������������� 
		 {
			 System.out.printf(" %c", color[i]);
		 }
		 System.out.printf("\n");
		 
		 threeflags();			//���
		 
		 System.out.printf("ͨ��%d����ɶԵ�,���ս������:\n            ", count);
		 for (i = 0; i < color.length; i++)		//����ƶ����Ч�� 
		 {
			 System.out.printf(" %c", color[i]);
		 }
		 System.out.printf("\n");
	}
}