package Mediator;
/**
 * ����ͬ����1
 * */
public class ConcreteColleage1 extends Colleage {

	public ConcreteColleage1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void Send(String msg){
		mediator.Send(msg, this);
	}
	
	public void Notify(String msg){
		System.out.println("ͬ��1�õ���Ϣ��"+msg);
	}
	
	
}
