package Composite;
/**
 * ������Դ�� ��Ҷ�ڵ�
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
		System.out.println(nameString+" Ա����Ƹ��ѵ����");
	}

}