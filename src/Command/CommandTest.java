package Command;
/**
 * ����ģʽ����
 * */
public class CommandTest {
     public static void main(String[] args) {
		//����ǰ��׼��
    	 Barbecuer barbecuer=new Barbecuer();
    	 Command bakeMuttonCommand1=new BakeMuttoncCommand(barbecuer);
    	 Command bakeMuttonCommand2=new BakeMuttoncCommand(barbecuer);
    	 Command bakeChickenCommand=new BakeChickenWingCommand(barbecuer);
    	 
    	 Waiter girl=new Waiter();
    	 
    	 //����Ӫҵ ��ʼ���
    	 girl.SetOrder(bakeChickenCommand);
    	 girl.SetOrder(bakeMuttonCommand1);
    	 girl.SetOrder(bakeMuttonCommand2);
    	 
    	 //֪ͨ����
    	 girl.Notify();
    	 
    	 //һ���ͻ��˶�����һ���ͻ����������⴮
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
