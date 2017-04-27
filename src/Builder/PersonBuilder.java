package Builder;
/**
 * 建造者模式学习
 * 创建一个人所需要的方法
 * */
public abstract class PersonBuilder {
      protected String name;
      protected String id;
      
      public PersonBuilder(String mName,String mId) {
		// TODO Auto-generated constructor stub
    	  this.name=mName;
    	  this.id=mId;
	}
      public abstract void BuildHead();      public abstract void BuildBody();
      public abstract void BuildArmLeft();
      public abstract void BuildArmRight();
      public abstract void BuildLegLeft();
      public abstract void BuildLegRight();
}
