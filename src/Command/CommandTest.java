package Command;
/**
 * 命令模式测试
 * */
public class CommandTest {
     public static void main(String[] args) {
		//开店前的准备
    	 Barbecuer barbecuer=new Barbecuer();
    	 Command bakeMuttonCommand1=new BakeMuttoncCommand(barbecuer);
    	 Command bakeMuttonCommand2=new BakeMuttoncCommand(barbecuer);
    	 Command bakeChickenCommand=new BakeChickenWingCommand(barbecuer);
    	 
    	 Waiter girl=new Waiter();
    	 
    	 //开门营业 开始点菜
    	 girl.SetOrder(bakeChickenCommand);
    	 girl.SetOrder(bakeMuttonCommand1);
    	 girl.SetOrder(bakeMuttonCommand2);
    	 
    	 //通知厨房
    	 girl.Notify();
    	 
    	 //一个客户退订，另一个客户继续订羊肉串
    	 System.out.println("\n");
    	 try {
    		 Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	 girl.CancleOrder(bakeMuttonCommand1);
    	 girl.SetOrder(bakeMuttonCommand2);
    	 
    	 girl.Notify();
	}
}
