import java.text.DecimalFormat;
public class ch2_9 
{
	static double polynomial1D(double a[],int n,double x)
	{ 
		int i;
	    double result;
	    result=a[n-1];
	    for (i=n-2; i>=0; i--)				//�����㷨����
		{
			result=result*x+a[i];
		}
	    return result;					//���ؼ�����
	}
	public static void main(String[] args) 
	{
		int i;
	    double a[]={-15.0,-7.0,7.0,2.0,-3.0,7.0,3.0};
	    double[] x={-2.0,-0.5,1.0,2.0,3.7,4.0};
		double result;
		
		DecimalFormat df = new DecimalFormat("0.0000000E000"); 
		DecimalFormat df1 = new DecimalFormat("0.00"); 
		
		System.out.println("����P(x)=3x6+7x5-3x4+2x3+7x2-7x-15��ֵ");
	    for (i=0; i<6; i++)				//���������
		{
			result=polynomial1D(a,7,x[i]);
			System.out.print("x="+df1.format(x[i])+"ʱ��p(x)="+df.format(result)+"\n");
		}
	    System.out.print("\n");
	}
}