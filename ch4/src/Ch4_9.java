import java.util.ArrayList;

public class Ch4_9 
{
	public static void main(String[] args) 
	{
		//�õ�100���ڵ��������ŵ������б���
		ArrayList pn=getPrimes(100);
		
		//��Ȳ��������У�ÿ���Ȳ��������б��浽�����б���һ������б���ÿһ�����������б�
		ArrayList alArNumRngs=getArithmeticalNumRanges(pn);
		
		ArrayList alArNumRng = new ArrayList();
        int intTolerace = 0;

        //ѭ������Ȳ���������
        for (int i = 0; i < alArNumRngs.size(); i++) 
        {
            alArNumRng = (ArrayList) alArNumRngs.get(i);
            for (int j = 0; j < alArNumRng.size(); j++) 
            {
                System.out.print(alArNumRng.get(j) + " ");
            }
            intTolerace = ((Integer) alArNumRng.get(alArNumRng.size()-1))
                    .intValue()
                    - ((Integer) alArNumRng.get(alArNumRng.size()-2))
                            .intValue();
            System.out.print("������ ��" + String.valueOf(intTolerace));

            System.out.println();
        }

	}
	
	//�õ�num���ڵ������������������б���
	public static  ArrayList getPrimes(int num) 
	{
        ArrayList allPrimeNum = new ArrayList();
        for (int i = 1; i <= num; i++) 
        {
            if (isPrimeNum(i)) 
            {
                allPrimeNum.add(new Integer(i));
            }
        }
        return allPrimeNum;
    }

    public static  boolean isPrimeNum(int num) 
    {
        if (num == 1) 
        {
            return false;
        }
        for (int i = 2; i <= ((int) Math.sqrt(num)); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

  //��Ȳ��������У�ÿ���Ȳ��������б��浽�����б���һ������б���ÿһ�����������б�
    public static ArrayList getArithmeticalNumRanges(ArrayList alNums) 
    {
        Integer thirdNum = new Integer(0);
        int tolerance = 0;
        int diff = 0;
        
        //alAriNumRng���������ҵ��ĵȲ���������
        ArrayList alAriNumRng = null;

        //alAriNumRngs��������alAriNumRng
        ArrayList alAriNumRngs = new ArrayList();
       
        for (int i = 0; i < alNums.size(); i++) 
        {
            for (int j = i + 1; j < alNums.size(); j++) 
            {
                //���ݺ�һ���������������
            	tolerance = ((Integer) alNums.get(j)).intValue()
                        - ((Integer) alNums.get(i)).intValue();
      
            	//���ݹ��������һ����������3����
                thirdNum = new Integer(((Integer) alNums.get(j)).intValue()
                        + tolerance);
                //�жϵ�3�����ǲ����������б������ҵ����Ͱ���3��������alAriNumRng�����б�
                if (alNums.contains(thirdNum)) 
                {
                    alAriNumRng = new ArrayList();
                    //�Ȳ���������3��
                    alAriNumRng.add(alNums.get(i));
                    alAriNumRng.add(alNums.get(j));
                    alAriNumRng.add(thirdNum);

                    
                    int intEndNum = thirdNum.intValue();
                   
                    /*
                     * �����жϺ�������ܲ�����ǰ���3��ɸ����ĵȲ�����
                     * �ӵ�3��������һ������ʼ�����μ�����alAriNumRng�����б�β�������Ĳ�������ڹ���ͼ���alAriNumRng�����б�
                     */
                   for (int k = alNums.indexOf(thirdNum) + 1; k < alNums
                            .size(); k++) 
                    {
                        diff = ((Integer) alNums.get(k)).intValue()
                                - intEndNum;
                        if (diff == tolerance) 
                        {
                            alAriNumRng.add(alNums.get(k));
                            intEndNum = ((Integer) alNums.get(k)).intValue();
                        }
                    }
                    //��alAriNumRng�����б����alAriNumRngs�����б���
                    alAriNumRngs.add(alAriNumRng);
                }
            }
        }
        return alAriNumRngs;
    }

}
