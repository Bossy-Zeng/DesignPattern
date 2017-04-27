package Composite;
/**
 * 组合模式测试
 * 以公司、分公司分部门为例
 * 组合模式让用户可以一致的使用组合结构和单个对象
 * @author 曾博晖
 * */
public class CompositeTest {
   public static void main(String[] args) {
  	ConcreteCompany root=new ConcreteCompany("北京总公司");
  	root.Add(new HRDepartment("北京总公司人力资源部"));
  	root.Add(new FinanceDepartment("北京总公司财务资源部"));
  	
  	Company company=new ConcreteCompany("上海华东分公司");
  	company.Add(new HRDepartment("华东分公司人力资源部"));
  	company.Add(new FinanceDepartment("华东分公司财务部"));
  	root.Add(company);
  	
  	ConcreteCompany concreteCompany=new ConcreteCompany("南京办事处");
  	concreteCompany.Add(new HRDepartment("南京办事处人力资源部"));
  	concreteCompany.Add(new FinanceDepartment("南京办事处财务部"));
  	company.Add(concreteCompany);
  	
  	ConcreteCompany cCompany=new ConcreteCompany("杭州办事处");
  	cCompany.Add(new HRDepartment("杭州办事处人力资源部"));
  	cCompany.Add(new FinanceDepartment("杭州办事处财务部"));
  	company.Add(cCompany);
  	
  	System.out.println("\n结构图：");
  	root.Display(1);
  	System.out.println("\n职责：");
  	root.LineOfDuty();
  }
}
