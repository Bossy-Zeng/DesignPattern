package Observer;
/**
 * ConcreteSubject�࣬��������������Ǿ���֪ͨ�ߣ�
 * ���й�״̬�������۲��߶����ھ���������ڲ�״̬ת��֮ʱ
 * �����еǼǹ��Ĺ۲��߷���֪ͨ
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
