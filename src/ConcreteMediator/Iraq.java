package ConcreteMediator;
/**
 * ���� ������
 * */
public class Iraq extends Country{

	public Iraq(UnitedNations nations) {
		super(nations);
		// TODO Auto-generated constructor stub
	}

	public void Declare(String msg){
		mediator.Declare(msg, this);
	}
	
	public void getMessage(String msg){
		System.out.println("�����˻�öԷ���Ϣ��"+msg);
	}
}
