package Proxy;
/**
 * �Դ���ģʽ���в���
 * */
public class ProxyTest {
   public static void main(String[] args) {
	SchoolGirl schoolGirl=new SchoolGirl();
	schoolGirl.setName("Ľ������");
	
	Proxy proxy=new Proxy(schoolGirl);
	
	proxy.GiveChocolates();
	proxy.GiveDolls();
	proxy.GiveFlowers();
}
}
