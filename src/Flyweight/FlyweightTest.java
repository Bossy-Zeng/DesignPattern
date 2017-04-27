package Flyweight;
/**
 * 享元模式测试
 * */
public class FlyweightTest {

	public static void main(String[] args) {
		WebSiteFactory factory=new WebSiteFactory();
		
		//实例化产品展示的网站对象
		WebSite fx=factory.GetWebSiteCategory("产品展示");
		fx.Use(new User("大冰"));
		//共享上面生成的对象，不再进行实例化
		WebSite fy=factory.GetWebSiteCategory("产品展示");
		fy.Use(new User("Bossy"));
		
		WebSite fz=factory.GetWebSiteCategory("博客");
		fz.Use(new User("Legend"));
		WebSite fm=factory.GetWebSiteCategory("博客");
		fm.Use(new User("Jack"));
		
		System.out.println("网站分类总数："+factory.GetWebSiteCount());
		
	}
}
