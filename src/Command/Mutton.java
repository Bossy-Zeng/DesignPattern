package Command;

import Temp.OutClass;

/**
 * ���⴮��
 * */
public class Mutton {
    private static int MuttonNum=1;
    
    public static int getMuttonNum() {
		return MuttonNum;
	}
    public static void AddMutton(){
    	MuttonNum++;
    }
    /**
     * ʹ�����⴮
     * @param ʹ�õ���Ŀ
     * @return -1 ��ʾ�����������
     *         1  ��ʾ������㹻
     * */
    public static int UseMutton(int useNum){
    	if(MuttonNum<useNum){
    		OutClass.Print("���⴮���������"+"\n");
    		return -1;
    	}else {
			
			return 1;
		}
    }
    
    public static int UseOneMutton(){
    	return UseMutton(1);
    }
    
    public static void BakeOneMutton(){
    	MuttonNum--;
    }
}
