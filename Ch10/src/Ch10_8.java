
public class Ch10_8 
{
	static String name[]={"С��","�ܵ�","�ְ�","����","үү"};//������
	static int time[] = {2,5,6,9,13};      //ÿ���˹�������Ҫ��ʱ��;
	
	//����һ ����߽�������2���͹���
	static void step1(int a,int b,int y,int z)
	{
		String pA=name[a];
		String pY=name[y];
		String pZ=name[z];
		int tY=time[y];
		int tA=time[a];
		int tZ=time[z];
		System.out.println(pA+"��"+pZ+"���ţ�����"+tZ+"����");
		System.out.println(pA+"����������"+tA+"����");
		System.out.println(pA+"��"+pY+"���ţ�����"+tY+"����");
		System.out.println(pA+"����������"+tA+"����");
	}
	//������ ����2����������2���͹���
	static void step2(int a,int b,int y,int z)
	{
		String pA=name[a];
		String pB=name[b];
		String pY=name[y];
		String pZ=name[z];
		int tB=time[b];
		int tA=time[a];
		int tZ=time[z];
		System.out.println(pA+"��"+pB+"���ţ�����"+tB+"����");
		System.out.println(pA+"����������"+tA+"����");
		System.out.println(pY+"��"+pZ+"���ţ�����"+tZ+"����");
		System.out.println(pB+"����������"+tB+"����");
	}
	
	//������  ��3���˹���
		static void step3(int a,int b,int c)
		{
			System.out.println(name[a]+"��"+name[b]+"���ţ�����"+time[b]+"����");
			System.out.println(name[a]+"����������"+time[a]+"����");
			System.out.println(name[a]+"��"+name[c]+"���ţ�����"+time[c]+"����");
		}
	
		//������  ��2���˹���
		static void step4(int a)
		{
			System.out.println(name[0]+"��"+name[a]+"���ţ�����"+time[a]+"����");
		}
	
	public static void main(String[] args) 
	{
		int n=5;//����
		int sum=0;
		int i;
		for(i=n-1;i>2;i=i-2)
		{
			//����2����������2���͹���
			if(time[0]+time[1]+time[1]+time[i]<time[0]+time[0]+time[i-1]+time[i])
			{
				sum=sum+time[0]+time[1]+time[1]+time[i];
				step2(0,1,i-1,i);//�����ϸ����
			}
			else//����߽�������2���͹���
			{
				sum=sum+time[0]+time[0]+time[i-1]+time[i];
				step1(0,1,i-1,i);//�����ϸ����
			}
			
		}
		if(i==2)//�����˹���
		{
			sum=sum+time[0]+time[1]+time[2];
			step3(0,1,2);//�����ϸ����
		}
		else if(i==1)//�����˹���
		{
			sum=sum+time[1];
			step4(1);//�����ϸ����
		}
		else//һ���˹��ţ���ʵ������
			sum=time[0];
		System.out.print("��̹���ʱ��Ϊ��"+sum);
	}
}
