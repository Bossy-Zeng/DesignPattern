package Mediator;
/**
 * ����ͬ����2
 * */
public class ConcreteColleage2 extends Colleage {

	public ConcreteColleage2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void Send(String msg){
		mediator.Send(msg, this);
	}
	
	public void Notify(String msg){
		System.out.println("ͬ��2�õ���Ϣ��"+msg);
	}

}
