import java.util.Random;

/*�˿�����*/
class Card
{
   int Suit;				//��ɫ 
   char Number;				//��������
}

public class Ch10_2 
{
	static Card[] OneCard=new Card[52];	//����ÿ���˿˵Ļ�ɫ������
	
	/*��ʾ�˿���*/ 
	static void showCard() 				
	{
	   int i, j;
	   String s="";

	   for (i = 0, j = 0; i < 52; i++, j++)
	   {
		  if (j % 13==0)
		  {
			 System.out.print("\n");
		  }
		  switch(OneCard[i].Suit)				//��ʾ��ɫ����
		  {
		  case 1:
			  s="����";
			  break;
		  case 2:
			  s="����";
			  break;
		  case 3:
			  s="÷��";
			  break;
		  case 4:
			  s="����";
			  break;
		  default:
			  ;
		  }
		  System.out.printf("  "+s+OneCard[i].Number);//�����ʾ
	   }
	   System.out.print("\n");
	}
	
	/*ϴ��*/
	static void shuffle()								
	{
		int i,j;
		
	    Card tempcard=new Card();

	   Random r=new Random();					//�������
	   for (i = 0; i < 52; i++)
	   {
		  j = r.nextInt(52);					//�������
		  tempcard = OneCard[j];
		  OneCard[j] = OneCard[i];
		  OneCard[i] = tempcard;
	   }
	}
	
	public static void main(String[] args) 
	{
		initial();              //����һ������
		
		System.out.printf("һ�����Ƶĳ�ʼ��������:\n"); 		
		showCard();				//��ʾ���Ƶ�����
		
		shuffle();				//ϴ��
		
		System.out.print("\nϴ�ƺ����������:\n");
		showCard();				//��ʾϴ�ƺ������
	}

	/*����һ������*/
	private static void initial() 
	{
		int i,temp;
		int suit;
		
	   suit=0;
	   for (i = 0; i < 52; i++)				//����52���� 
	   {
		  if (i % 13 == 0)
		  {
			 suit++;						//�ı仨ɫ 
		  }
		  Card t=new Card();
		  t.Suit = suit;					//���滨ɫ 
		  temp = i % 13;
		  switch(temp)						//����ֵ����
		  {
		  case 0:
			  t.Number = 'A';
			  break;
		  case 9:
			  t.Number = '0';			//����10
			  break;
		  case 10:
			  t.Number = 'J';
			  break;
		  case 11:
			  t.Number = 'Q';
			  break;
		  case 12:
			  t.Number = 'K';
			  break;
		  default:
			  t.Number =(char)(temp + '1');
		  }
		  OneCard[i]=t;

	   }
		
	}
}