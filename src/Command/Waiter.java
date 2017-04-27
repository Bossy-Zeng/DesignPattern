package Command;

import java.util.ArrayList;
import java.util.Date;


import Temp.OutClass;

/**
 * ����Ա��
 * */
public class Waiter {
    private ArrayList<Command> orders=new ArrayList<Command>();
    private ArrayList<Command> SubmitOrders=new ArrayList<Command>();
    //���ö���
    public void SetOrder(Command command){
    	
    	if(command.getClass().equals(BakeChickenWingCommand.class)
    			&&ChickenWing.UseOneChicken()==-1){
    		OutClass.Print("����Ա������û���ˣ�������տ�~"+"\n");
    		return;
    	}else if(command.getClass().equals(BakeMuttoncCommand.class)
    			&&Mutton.UseOneMutton()==-1) {
    		OutClass.Print("����Ա�����⴮û���ˣ�������տ�~"+"\n");
    		
    		return;
		}else {
			
			orders.add(command);
			if(command.getClass().equals(BakeMuttoncCommand.class)){
	    		Mutton.BakeOneMutton();
//	    		OutClass.Print("��ǰʣ�����⴮��"+Mutton.getMuttonNum()+"\n");
	    	}else {
				ChickenWing.BakeOneChickenWing();
			}
			OutClass.Print("���Ӷ�����"+command.getClass().toString()
					+"ʱ�䣺"+new Date()+"\n");
		}
    	OutClass.Print("��ǰʣ�����⴮��"+Mutton.getMuttonNum()+"\n");
    }
    
    //ȡ������
    public void CancleOrder(Command command){
    	if(orders.contains(command)){
    		orders.remove(command);
    	}
    	
    	if(command.getClass().equals(BakeMuttoncCommand.class)){
    		Mutton.AddMutton();
    	
    	}else {
			ChickenWing.AddChickeWing();
		}
    	OutClass.Print("ȡ��������"+command.getClass().toString()
				+"ʱ�䣺"+new Date()+"\n");
    }
    
    //֪ͨȫ��ִ��
    public void Notify(){
    	for (Command command : orders) {
			command.ExcuteCommand();
			SubmitOrders.add(command);
		}
    	//ÿ�η��������յ�ǰ����
    	orders.clear();
    }
}
