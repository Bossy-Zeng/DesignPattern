package Observer;

import java.util.ArrayList;

/**
 * Subject类，即为主题或是抽象通知者类
 * 他将所有对观察者对象的引用保存在一个聚集中
 * 并可以对观察者对象进行增加和删除
 * @author Bossy_Zeng
 *
 */
public abstract class Subject {
    private ArrayList<Observer>observers=new ArrayList<>();
    
    //增加观察者
    public void Attach(Observer observer) {
		observers.add(observer);
	}
    
    //移除观察者
    public void Detach(Observer observer) {
		observers.remove(observer);
	}
    //通知
    public void Notify() {
		for (Observer observer : observers) {
			observer.Update();
		}
	}
}
