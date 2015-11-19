import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ch4_1_2
{
	public static void main(String[] args) 
	{// 求素数   
//		long time1=new Date().getTime();
		List<Integer> primes = getPrimes(100);
		System.out.println("100以内素数如下：");
		for (int i = 0; i < primes.size(); i++) 
		{   
            Integer prime = primes.get(i);   
//            System.out.printf("%8d", prime);   
            System.out.print(prime+" ");
            if (i % 10 == 9) 
            {   
                System.out.println();   
            }   
        } 
//		long time=new Date().getTime()-time1;
//		System.out.println("\n"+time+"毫秒");
    }   

    /**  
     * 求 n 以内的所有素数  
     * @param n 范围  
     * @return n 以内的所有素数  
     */  

    private static List<Integer> getPrimes(int n) 
    {   
        List<Integer> result = new ArrayList<Integer>();   
        result.add(2);   
        for (int i = 3; i <= n; i += 2) 
        {   
            if (!divisible(i, result)) 
            {   
                result.add(i);   
            }   
        }   
      return result;   
    }   
   /**  
     * 判断 n 是否能被整除  
     * @param n      要判断的数字  
     * @param primes 包含素数的列表  
     * @return 如果 n 能被 primes 中任何一个整除，则返回 true。  
     */  

    private static boolean divisible(int n, List<Integer> primes) 
    {   
        for (Integer prime : primes) 
        {   
            if (n % prime == 0) 
            {   
                return true;  
            }  
            if(prime>=Math.sqrt(n))
            	break;
        }   
        return false;   
    }   
} 