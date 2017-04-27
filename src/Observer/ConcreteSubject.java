package Observer;
/**
 * ConcreteSubject类，叫做具体主题或是具体通知者，
 * 将有关状态存入具体观察者对象；在具体主题的内部状态转变之时
 * 给所有登记过的观察者发出通知
 * @author Bossy_Zeng
 *
 */
public class ConcreteSubject extends Subject {
     private String subjectState;
     public String getSubjectState() {
		return subjectState;
	}
     public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
}
