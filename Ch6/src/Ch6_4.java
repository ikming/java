public class Ch6_4 
{
	public static void main(String[] args) 
	{
		int p,q,r,s,count=0;
		System.out.print("���ܵĽ�����£� \n");
		
		/*��ٷ�ĸ*/
		for(p=2;p<5;p++) 
			for(q=p;q<7;q++)
				for(r=q;r<13;r++)
					if(p*q*r-q*r-p*r-p*q!=0)
					{ 
						/*���s��ֵ*/
						s=(p*q*r)/(p*q*r-q*r-p*r-p*q);
						
						/*sΪ�����Ҵ���r */
						if((p*q*r)%(p*q*r-q*r-p*r-p*q)==0&&s>=r)
							/*������*/
							System.out.printf("[%2d] 1/%d+1/%d+1/%d+1/%d=1 \n",++count,p,q,r,s);
					}
		System.out.print("���������");
	}
}
