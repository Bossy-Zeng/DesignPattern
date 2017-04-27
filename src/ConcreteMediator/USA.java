package ConcreteMediator;
/**
 * 美国
 * */
public class USA extends Country{

	public USA(UnitedNations nations) {
		super(nations);
		// TODO Auto-generated constructor stub
	}
    
	public void Declare(String msg){
		mediator.Declare(msg, this);
	}
	
	public void getMessage(String msg){
		System.out.println("美国获得对方信息："+msg);
	}
}
