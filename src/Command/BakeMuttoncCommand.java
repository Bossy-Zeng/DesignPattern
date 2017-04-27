package Command;
/**
 * 烤羊肉串的命令
 * */
public class BakeMuttoncCommand extends Command{

	public BakeMuttoncCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	//具体命令类中，执行命令时，执行具体的行为
	@Override
	public void ExcuteCommand() {
		// TODO Auto-generated method stub
		barbecuer.BackMutton();
		
	}

}
