package ResponsibilityChain;
/**
 * ְ����ģʽ����
 * */
public class ResponsibilityChainTest {
  public static void main(String[] args) {
	CommonManager commonManager=new CommonManager("����");
	Majordomo majordomo=new Majordomo("�ڽ�");
	GeneralManager generalManager=new GeneralManager("�Ӿ���");
	
	//�����ϼ�����ȫ���Ը�����������������
	commonManager.setSuperior(majordomo);
	majordomo.setSuperior(generalManager);
	
	Request request=new Request();
	request.setRequestType("���");
	request.setNumber(2);
	//�ͻ��˵����붼�Ǿ�����ģ�������˭����ͻ��˲���֪��
	commonManager.RequestApplications(request);
	
	request.setNumber(4);
	commonManager.RequestApplications(request);
	
	request.setRequestType("��н");
	request.setNumber(2000);
	commonManager.RequestApplications(request);
  }
}
