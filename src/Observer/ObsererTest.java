package Observer;

/**
 * �Թ۲���ģʽ���в���
 * @author Bossy_Zeng
 *
 */
public class ObsererTest {
  public static void main(String[] args) {
	ConcreteSubject concreteSubject=new ConcreteSubject();
	concreteSubject.Attach(new ConcreteObserver(concreteSubject,"XX"));
	concreteSubject.Attach(new ConcreteObserver(concreteSubject,"YY"));
	concreteSubject.Attach(new ConcreteObserver(concreteSubject,"ZZ"));
	
	concreteSubject.setSubjectState("ABC");
	concreteSubject.Notify();
  }
}
