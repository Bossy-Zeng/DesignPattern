package Flyweight;
/**
 * ��Ԫģʽ����
 * */
public class FlyweightTest {

	public static void main(String[] args) {
		WebSiteFactory factory=new WebSiteFactory();
		
		//ʵ������Ʒչʾ����վ����
		WebSite fx=factory.GetWebSiteCategory("��Ʒչʾ");
		fx.Use(new User("���"));
		//�����������ɵĶ��󣬲��ٽ���ʵ����
		WebSite fy=factory.GetWebSiteCategory("��Ʒչʾ");
		fy.Use(new User("Bossy"));
		
		WebSite fz=factory.GetWebSiteCategory("����");
		fz.Use(new User("Legend"));
		WebSite fm=factory.GetWebSiteCategory("����");
		fm.Use(new User("Jack"));
		
		System.out.println("��վ����������"+factory.GetWebSiteCount());
		
	}
}
