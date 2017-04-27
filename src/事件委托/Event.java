package �¼�ί��;
import java.lang.reflect.Method;   
  
/**
 * ����javaʵ���¼��ַ�
 * ������۲���ģʽ���
 * */  
public class Event {   
    //Ҫִ�з����Ķ���   
    private Object object;   
    //Ҫִ�еķ�������   
    private String methodName;   
    //Ҫִ�з����Ĳ���   
    private Object[] params;   
    //Ҫִ�з����Ĳ�������   
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
    //���ݲ����������ɲ�����������   
    private void contractParamTypes(Object[] params){   
        this.paramTypes=new Class[params.length];   
        for(int i=0;i<params.length;i++){   
            this.paramTypes[i]=params[i].getClass();   
        }   
    }   
       
    public Object getObject() {   
        return object;   
    }   
                     //����setter getterʡ��   
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
    //ִ�иö���ĸ÷���   
    public void invoke() throws Exception{   
        Method method=object.getClass().getMethod(this.getMethodName(), this.getParamTypes());   
        if(null==method){   
            return;   
        }   
        method.invoke(this.getObject(), this.getParams());   
    }   
}  