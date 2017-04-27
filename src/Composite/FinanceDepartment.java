package Composite;
/**
 * 财务部
 * 树叶节点
 * */
public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
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
		System.out.println(nameString+" 公司财务收支管理");
	}

}
