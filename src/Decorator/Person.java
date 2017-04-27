package Decorator;

/**
 * 
 * 表示策略模式之中的ConcreteComPonent类
 * 因为只有一个ConcreteComPonent类，而没有抽象的Component类，
 * 那么Decorator类可以是ConcreteComPonent的一个子类
 * @author Bossy_Zeng
 */
public  class Person extends Component {
  public Person() {
	// TODO Auto-generated constructor stub
}
  private String name;
  public Person(String name){
	  this.name=name;
  }
  @Override
 public void show() {
	// TODO Auto-generated method stub
	System.out.println("装扮的"+name);
}
  
  
}
