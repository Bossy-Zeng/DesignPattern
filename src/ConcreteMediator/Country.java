package ConcreteMediator;
/**
 * ������
 * */
public abstract class Country {
    protected UnitedNations mediator;
    
    public Country(UnitedNations nations) {
		// TODO Auto-generated constructor stub
    	this.mediator=nations;
	}
}
