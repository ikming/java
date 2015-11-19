import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ch10_1
{
	/*��Ϸ����״̬*/
	public static enum Status 
	{
		CONTINUE, WON, LOST
	};

	/*�������������*/
	public static Random random = new Random();

    /*��Ϸ�����еļ�������*/
	private final static int SNAKE_EYES = 2;
    private final static int TREY = 3;
    private final static int SEVEN = 7;
    private final static int YO_LEVEN = 11;
    private final static int BOX_CARS = 12;
	
	private  List<String> results;//�����Ϸ��������Ӯ״̬
	private  int w;//Ӯ
	private  int l;//��
	    
	public Ch10_1() 
	{
		results = new ArrayList<String>();
	    w = 0;
	    l = 0;
	}
	    
	public  void play() 
	{
		int myPoint = 0;
	    Status gameStatus = Status.CONTINUE;
	    int sumOfDice = rollDice(); //������

	    /*�������ӵĵ������޸���Ϸ״̬*/
	    switch (sumOfDice) 
	    {
	    	case SEVEN:
	        case YO_LEVEN:
	        	gameStatus = Status.WON;
	         	break;
	        case SNAKE_EYES:
	        case TREY:
	        case BOX_CARS:
	        	gameStatus = Status.LOST;
	        	break;
	    }
	        
	    if(gameStatus == Status.CONTINUE) 
	    {
	    	myPoint = sumOfDice;
	        System.out.printf("������  %d\n", myPoint);
	    }

	    /*�����Ϸ״̬Ϊ����������������*/
	    while (gameStatus == Status.CONTINUE) 
	    {
	    	sumOfDice = rollDice(); 

	        if (sumOfDice == myPoint)
	        	gameStatus = Status.WON;
	        else if (sumOfDice == SEVEN)
	        	gameStatus = Status.LOST;
	    } 

	    /*���������Ϸ�Ľ��������¼�����յ���Ϸ״̬��*/
	    if (gameStatus == Status.WON) 
		{
	    	System.out.println("���Ӯ");
	        results.add("Ӯ");
	        w++;
	    } 
	    else 
	    {
	    	System.out.println("�����");
	        results.add("��");
	        l++;
	    }
	} 

	/*������*/
	public int rollDice() 
	{
		/*������ɵ���*/
		int die1 = 1 + random.nextInt(6);
	    int die2 = 1 + random.nextInt(6);

	    int sum = die1 + die2;

	    System.out.printf("������ĵ���  %d + %d = %d\n", die1, die2, sum);

	    return sum;
	}
	 
	/*��ӡ���ս��*/
	public  void print() 
	{
		System.out.println("��Ϸ���ͳ�ƣ�");
	    System.out.println("Ӯ�Ĵ����� " + w);
	    System.out.println("��Ĵ����� " + l);
	    int i = 0;
	    for(String rs: results)
	    {
	    	System.out.println("��  "+(++i)+"��: " +rs);
	    }
	}
	
	public static void main(String[] args) 
	{
		
		String answer;
		Ch10_1 game=new Ch10_1();
           
        do{
        	game.play();
        
        	System.out.println("������Ϸ��(y/n)?");
        	Scanner input = new Scanner(System.in);
        	answer = input.next();
        }while("Y".equalsIgnoreCase(answer));
       
        game.print();
    }
}