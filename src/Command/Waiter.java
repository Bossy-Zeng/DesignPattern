package Command;

import java.util.ArrayList;
import java.util.Date;


import Temp.OutClass;

/**
 * 服务员类
 * */
public class Waiter {
    private ArrayList<Command> orders=new ArrayList<Command>();
    private ArrayList<Command> SubmitOrders=new ArrayList<Command>();
    //设置订单
    public void SetOrder(Command command){
    	
    	if(command.getClass().equals(BakeChickenWingCommand.class)
    			&&ChickenWing.UseOneChicken()==-1){
    		OutClass.Print("服务员：鸡翅没有了，请点别的烧烤~"+"\n");
    		return;
    	}else if(command.getClass().equals(BakeMuttoncCommand.class)
    			&&Mutton.UseOneMutton()==-1) {
    		OutClass.Print("服务员：羊肉串没有了，请点别的烧烤~"+"\n");
    		
    		return;
		}else {
			
			orders.add(command);
			if(command.getClass().equals(BakeMuttoncCommand.class)){
	    		Mutton.BakeOneMutton();
//	    		OutClass.Print("当前剩余羊肉串："+Mutton.getMuttonNum()+"\n");
	    	}else {
				ChickenWing.BakeOneChickenWing();
			}
			OutClass.Print("增加订单："+command.getClass().toString()
					+"时间："+new Date()+"\n");
		}
    	OutClass.Print("当前剩余羊肉串："+Mutton.getMuttonNum()+"\n");
    }
    
    //取消订单
    public void CancleOrder(Command command){
    	if(orders.contains(command)){
    		orders.remove(command);
    	}
    	
    	if(command.getClass().equals(BakeMuttoncCommand.class)){
    		Mutton.AddMutton();
    	
    	}else {
			ChickenWing.AddChickeWing();
		}
    	OutClass.Print("取消订单："+command.getClass().toString()
				+"时间："+new Date()+"\n");
    }
    
    //通知全部执行
    public void Notify(){
    	for (Command command : orders) {
			command.ExcuteCommand();
			SubmitOrders.add(command);
		}
    	//每次发完命令，清空当前数据
    	orders.clear();
    }
}
