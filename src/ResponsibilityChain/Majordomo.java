package ResponsibilityChain;

import Temp.OutClass;

/**
 * �ܼ�
 * */
public class Majordomo extends Manager{

	public Majordomo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestApplications(Request request) {
		OutClass.Print("\n");
		// TODO Auto-generated method stub
		if(request.getRequestType()=="���"&&request.getNumber()<=5){
			OutClass.Print("���"+request.getNumber()+"������");
		}else {
			if(superior!=null){
				superior.RequestApplications(request);
			}
		}
	}

}
