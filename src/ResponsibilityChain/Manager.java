package ResponsibilityChain;


/**
 * ��������
 * */
public abstract class Manager {
	//�����ߵ��ϼ�
	protected Manager superior;
 
   protected String nameString;
   
   public Manager(String name) {
	// TODO Auto-generated constructor stub
	   this.nameString=name;
   }
   
   //���ù����ߵ��ϼ�
   public void setSuperior(Manager manager) {
	this.superior=manager;
   }
   
   //��������
   
   public abstract void RequestApplications(Request request);
   
}
