package 事件委托;
/**
 * 放哨的学生：这里先抽象出一个抽象类，因为放哨的人有尽职尽责的，也有马马虎虎的，
 * 但是他们有功能的方法1。增加需要帮忙放哨的学生  2。通知所有需要放哨的学生：老师来了
 * */
public abstract class Notifier {   
    private EventHandler eventHandler=new EventHandler();   
       
    public EventHandler getEventHandler() {   
        return eventHandler;   
    }   
    public void setEventHandler(EventHandler eventHandler) {   
        this.eventHandler = eventHandler;   
    }   
    //增加需要帮忙放哨的学生   
    public abstract void addListener(Object object,String methodName,Object...args);   
    //告诉所有要帮忙放哨的学生：老师来了   
    public abstract void notifyX();   
}  
