package ResponsibilityChain;

import Temp.OutClass;
/**
 * ����
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
		if(request.getRequestType()=="���"&&request.getNumber()<=2){
			OutClass.Print("���"+request.getNumber()+"������");
		}else {
			if(superior!=null){
				superior.RequestApplications(request);
			}
		}
	}

}
