package ConcreteMediator;
/**
 * 联合国安理会，在这里角色即为具体中介者类
 * */
public class UnitedNationsSecurityCounci1 extends UnitedNations {
	
	private USA colleage1;
	private Iraq colleage2;
	
	public void setColleage1(USA colleage1) {
		this.colleage1 = colleage1;
	}
	public void setColleage2(Iraq colleage2) {
		this.colleage2 = colleage2;
	}

	@Override
	public void Declare(String msg, Country colleage) {
		// TODO Auto-generated method stub
		if(colleage.equals(colleage1)){
			colleage2.getMessage(msg);
		}else {
			colleage1.getMessage(msg);
		}
	}

}
