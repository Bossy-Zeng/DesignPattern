package �¼�ί��;
/**
 * �������ķ�����BadNotifier
 * */
public class BadNotifier extends Notifier {   
	  
    @Override  
    public void addListener(Object object, String methodName, Object... args) {   
        System.out.println("���µ�ͬѧί�в���ְ�ķ�����!");   
        this.getEventHandler().addEvent(object, methodName, args);   
    }   
  
    @Override  
    public void notifyX() {   
        System.out.println("����ְ�ķ����˲��������ظ���������Ҫ��æ��ͬѧ����ʦ����");   
        try{   
            this.getEventHandler().notifyX();   
        }catch(Exception e){   
            e.printStackTrace();   
        }   
    }   
  
}   