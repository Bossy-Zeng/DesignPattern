package Singleton;
/**
 * ����ʽ����
 * ���Լ�����ʱ���Ѿ����Լ�ʵ���� ����Ҫ���Ƕ��̷߳��ʵİ�ȫ����
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
