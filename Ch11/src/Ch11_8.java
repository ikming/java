import java.util.Scanner;

public class Ch11_8 
{
	//�������ձ�
	static String a[][]={{"","I","II","III","IV","V","VI","VII","VIII","IX"},
        {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
        {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}};
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("������һ�����������֣�");
		int n=in.nextInt();
		int t=0;
		System.out.printf("%d=",n);
		
		int i=1000;
		int fz;//����
		int fm;//��ĸ
		int row;
		int col;
		for(int m=0;m<3;m++)
		{
			fz=n%i;
			fm=i/10;
			t=fz/fm;//�Ӹ�λ���λ����ȡ����λ����
			
			row=2-m;
			col=t;
			System.out.printf("%s",a[row][col]);//���ձ������
			i=i/10;
		}
		System.out.printf("\n");
	}
}