
 
 public class Ch3_6 {
	 
     public static final void getGouguNum(int maxnum)
     {
    	//  ͨ�����������ҹ�����
           for(int i = 1; i < maxnum; i++)
           {
               for(int j = i+1; j < maxnum; j++)
               {
                  for(int n = j + 1; n < maxnum; n++)
                  {
                      if((i*i+j*j)==n*n)
                      {
                         System.out.println(" "+i+" "+j+" "+n);
                      }
                  }
               }
  
           }
  
      }
     
     
     public static final void getGouguNum2(int maxnum)
     {
    	//  ͨ�����������ҹ�����
           for(int i = 1; i < maxnum-2; i++)
           {
               for(int j = i+1; j < maxnum-1; j++)
               {
                  int sum=i*i+j*j;
                  int c=(int)(Math.sqrt(sum));
            	 
                   if(c*c==sum&&c<=maxnum)
                      {
                         System.out.println(" "+i+" "+j+" "+c);
                      }
                  
               }
  
           }
  
      }
     
 
     public static void main(String[] args) 
     {
    	 
    	System.out.print("���������£�\n");
    	long begin=System.currentTimeMillis();
    	getGouguNum2(10000);
        long end=System.currentTimeMillis();
        System.out.print("��ʱ" + (end-begin) + "ms");
 
     }
 
 }
 
