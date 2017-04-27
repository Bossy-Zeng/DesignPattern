package Singleton;
/**
 * 饿汉式单例
 * 在自己加载时就已经将自己实例化 不需要考虑多线程访问的安全问题
 * */
public class Singleton1 {
   private static final Singleton1 instance=new Singleton1();
   
   private Singleton1() {
	// TODO Auto-generated constructor stub
  }
   public static Singleton1 GetIntance() {
	 return instance;
   }
}
