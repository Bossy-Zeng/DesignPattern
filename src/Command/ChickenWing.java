package Command;

import Temp.OutClass;

/**
 * ������
 * */
public class ChickenWing {
    private static int ChickenwingNum=2;
    
    public static void AddChickeWing(){
    	ChickenwingNum++;
    }
    /**
     * ʹ�ü���
     * @param ʹ�õ���Ŀ
     * @return -1 ��ʾ�����������
     *         1  ��ʾ������㹻
     * */
    public static int UseChickenwing(int useNum){
    	if(ChickenwingNum<useNum){
    		OutClass.Print("������������"+"\n");
    		return -1;
    	}else {
    		
			return 1;
		}
    }
    
    public static int UseOneChicken(){
    	return UseChickenwing(1);
    }
    
    public static void BakeOneChickenWing(){
    	ChickenwingNum--;
    }
}
