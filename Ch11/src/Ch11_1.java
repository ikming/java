import java.util.Scanner;

public class Ch11_1 
{
	 /** 
     * �ж��Ƿ�ƥ�� 
     * @param target Ŀ���ı��� 
     * @param mode ģʽ�� 
     * @return ƥ���� 
     */  
    public static boolean matchString(String target, String mode) 
    {  
        //Ϊ�˺��㷨����һ�£�ʹindex��1��ʼ������һǰ׺   
        String newTarget = "x" + target;   
        String newMode = 'x' + mode;  
          
        int[] K = calculateK(mode);//��ģʽ�����ַ���kֵ  
          
        int i = 1;  //Ŀ�괮�±�
        int j = 1; //ģʽ���±�
 
        while(i <= target.length() && j <= mode.length()) //�±�û�е��ﴮ��β��ѭ������
        {  
        	//���ģʽ���±���ݵ����ף���Ŀ�괮��ģʽ����ǰ�Ƚ��ַ���ͬ�������Ƚ���һ���ַ�
        	if (j == 0 || newTarget.charAt(i) == newMode.charAt(j)) 
            {  
                i++;  
                j++;  
            } 
            else //����ģʽ�����ݵ�K[j]�������Ƚ�
            {  
                j = K[j];  
            }  
        }  
          
        if (j > mode.length()) //ȫ���Ƚ�һ�飬˵��ƥ��ɹ�����ӡƥ�俪ʼ�±�
        {  
        	System.out.println("�±꣺"+(i-mode.length()));
        	return true;  
           
        }  
        return false;  
    }  
      
    /**
    *����Kֵ 
    *KMP�㷨�Ĺؼ���������next[]�����ֵ��������ģʽ��ÿ��λ�ô������׺��ǰ׺��ͬ�ĳ��ȣ� ������next[]�����ֵ������˼·����һ��˼·���õ��Ƶ�˼��ȥ���㣬����һ�־���ֱ��ȥ��⡣
  	*1.���յ��Ƶ�˼�룺
   	*���ݶ���next[0]=-1������next[j]=k, ��P[0...k-1]==P[j-k,j-1]
   	*1)��P[j]==P[k]������P[0..k]==P[j-k+1,j]������Ȼ��next[j+1]=next[j]+1=k+1;
   	*2)��P[j]!=P[k]������԰��俴��ģʽƥ������⣬��ƥ��ʧ�ܵ�ʱ��kֵ����ƶ�����Ȼk=next[k]��
    */  
    private static int[] calculateK(String mode) 
    {  
        //Ϊ�˺��㷨����һ�£�ʹindex��1��ʼ������һǰ׺   
        String newMode = "x" + mode;  
        int[] K = new int[newMode.length()];  
        int i = 1;  
        K[1] = 0;  //��һ��Ԫ��KֵΪ0
        int j = 0;  
          
        while(i < mode.length()) //������
        {  
          	if (j == 0 || newMode.charAt(i) == newMode.charAt(j)) //ƥ��������,p[j]==p[k]
            {  
                i++;  
                j++;  
                K[i] = j;  
            } 
            else //p[j]!=p[k]
            {  
                j = K[j];  //����
            }  
        }  
          
        return K;  
	} 
	 
    /** 
     * @param args 
     */  
    public static void main(String[] args) 
    {
    	String s1,s2;
        boolean b;
    	Scanner input=new Scanner(System.in);
        
    	System.out.println("������Ŀ�괮��");
    	s1=input.next();
    	System.out.println("������ģʽ����");
    	s2=input.next();
        
    	b=matchString(s1, s2);//�����ַ���ƥ�䷽��

    	System.out.println("ƥ��ɹ���"+b); 
 
	} 
	 
}  