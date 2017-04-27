package Composite;
import java.util.ArrayList;

/**
 * 具体公司类，实现接口，树枝节点
 * @author 曾博晖
 * */
public class ConcreteCompany extends Company {
	private ArrayList<Company> children=new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		String string="";
		for(int i=0;i<depth;i++){
			string+="-";
		}
		System.out.println(string+nameString+string);
		
		for (Company company : children) {
			company.Display(depth+2);
		}
		
	}

	@Override
	public void LineOfDuty() {
		// TODO Auto-generated method stub
		for (Company company : children) {
			company.LineOfDuty();
		}
	}
    
}
