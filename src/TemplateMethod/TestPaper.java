package TemplateMethod;

/**
 * 模板方法测试
 * 试卷的父类，对试卷的一些方法进行集中封装
 * @author Bossy_Zeng
 *
 */
public abstract class TestPaper {
	
	//模板方法，给出逻辑的骨架，而逻辑的组成是相应的一些抽象操作，
	//他们都推迟到子类实现
      public void TestQuestion1() {
		// TODO Auto-generated method stub
           System.out.println("我是不是最帅的？a.是 b.必须是 c.以上都对 "+Answer1());
	}
      public void TestQuestion2() {
    	  System.out.println("你是不是很爱我？a.是 b.必须是 c.以上都对 "+Answer2());
	}
      public void TestQuestion3() {
    	  System.out.println("我是不是很喜欢设计模式？a.是 b.必须是 c.以上都对 "+Answer3());
	}
      //一些抽象行为，要放在子类中实现
      protected abstract String Answer1() ;
      protected abstract String Answer2() ;
      protected abstract String Answer3() ;
}
