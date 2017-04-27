package Decorator;

/**
 * 
 * 	对装饰模式进行测试
 * @author Bossy_Zeng
 *
 */
public class DecoratorTest {
	public static void main(String[] args) {
	  Person person=new Person("Bossy");
	  
	  
	  System.out.println("第一种装扮：");
	  
	  Jacket jacket=new Jacket();
	  BigTrouser bigTrouser=new BigTrouser();
	  Skirt skirt=new Skirt();
	  
	  jacket.Decorate(person);
	  bigTrouser.Decorate(jacket);
	  skirt.Decorate(bigTrouser); 
	  skirt.show();
	  
	  System.out.println("\n第二种装扮：");
	  
	  TShirts tShirts=new TShirts();
	  BigTrouser bigTrouser2=new BigTrouser();
	  Tie tie=new Tie();
	  
	  tShirts.Decorate(person);
	  bigTrouser2.Decorate(tShirts);
	  tie.Decorate(bigTrouser2);
	  tie.show();
  }
}
