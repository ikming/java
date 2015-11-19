
public class Ch7_6 
{
	public static void main(String[] args) 
	{
		String m[]={" ","美国","英国","法国","德国","意大利","俄国"}; /*国名*/
		int a[][]=new int[7][7];
		int i,j,t,e,x=0,y=0;
		
		/*初始化条件矩阵,1表示是该国人*/
		for(i=0;i<7;i++) 
			for(j=0;j<7;j++) 
				a[i][j]=1;

//		for(i=1;i<7;i++) /*条件矩阵每一列的第0号元素作为该列数据处理的标记*/
//			a[0][i]=1; /*标记该列尚未处理*/

		/*输入条件矩阵中的各种条件
		 * 0表示不是该国的人
		 */
		a[1][1]=a[2][1]=a[3][1]=a[5][1]=0; 
		a[1][3]=a[2][3]=a[3][3]=0; 
		a[1][4]=a[2][4]=a[3][4]=a[5][4]=a[6][4]=0;
		a[3][5]=0;
		a[1][6]=a[3][6]=a[5][6]=0;

		while(a[0][1]+a[0][2]+a[0][3]+a[0][4]+a[0][5]+a[0][6]>0)
		{ 
			/*当所有六列均处理完毕后退出循环*/
			for(i=1;i<7;i++) /*i:列坐标*/
				if(a[0][i]!=0) /*若该列尚未处理，则进行处理*/
				{
					for(e=0,j=1;j<7;j++) /*j:行坐标 e:该列中非0元素计数器*/
						if(a[j][i]!=0)
						{ 
							x=j;
							y=i;
							e++;
						}
					if(e==1) /*若该列只有一个元素为非零，则进行消去操作*/
					{
						for(t=1;t<7;t++)
							if(t!=i)
								a[x][t]=0; /*将非零元素所在的行的其它元素置0*/
						a[0][y]=0; /*设置该列已处理完毕的标记*/
					}
				}
		}

		/*输出推理结果*/
		for(i=1;i<7;i++) 
		{
			System.out.printf("%c 来自于: ",'A'-1+i);
			for(j=1;j<7;j++)
				if(a[i][j]==1)
				{
					System.out.printf("%s.\n",m[j]);
					break;
				}
		}
	}
}
