package Interpreter;
/**
 * ������
 * */
public class Scale extends AbstractExpression{

	@Override
	public void Excute(String key, double value) {
		// TODO Auto-generated method stub
		String scale="";
		switch ((new Double(value)).intValue()) {
			case 1 :
				scale="����";
				break;
			case 2 :
				scale="����";
				break;
		    case 3 :
		    	scale="����";
		    	break;
			default :
				break;
		}
		System.out.println(scale);
	}

}
