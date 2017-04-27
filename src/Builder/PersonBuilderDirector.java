package Builder;
/**
 * 建造者模式里面的很重要的一个类
 * 指挥者
 * 用于控制建造过程
 * 也用它来隔离用户与建造者之间的关系
 * */
public class PersonBuilderDirector {
     private PersonBuilder personBuilder;
     
     public PersonBuilderDirector(PersonBuilder pBuilder) {
		// TODO Auto-generated constructor stub
    	 this.personBuilder=pBuilder;
	}
     
     public void CreatePerson() {
    	 System.out.println("姓名是"+personBuilder.name+"\n");
    	personBuilder.BuildHead();
		personBuilder.BuildBody();
		personBuilder.BuildArmLeft();
		personBuilder.BuildArmRight();
		personBuilder.BuildLegLeft();
		personBuilder.BuildLegRight();
	}
}
