package Composite;
/**
 * ���ģʽ����
 * �Թ�˾���ֹ�˾�ֲ���Ϊ��
 * ���ģʽ���û�����һ�µ�ʹ����Ͻṹ�͵�������
 * @author ������
 * */
public class CompositeTest {
   public static void main(String[] args) {
  	ConcreteCompany root=new ConcreteCompany("�����ܹ�˾");
  	root.Add(new HRDepartment("�����ܹ�˾������Դ��"));
  	root.Add(new FinanceDepartment("�����ܹ�˾������Դ��"));
  	
  	Company company=new ConcreteCompany("�Ϻ������ֹ�˾");
  	company.Add(new HRDepartment("�����ֹ�˾������Դ��"));
  	company.Add(new FinanceDepartment("�����ֹ�˾����"));
  	root.Add(company);
  	
  	ConcreteCompany concreteCompany=new ConcreteCompany("�Ͼ����´�");
  	concreteCompany.Add(new HRDepartment("�Ͼ����´�������Դ��"));
  	concreteCompany.Add(new FinanceDepartment("�Ͼ����´�����"));
  	company.Add(concreteCompany);
  	
  	ConcreteCompany cCompany=new ConcreteCompany("���ݰ��´�");
  	cCompany.Add(new HRDepartment("���ݰ��´�������Դ��"));
  	cCompany.Add(new FinanceDepartment("���ݰ��´�����"));
  	company.Add(cCompany);
  	
  	System.out.println("\n�ṹͼ��");
  	root.Display(1);
  	System.out.println("\nְ��");
  	root.LineOfDuty();
  }
}
