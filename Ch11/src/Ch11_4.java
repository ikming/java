import java.util.Scanner;


public class Ch11_4 
{
	public static void main(String[] args)
	{
        
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ��������");
		String addA=input.next();
		System.out.print("������ڶ���������");
		String addB=input.next();
//		String addA="30812111123";
//        String addB="298";
        //���÷��������������
        System.out.println(addA+"+"+addB+"="+strvalue(addA,addB));
    }
    
    public static String strvalue(String addA,String addB)
    {
        String strvalue="";
        int lenA=addA.length();
        int lenB=addB.length();
 
        int templen=0;
        //����������ͬ
        if(lenA>=lenB)
        {
            templen=lenA-lenB;
            addB=maxlen(addB,templen);//�������ȣ�ʹ�����������һ��
        }else{
            templen=lenB-lenA;
            addA=maxlen(addA,templen);
        }
        char addcharA[]=addA.toCharArray();
        char addcharB[]=addB.toCharArray();
 
        int len=addcharA.length;
        int valueC[]=new int[len];
        for(int i=0;i<len;i++)
        {
            //ȡ���ַ����е���ת��Ϊ����
        	int a=Integer.parseInt(String.valueOf(addcharA[i]));
            int b=Integer.parseInt(String.valueOf(addcharB[i]));
            valueC[i]=a+b;//ÿ����Ӵ洢
        }
        int tmp=0;//�����λ
        //�����λ
        for(int i=valueC.length-1;i>=0;i--)
        {
            if(valueC[i]>=10)
            {
                strvalue=String.valueOf(valueC[i]+tmp-10)+strvalue;
                tmp=valueC[i]/10;
            }else{
                strvalue=String.valueOf(valueC[i]+tmp)+strvalue;
                tmp=0;
            }
        }
        return strvalue;
    }
    
    //�������ȣ�ʹ�䳤��һ��
    private static String maxlen(String str,int templen)
    {
        String strmax=null;
        StringBuffer buff=new StringBuffer();
        for(int i=0;i<templen;i++)
        {
            buff.append("0");
        }
        strmax=buff.toString()+str;
        return strmax;
    }
} 