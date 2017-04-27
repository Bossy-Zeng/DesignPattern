package Mediator;
/**
 * �����н�����
 * */
public class ConcreteMediator extends Mediator {

	//��Ҫ�˽����е�ͬ�¶���
	private ConcreteColleage1 ConcreteColleage1;
	private ConcreteColleage2 ConcreteColleage2;
	
	public void setConcreteColleage1(ConcreteColleage1 concreteColleage1) {
		ConcreteColleage1 = concreteColleage1;
	}
	public void setConcreteColleage2(ConcreteColleage2 concreteColleage2) {
		ConcreteColleage2 = concreteColleage2;
	}
	/**
	 * ��д������Ϣ�ķ��������ݶ�������ѡ���жϣ�֪ͨ����
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
