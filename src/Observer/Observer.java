package Observer;
/**
 * Observer类，抽象观察者，为所有的具体观察者定义一个接口
 * 在得到主题的通知时更新自己，这个接口叫做更新接口
 * 其中包含的一个Update方法，称作更新方法
 * @author Bossy_Zeng
 *
 */
public abstract class Observer {
     public abstract void Update() ;
}
