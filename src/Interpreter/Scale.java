package Interpreter;
/**
 * “ÙΩ◊¿‡
 * */
public class Scale extends AbstractExpression{

	@Override
	public void Excute(String key, double value) {
		// TODO Auto-generated method stub
		String scale="";
		switch ((new Double(value)).intValue()) {
			case 1 :
				scale="µÕ“Ù";
				break;
			case 2 :
				scale="÷–“Ù";
				break;
		    case 3 :
		    	scale="∏ﬂ“Ù";
		    	break;
			default :
				break;
		}
		System.out.println(scale);
	}

}
