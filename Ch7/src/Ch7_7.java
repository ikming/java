public class Ch7_7 
{
	public static void main(String[] args) 
	{
		/*�ö�ά���������Һ��ӵĵ÷� */
		int score[][]=new int[3][3];
		int i,j,k,who;
		
		/*
		 * ����֪�������г�ʼ����
		 * score[0]���洢�ż��������ӵĵ÷�
		 * score[1]���洢�ż��������ӵĵ÷�
		 * score[2]���洢�ż��������ӵĵ÷�
		 */
		score[0][0]=7;
		score[1][0]=8;
		score[2][0]=9;
		
		for(i=4;i<6;i++)                /*i���żҺ�����4��6������֮����ܵķ���*/
			for(j=4;j<7;j++)            /*j�����Һ�����4��6������֮����ܵķ���*/
				for(k=4;i!=j&&k<7;k++)  /*k����Һ�����4��6������֮����ܵķ���*/
					/*�������ܲ���*/
					if(k!=i&&k!=j
					&&15-i-score[0][0]!=15-j-score[1][0]
					&&15-i-score[0][0]!=15-k-score[2][0]
					&&15-j-score[1][0]!=15-k-score[2][0])
					{
						/*�����������Ľ���洢��������*/
						score[0][1]=i;
						score[0][2]=15-i-7;
						score[1][1]=j;
						score[1][2]=15-j-8;
						score[2][1]=k;
						score[2][2]=15-k-9;
					}
		
		System.out.print("ÿ�Һ��ӵĵ÷����£�\n");
		for(who=0,i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(score[i][j]+" ");//������Һ��ӵĵ÷����
				if(score[i][j]==1)   
					who=i;     //��¼���һ���ļ�ͥ�����±�
			}
			System.out.print("\n");
		}
		
		/*�������жϵĽ��*/
		switch (who)
		{
			case 0:
				System.out.print("���һ���ĺ��������ż�");
				break;
			case 1:
				System.out.print("���һ���ĺ�����������");
				break;
			case 2:
				System.out.print("���һ���ĺ����������");
				break;
		}

	}

}
