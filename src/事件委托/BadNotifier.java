package 事件委托;
/**
 * 马马虎虎的放哨人BadNotifier
 * */
public class BadNotifier extends Notifier {   
	  
    @Override  
    public void addListener(Object object, String methodName, Object... args) {   
        System.out.println("有新的同学委托不尽职的放哨人!");   
        this.getEventHandler().addEvent(object, methodName, args);   
    }   
  
    @Override  
    public void notifyX() {   
        System.out.println("不尽职的放哨人不紧不慢地告诉所有需要帮忙的同学：老师来了");   
        try{   
            this.getEventHandler().notifyX();   
        }catch(Exception e){   
            e.printStackTrace();   
        }   
    }   
  
}   