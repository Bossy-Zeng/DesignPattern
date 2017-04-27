package 事件委托;
import java.lang.reflect.Method;   
  
/**
 * 利用java实现事件分发
 * 可以与观察者模式结合
 * */  
public class Event {   
    //要执行方法的对象   
    private Object object;   
    //要执行的方法名称   
    private String methodName;   
    //要执行方法的参数   
    private Object[] params;   
    //要执行方法的参数类型   
    @SuppressWarnings("rawtypes")
	private Class[] paramTypes;   
       
    public Event(){   
           
    }   
    public Event(Object object,String methodName,Object...args){   
        this.object=object;   
        this.methodName=methodName;   
        this.params=args;   
        contractParamTypes(this.params);   
    }   
    //根据参数数组生成参数类型数组   
    private void contractParamTypes(Object[] params){   
        this.paramTypes=new Class[params.length];   
        for(int i=0;i<params.length;i++){   
            this.paramTypes[i]=params[i].getClass();   
        }   
    }   
       
    public Object getObject() {   
        return object;   
    }   
                     //若干setter getter省略   
    public void setParamTypes(@SuppressWarnings("rawtypes") Class[] paramTypes) {   
        this.paramTypes = paramTypes;   
    }   
    public String getMethodName() {
		return methodName;
	}
    public Object[] getParams() {
		return params;
	}
    @SuppressWarnings("rawtypes")
	public Class[] getParamTypes() {
		return paramTypes;
	}
    //执行该对象的该方法   
    public void invoke() throws Exception{   
        Method method=object.getClass().getMethod(this.getMethodName(), this.getParamTypes());   
        if(null==method){   
            return;   
        }   
        method.invoke(this.getObject(), this.getParams());   
    }   
}  