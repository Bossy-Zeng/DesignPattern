package Observer;

import java.util.ArrayList;

/**
 * Subject�࣬��Ϊ������ǳ���֪ͨ����
 * �������жԹ۲��߶�������ñ�����һ���ۼ���
 * �����ԶԹ۲��߶���������Ӻ�ɾ��
 * @author Bossy_Zeng
 *
 */
public abstract class Subject {
    private ArrayList<Observer>observers=new ArrayList<>();
    
    //���ӹ۲���
    public void Attach(Observer observer) {
		observers.add(observer);
	}
    
    //�Ƴ��۲���
    public void Detach(Observer observer) {
		observers.remove(observer);
	}
    //֪ͨ
    public void Notify() {
		for (Observer observer : observers) {
			observer.Update();
		}
	}
}
