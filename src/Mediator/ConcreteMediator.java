package Mediator;
/**
 * 具体中介者类
 * */
public class ConcreteMediator extends Mediator {

	//需要了解所有的同事对象
	private ConcreteColleage1 ConcreteColleage1;
	private ConcreteColleage2 ConcreteColleage2;
	
	public void setConcreteColleage1(ConcreteColleage1 concreteColleage1) {
		ConcreteColleage1 = concreteColleage1;
	}
	public void setConcreteColleage2(ConcreteColleage2 concreteColleage2) {
		ConcreteColleage2 = concreteColleage2;
	}
	/**
	 * 重写发送信息的方法，根据对象做出选择判断，通知对象
	 * */
	@Override
	public void Send(String msg, Colleage colleage) {
		// TODO Auto-generated method stub
		if(colleage.equals(ConcreteColleage1)){
			ConcreteColleage2.Notify(msg);
		}else {
			ConcreteColleage1.Notify(msg);
		}
	}

}
