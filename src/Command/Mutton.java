package Command;

import Temp.OutClass;

/**
 * 羊肉串类
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
     * 使用羊肉串
     * @param 使用的数目
     * @return -1 表示库存量不够；
     *         1  表示库存量足够
     * */
    public static int UseMutton(int useNum){
    	if(MuttonNum<useNum){
    		OutClass.Print("羊肉串库存量不足"+"\n");
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
