package �¼�ί��;
/**
 * ���ڵ�ѧ���������ȳ����һ�������࣬��Ϊ���ڵ����о�ְ����ģ�Ҳ���������ģ�
 * ���������й��ܵķ���1��������Ҫ��æ���ڵ�ѧ��  2��֪ͨ������Ҫ���ڵ�ѧ������ʦ����
 * */
public abstract class Notifier {   
    private EventHandler eventHandler=new EventHandler();   
       
    public EventHandler getEventHandler() {   
        return eventHandler;   
    }   
    public void setEventHandler(EventHandler eventHandler) {   
        this.eventHandler = eventHandler;   
    }   
    //������Ҫ��æ���ڵ�ѧ��   
    public abstract void addListener(Object object,String methodName,Object...args);   
    //��������Ҫ��æ���ڵ�ѧ������ʦ����   
    public abstract void notifyX();   
}  
