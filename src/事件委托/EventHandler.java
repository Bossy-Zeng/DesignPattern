package �¼�ί��;
import java.util.ArrayList;   
import java.util.List;   
  
public class EventHandler {   
    //����һ��List   
    private List<Event> objects;   
       
    public EventHandler(){   
        objects=new ArrayList<Event>();   
    }   
    //���ĳ������Ҫִ�е��¼�������Ҫ�Ĳ���   
    public void addEvent(Object object,String methodName,Object...args){   
        objects.add(new Event(object,methodName,args));   
    }   
    //֪ͨ���еĶ���ִ��ָ�����¼�   
    public void notifyX() throws Exception{   
        for(Event e : objects){   
            e.invoke();   
        }   
    }   
}  