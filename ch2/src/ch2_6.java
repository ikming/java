public class ch2_6 
{ 
	/**  
     * �ж��Ƿ�ȫ���,ȫ��ȷ���true  
     */  
    public static boolean isSame(int[] a) { 
    	int n=0;
    	boolean b=false;
    	for(int i=0;i<a.length-1;i++) 
			{ 
				if(a[i]==a[i+1]) 
				{  
					n++; 
				} 
 	  
				if(n==a.length-1)  
					b=true; 
				} 
       return b;
    }   
    
    
    /**  
     * ��ʾ�����ֵ  
     */  
    public static void show(int[] a) {   
        if (a == null)   
            System.out.println("Array = null");   
        for (int i = 0; i < a.length; i++) {   
            System.out.print(a[i] + " ");   
        }   
        System.out.println();   
    }   
	
	
	public static void main(String args[])
	{ 
		int tang[]={10,2,8,22,16,4,10,6,14,20};	
		int times=0; 
		boolean b=true; 

		while(isSame(tang)==false)
		{ 
//			int m=tang[0];//�����һ��С�����ǹ� �����ǹ� 
//			for(int i=0;i<9;i++) 
//			{ 
//				tang[i]=tang[i]/2+tang[i+1]/2; 
//				tang[9]=tang[9]/2+m/2; 
//				
//			} 
			
			int m=tang[9];
			for(int i=9;i>0;i--)
			{
				tang[i]=tang[i]/2+tang[i-1]/2;
			}
			tang[0]=tang[0]/2+m/2;
			//��¼���ǹ�����  
			times++; 
			 System.out.print("��" + times+ "�η�֮������ ");   
	         show(tang); 
			
			
			//�ǹ�Ϊ����������ʦҪ�ǹ� 
			for(int i=0;i<10;i++) 
				if(tang[i]%2!=0) 
					tang[i]+=1; 


		}	
 	
		System.out.println("���ǹ�������"+times); 
		System.out.println("ÿ�������յ��ǹ�������"+tang[0]); 
	} 
}