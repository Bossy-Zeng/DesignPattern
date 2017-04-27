package ResponsibilityChain;


/**
 * 管理者类
 * */
public abstract class Manager {
	//管理者的上级
	protected Manager superior;
 
   protected String nameString;
   
   public Manager(String name) {
	// TODO Auto-generated constructor stub
	   this.nameString=name;
   }
   
   //设置管理者的上级
   public void setSuperior(Manager manager) {
	this.superior=manager;
   }
   
   //申请请求
   
   public abstract void RequestApplications(Request request);
   
}
