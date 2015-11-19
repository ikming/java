public class Ch1_8 
{   
    static int length = 8;   
    static int value = 1;   
    static int[][] snake = new int[length][length];   
    static Direction lastDirection = Direction.Right;   
  
	static enum Direction
	{   
        Right, Down, Left, Up;   
    }   
  
	//��˳ʱ�룬�������ڣ��������
	public static void initialArray() 
	{   
        int row = 0, col = 0;   
        for (int c = 0; c < length * length; c++) 
        {   
            snake[row][col] = value; //��ǰλ�ø�ֵ  
            lastDirection = findDirection(row, col);  //Ѱ����һ������ 
            switch (lastDirection) {   
                case Right:   
                    col++;   //������ң��м�1
                    break;   
                case Down:   
                    row++;   //������£��м�1
                    break;   
                case Left:   
                    col--;   //��������м�1 
                    break;   
                case Up:   
                    row--;   //������ϣ��м�1
                    break;   
                default:   
                    System.out.println("error");   
            }   
            value++;   //��һ������
        }   
    }   
  
	//���ݵ�ǰ���򣬽�ϵ�ǰλ�ã�ȷ����һ������
	static Direction findDirection(int row, int col) 
	{   
        Direction direction = lastDirection;   
        switch (direction) {   
            case Right: {
            	//������ұ߽���ߵ�ǰλ���ҷ��Ѿ��������֣���ת������
                if ((col == length - 1) || (snake[row][col + 1] != 0))   
                    direction = direction.Down;   
                break;   
            }   
            case Down: { 
            	//������±߽���ߵ�ǰλ���·��Ѿ��������֣���ת������
                if ((row == length - 1) || (snake[row + 1][col] != 0))   
                    direction = direction.Left;   
                break;   
            }   
            case Left: { 
            	//�������߽���ߵ�ǰλ�����Ѿ��������֣���ת������
                if ((col == 0) || (snake[row][col - 1] != 0))   
                    direction = direction.Up;   
                break;   
            }   
            case Up: { 
            	//�����ǰλ���Ϸ��Ѿ��������֣���ת������
                if (snake[row - 1][col] != 0)   
                    direction = direction.Right;   
                break;   
            }   
        }   
        return direction;   
    }   
  
	static void print(int[][] arr)
	{
		for (int i = 0; i < length; i++)
	    {   
			for (int j = 0; j < length; j++)
	        {   
				System.out.printf(" %2d",arr[i][j]); 
	        }   
	        System.out.println();   
	    }   
	}
	
	public static void main(String[] args) 
	{   
        initialArray();  //������� 
        print(snake);   //���
    }   
}  