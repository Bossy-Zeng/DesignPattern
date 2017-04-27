package Singleton;
/**
 * 单例模式测试
 * */
public class SingletonTest {
     public static void main(String[] args) {
		Singleton singleton1=Singleton.GetInstance();
		Singleton singleton2=Singleton.GetInstance();
		System.out.println("-----懒汉式单例-----");
		if(singleton1==singleton2){
			System.out.println("两者是同一个对象");
		}else {
			System.out.println("两者不是同一个对象");
		}
		
		Singleton1 s1 =Singleton1.GetIntance();
		Singleton1 s2 =Singleton1.GetIntance();
		System.out.println("-----饿汉式单例-----");
		if(s1==s2){
			System.out.println("两者是同一个对象");
		}else {
			System.out.println("两者不是同一个对象");
		}
	}
}
