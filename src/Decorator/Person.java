package Decorator;

/**
 * 
 * ��ʾ����ģʽ֮�е�ConcreteComPonent��
 * ��Ϊֻ��һ��ConcreteComPonent�࣬��û�г����Component�࣬
 * ��ôDecorator�������ConcreteComPonent��һ������
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
	System.out.println("װ���"+name);
}
  
  
}
