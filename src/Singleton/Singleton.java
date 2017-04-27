package Singleton;
/**
 * ����ʽ����ģʽ
 * Ҫ�ڵ�һ������ʱ���Ž��Լ�ʵ����
 * ��Ҫ���Ƕ��̵߳İ�ȫ����
 * */
public class Singleton  {
   private static Singleton instance;
   //���췽��Ȩ��private���������������new��������ʵ���Ŀ���
   private Singleton() {
	// TODO Auto-generated constructor stub
   }
   /**
    * �˷����ǻ�ô���ʵ����Ψһ���� ��������
//   public static synchronized Singleton GetInstance(){
//	   if(instance == null){
//		   instance=new Singleton();
//	   }
//	   return instance;
//   }
   */
   
   //˫�ؼ���
   public static  Singleton GetInstance(){
	   if(instance==null){
		   synchronized(Singleton.class){
			   if(instance==null){
			       instance=new Singleton();
			   }
		   }
	   }
	   return instance;
   }
}
