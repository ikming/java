public class Ch7_4 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		//��ٸ������
		for(a=0;a<=1;a++)
			for(b=0;b<=1;b++)
				for(c=0;c<=1;c++)
				{
					//Լ������
					if((a==1&&b==0||a==0&&b==1)&&(b==1&&c==0||b==1&&c==1)&&(c==1&&a+b==0||c==0&&a+b!=0))
					{
						System.out.println("����˵����"+(a==1?"�滰":"�ٻ�"));
						System.out.println("����˵����"+(b==1?"�滰":"�ٻ�"));
						System.out.println("����˵����"+(c==1?"�滰":"�ٻ�"));
					}
				} 
	}
}
