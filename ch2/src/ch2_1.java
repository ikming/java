import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class ch2_1 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("��������ʼ��ݣ�");
		int year=input.nextInt();
		System.out.print("������������δ�����꣺");
		int n=input.nextInt();
		getBlackFri(year,n);

	}
	
	//��ӡδ������ĺ�ɫ�����壬�ж�ÿ���µ�13���Ƿ���������
	public static void getBlackFri(int year,int n)
	{
		//yearΪ�������ݣ�nΪδ��������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E");
//		int years = Integer.parseInt(year);
		int k=0;
//		Calendar cal = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
		while(k<n)
		{
			for (int i = 0; i < 12; i++) 
			{
				cal.set(year, i,13);
				if(5==(cal.get(Calendar.DAY_OF_WEEK)-1))
				{
					System.out.println("��ɫ�����壺"+sdf.format(cal.getTime()));
				}
			}
			year++;
			k++;
		}
	}
}


