package ResponsibilityChain;

import Temp.OutClass;

/**
 * �ܾ���
 * */
public class GeneralManager extends Manager{

	@Override
	public void RequestApplications(Request request) {
		OutClass.Print("\n");
		// TODO Auto-generated method stub
		if(request.getRequestType()=="���"){
			OutClass.Print("���"+request.getNumber()+"������");
		 }else if (request.getRequestType()=="��н"&&request.getNumber()<=500) {
			OutClass.Print("��н"+request.getNumber()+"������");
		 }else if (request.getRequestType()=="��н"&&request.getNumber()>500) {
			OutClass.Print("��н"+request.getNumber()+"�����");
		 }
		}
		
	
    public GeneralManager(String name) {
		// TODO Auto-generated constructor stub
    	super(name);
	}
}
