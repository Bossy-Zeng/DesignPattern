package Composite;
/**
 * 人力资源部 树叶节点
 * */
public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		String string="";
		for(int i=0;i<depth;i++){
			string+="-";
		}
		System.out.println(string+nameString);
	}

	@Override
	public void LineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(nameString+" 员工招聘培训管理");
	}

}
