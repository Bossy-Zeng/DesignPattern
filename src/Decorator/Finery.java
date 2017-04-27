package Decorator;


/**
 * ������(Decorator)
 * @author Bossy_Zeng
 */
public class Finery extends Person {
    protected Person component;
    //���
    public void Decorate(Person person){
    	this.component=person;
    }
    
	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(component!=null){
			component.show();
		}
	}

}
