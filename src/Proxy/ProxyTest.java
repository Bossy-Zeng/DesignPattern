package Proxy;
/**
 * 对代理模式进行测试
 * */
public class ProxyTest {
   public static void main(String[] args) {
	SchoolGirl schoolGirl=new SchoolGirl();
	schoolGirl.setName("慕容晓晓");
	
	Proxy proxy=new Proxy(schoolGirl);
	
	proxy.GiveChocolates();
	proxy.GiveDolls();
	proxy.GiveFlowers();
}
}
