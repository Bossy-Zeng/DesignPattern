package Singleton;
/**
 * 懒汉式单例模式
 * 要在第一次引用时，才将自己实例化
 * 需要考虑多线程的安全问题
 * */
public class Singleton  {
   private static Singleton instance;
   //构造方法权限private，都死了外界利用new创建此类实例的可能
   private Singleton() {
	// TODO Auto-generated constructor stub
   }
   /**
    * 此方法是获得此类实例的唯一方法 初步加锁
//   public static synchronized Singleton GetInstance(){
//	   if(instance == null){
//		   instance=new Singleton();
//	   }
//	   return instance;
//   }
   */
   
   //双重加锁
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
