package ResponsibilityChain;

import Temp.OutClass;
/**
 * 经理
 * */
public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestApplications(Request request) {
		OutClass.Print("\n");
		// TODO Auto-generated method stub
		if(request.getRequestType()=="请假"&&request.getNumber()<=2){
			OutClass.Print("请假"+request.getNumber()+"被允许");
		}else {
			if(superior!=null){
				superior.RequestApplications(request);
			}
		}
	}

}
