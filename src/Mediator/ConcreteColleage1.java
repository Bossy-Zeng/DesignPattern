package Mediator;
/**
 * 具体同事类1
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
		System.out.println("同事1得到信息："+msg);
	}
	
	
}
