package Singleton;
/**
 * ����ģʽ����
 * */
public class SingletonTest {
     public static void main(String[] args) {
		Singleton singleton1=Singleton.GetInstance();
		Singleton singleton2=Singleton.GetInstance();
		System.out.println("-----����ʽ����-----");
		if(singleton1==singleton2){
			System.out.println("������ͬһ������");
		}else {
			System.out.println("���߲���ͬһ������");
		}
		
		Singleton1 s1 =Singleton1.GetIntance();
		Singleton1 s2 =Singleton1.GetIntance();
		System.out.println("-----����ʽ����-----");
		if(s1==s2){
			System.out.println("������ͬһ������");
		}else {
			System.out.println("���߲���ͬһ������");
		}
	}
}
