
public class Ch4_4 
{
	public static void main(String[] args) 
	{
	  
        int count=1;
        
        for (int i = 2; i < 1000; i++) 
        {   
         	/*i��������i�ķ�����Ҳ����������ô���ǿ�������
             *isSuShu()�ж��ǲ�������
            *fanXuShu()������
            */
            if (isSuShu(i) && isSuShu(fanXuShu(i)))   
            	System.out.printf(count++%7!=0? "%3d  ":"%3d \n",i);
        }   
  
    }   
  /**  
     * ������  
     */  
    public static boolean isSuShu(int n) 
    {   
        boolean isSuShu = true;   
        if (n == 1 || n == 2)   
            return true;   
        for (int i = 2; i < Math.sqrt(n) + 1; i += 1) 
        {   
            if (n % i == 0) 
            {   
                return false;   
            }   
        }   
        if (isSuShu == true)   
            return true;   
        else  
            return false;   
    }   
    /**  
     * ������  
     */  
    public static int fanXuShu(int n) 
    {   
        //getBitCount(n)����n�ĳ���
    	int len = getBitCount(n);   
        int s = 0;   
        for (int i = 1; i < len + 1; i++) 
        {   
        	//getBit(n,i)����n�ĵ�iλ�ϵ�����
            s += Math.pow(10, len - i) * getBit(n, i);   
        }   
        return s;   
    }   
    
   /**  
     * ��ȡһ������λ��  
     */  
    public static int getBitCount(int n) 
    {   
        int i = 1;   
        while (n / 10 > 0) 
        {   
            i++;   
            n /= 10;   
        }   
        return i;   
    }   
  
   
    /**  
     * ��ȡNλ����iλ  
     */  
    public static int getBit(int num, int i) 
    {   
        if (i > getBitCount(num) || i < 1)   
            return -1;   
        return (num % ((int) Math.pow(10, i))) / (int) Math.pow(10, i - 1);   
    }   
}