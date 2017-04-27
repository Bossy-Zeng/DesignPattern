package Interpreter;


/**
 * 表示演奏速度
 * */
public class Speed extends AbstractExpression{

	@Override
	public void Excute(String key, double value) {
		// TODO Auto-generated method stub
		String speed;
		if(value<500){
			speed="快速";
		}else if (value>=1000) {
			speed="慢速";
		}else {
			speed="中速";
		}
		System.out.println(speed);
	}

}
