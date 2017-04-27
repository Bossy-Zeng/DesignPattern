package Command;
/**
 * 烤鸡翅命令类
 * */
public class BakeChickenWingCommand extends Command{

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}
   //执行具体的命令
	@Override
	public void ExcuteCommand() {
		// TODO Auto-generated method stub
		barbecuer.BackChickenWing();
//		ChickenWing.BakeOneChickenWing();
	}

}
