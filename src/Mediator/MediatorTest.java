package Mediator;
/**
 * 中介者模式测试
 * */
public class MediatorTest {
      public static void main(String[] args) {
		ConcreteMediator mediator=new ConcreteMediator();
		//让两个具体同事类认识中介者对象
		ConcreteColleage1 colleage1=new ConcreteColleage1(mediator);
		ConcreteColleage2 colleage2=new ConcreteColleage2(mediator);
		
		//让中介者对象认识各个具体同事对象
		mediator.setConcreteColleage1(colleage1);
		mediator.setConcreteColleage2(colleage2);
		
		//具体同事对象发送信息都是通过中介者对象
		colleage1.Send("Bug改的怎么样了？");
		colleage2.Send("还在改，怕是今晚要加班喽~");
	}
}
