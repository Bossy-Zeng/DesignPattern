package ResponsibilityChain;
/**
 * 职责链模式测试
 * */
public class ResponsibilityChainTest {
  public static void main(String[] args) {
	CommonManager commonManager=new CommonManager("金立");
	Majordomo majordomo=new Majordomo("宗剑");
	GeneralManager generalManager=new GeneralManager("钟经理");
	
	//设置上级，完全可以根据需求来更改设置
	commonManager.setSuperior(majordomo);
	majordomo.setSuperior(generalManager);
	
	Request request=new Request();
	request.setRequestType("请假");
	request.setNumber(2);
	//客户端的申请都是经理发起的，但是有谁处理客户端并不知道
	commonManager.RequestApplications(request);
	
	request.setNumber(4);
	commonManager.RequestApplications(request);
	
	request.setRequestType("加薪");
	request.setNumber(2000);
	commonManager.RequestApplications(request);
  }
}
