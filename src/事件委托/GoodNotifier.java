package �¼�ί��;
/**
 * ��ְ����ķ�����GoodNotifier
 * */
public class GoodNotifier extends Notifier {   
	  
    @Override  
    public void addListener(Object object, String methodName, Object... args) {   
        System.out.println("���µ�ͬѧί�о�ְ����ķ�����!");   
        this.getEventHandler().addEvent(object, methodName, args);   
    }   
  
    @Override  
    public void notifyX() {   
        System.out.println("��ְ����ķ����˸���������Ҫ��æ��ͬѧ����ʦ����");   
        try{   
            this.getEventHandler().notifyX();   
        }catch(Exception e){   
            e.printStackTrace();   
        }   
    }   
  
}   
