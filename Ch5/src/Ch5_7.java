public class Ch5_7 
{
	/*
	 * len[0]���洢����
	 * len[1],�׼Ҿ�������
	 * len[2],�ҼҾ�������
	 * ....
	 */
	static void WJGJ(int[] len)	//��ҹ����㷨
	{
		for(len[5]=4; ;len[5]+=4)                     //len5Ϊ4�ı��� 
			
			for(len[1]=5; ;len[1]+=5)                 //len1Ϊ5�ı��� 
			{ 
				len[4]=len[5]+len[1]/5; 
				len[3]=len[4]+len[5]/4; 
				
				if(len[3]%2!=0||len[4]%3!=0)
					continue;                //������ܱ�2�����������ܱ�3������������һ��ѭ�� 
				
				len[2]=len[3]+len[4]/3; 
				
				if(len[2]+len[3]/2<len[1])
					break;                             //�л�len5[0]ѭ��(��Ϊlen1̫����) 
				
				if(len[2]+len[3]/2==len[1])
				{ 
					len[0]=2*(len[1])+(len[2]);     //���㾮�� 
					return;
				} 
			} 
	   								

	}
	
	public static void main(String[] args)
	{
		//len�����ž��ÿ�Ҿ�������
		int[] len={0,0,0,0,0,0};
			
		WJGJ(len);				//����㷨
		
	    System.out.printf("��ҹ����������������:\n");					//������
	    System.out.printf("�׼Ҿ�������Ϊ:%d\n",len[1]);
	    System.out.printf("�ҼҾ�������Ϊ:%d\n",len[2]);
	    System.out.printf("���Ҿ�������Ϊ:%d\n",len[3]);
	    System.out.printf("���Ҿ�������Ϊ:%d\n",len[4]);
	    System.out.printf("��Ҿ�������Ϊ:%d\n",len[5]);
	    System.out.printf("����:%d\n",len[0]);

	}
}