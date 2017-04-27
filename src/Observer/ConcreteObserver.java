package Observer;



/**
 * ConcreteObserver类，具体观察者，实现抽象观察者角色所要求的更新接口
 * 以便是本身的状态与主题的状态相协调。
 * 具体观察者爵士可以保存一个指向具体主题对象的引用。
 * 具体观察者角色通常用一个具体子类实现
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
		System.out.println("观察者"+name+"的新状态是"+ObserverState);
	}
   public void setConcreteSubject(ConcreteSubject concreteSubject) {
	this.concreteSubject = concreteSubject;
   }
   public ConcreteSubject getConcreteSubject() {
	return concreteSubject;
   }
}
