package Observer;



/**
 * ConcreteObserver�࣬����۲��ߣ�ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿ�
 * �Ա��Ǳ����״̬�������״̬��Э����
 * ����۲��߾�ʿ���Ա���һ��ָ����������������á�
 * ����۲��߽�ɫͨ����һ����������ʵ��
 * @author Bossy_Zeng
 *
 */
public class ConcreteObserver extends Observer {
    
	private String name;
	private String ObserverState;
	private ConcreteSubject concreteSubject;
	
	public ConcreteObserver(ConcreteSubject subject,String mName) {
		// TODO Auto-generated constructor stub
		this.concreteSubject=subject;
		this.name=mName;
		
	}
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		ObserverState=concreteSubject.getSubjectState();
		System.out.println("�۲���"+name+"����״̬��"+ObserverState);
	}
   public void setConcreteSubject(ConcreteSubject concreteSubject) {
	this.concreteSubject = concreteSubject;
   }
   public ConcreteSubject getConcreteSubject() {
	return concreteSubject;
   }
}
