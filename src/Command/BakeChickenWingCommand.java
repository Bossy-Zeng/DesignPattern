package Command;
/**
 * ������������
 * */
public class BakeChickenWingCommand extends Command{

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}
   //ִ�о��������
	@Override
	public void ExcuteCommand() {
		// TODO Auto-generated method stub
		barbecuer.BackChickenWing();
//		ChickenWing.BakeOneChickenWing();
	}

}
