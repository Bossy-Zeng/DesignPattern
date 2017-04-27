package Mediator;
/**
 * 抽象同事类
 * */
public abstract class Colleage {
      protected Mediator mediator;
      
      public Colleage(Mediator mediator) {
		// TODO Auto-generated constructor stub
	        this.mediator=mediator;//构造方法，得到中介者对象
      }
}
