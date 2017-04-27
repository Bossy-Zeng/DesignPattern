package ResponsibilityChain;

import Temp.OutClass;

/**
 * ×Ü¼à
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
		if(request.getRequestType()=="Çë¼Ù"&&request.getNumber()<=5){
			OutClass.Print("Çë¼Ù"+request.getNumber()+"±»ÔÊÐí");
		}else {
			if(superior!=null){
				superior.RequestApplications(request);
			}
		}
	}

}
