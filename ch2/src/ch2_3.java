
public class ch2_3 
{
	public static  final  double MONEYRATE=0.0171;
	public static void main(String[] args) {
  
		//������,����Ϊ����
  
  
		//����һ������Ϊ48�����飬����װÿ�����³���ʣ�µĴ��
		double money[]=new double[48];
		
		//���һ�����³�1000Ԫ
		money[47]=1000;
		System.out.printf("48�³���ʣ������Ϊ��%.2f\n",money[47]);
		//ͨ��ѭ�����Ƴ�ǰһ���µ�ʣ����
		for(int i=47;i>0;i--){
			money[i-1]=1000+money[i]/(1+MONEYRATE/12);
			System.out.printf("%d�³���ʣ������Ϊ��%.2f\n",i,money[i-1]);
		}
		//������Ҫ�����Ǯ������һ��ʣ������
		System.out.printf("\n���Ҫ����%.2fԪ��",money[0]);
  
/*		//��48���³�С��ȡ������1000Ԫ,���Ǹ���48��Ԫ�ظ�ֵΪ0,��ʾ��48���³��Ĵ��Ϊ0;
		money[47]=0;
  
		System.out.println(48+"�³���ʣ������Ϊ��"+money[47]);
		//ͨ��ѭ�����Ƴ�ǰһ���µ�ʣ����
		for(int i=47;i>0;i--){
			money[i-1]=money[i]/(1+MONEYRATE/12)+1000;
			System.out.println(i+"�³���ʣ������Ϊ��"+money[i-1]);
		}
  
		//������Ҫ�����Ǯ
		double saveMoney=money[0]/(1+MONEYRATE/12)+1000;
		System.out.println("���Ҫ����"+saveMoney+"Ԫ");*/
	}
}