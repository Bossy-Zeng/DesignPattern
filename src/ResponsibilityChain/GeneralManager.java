package ResponsibilityChain;

import Temp.OutClass;

/**
 * 总经理
 * */
public class GeneralManager extends Manager{

	@Override
	public void RequestApplications(Request request) {
		OutClass.Print("\n");
		// TODO Auto-generated method stub
		if(request.getRequestType()=="请假"){
			OutClass.Print("请假"+request.getNumber()+"被允许");
		 }else if (request.getRequestType()=="加薪"&&request.getNumber()<=500) {
			OutClass.Print("加薪"+request.getNumber()+"被允许");
		 }else if (request.getRequestType()=="加薪"&&request.getNumber()>500) {
			OutClass.Print("加薪"+request.getNumber()+"被婉拒");
		 }
		}
		
	
    public GeneralManager(String name) {
		// TODO Auto-generated constructor stub
    	super(name);
	}
}
