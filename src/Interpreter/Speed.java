package Interpreter;


/**
 * ��ʾ�����ٶ�
 * */
public class Speed extends AbstractExpression{

	@Override
	public void Excute(String key, double value) {
		// TODO Auto-generated method stub
		String speed;
		if(value<500){
			speed="����";
		}else if (value>=1000) {
			speed="����";
		}else {
			speed="����";
		}
		System.out.println(speed);
	}

}
