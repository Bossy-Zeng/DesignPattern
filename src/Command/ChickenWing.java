package Command;

import Temp.OutClass;

/**
 * 鸡翅类
 * */
public class ChickenWing {
    private static int ChickenwingNum=2;
    
    public static void AddChickeWing(){
    	ChickenwingNum++;
    }
    /**
     * 使用鸡翅
     * @param 使用的数目
     * @return -1 表示库存量不够；
     *         1  表示库存量足够
     * */
    public static int UseChickenwing(int useNum){
    	if(ChickenwingNum<useNum){
    		OutClass.Print("鸡翅库存量不足"+"\n");
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
