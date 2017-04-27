package Bridge;

public  class Abstraction {
   private Implementor implementor;
   
   public void setImplementor(Implementor implementor) {
	this.implementor = implementor;
   }
   
   public void Operation(){
	   implementor.Operation();
   }
}
