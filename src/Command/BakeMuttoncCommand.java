package Command;
/**
 * �����⴮������
 * */
public class BakeMuttoncCommand extends Command{

	public BakeMuttoncCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	//�����������У�ִ������ʱ��ִ�о������Ϊ
	@Override
	public void ExcuteCommand() {
		// TODO Auto-generated method stub
		barbecuer.BackMutton();
		
	}

}
