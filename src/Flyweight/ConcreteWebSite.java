package Flyweight;
/**
 * ������վ��
 * ����Ԫ�����ڲ����Ҳ����滷���ı���ı�Ĺ����֣�����Ϊ��Ԫ������ڲ�״̬��
 * �ڲ�״̬�洢��ConcreteWebSite����֮�С�
 * */
public class ConcreteWebSite extends WebSite {

	private String name="";
	public ConcreteWebSite(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void Use(User user) {
		// TODO Auto-generated method stub
		System.out.println("��վ���ࣺ"+name+" �û�: "+user.getName());
	}
	
}
