package Prototype;
/**
 * 工作经历类实现Cloneable接口
 * */
public class WorkExperience implements Cloneable {
      private String timeArea;
      private String company;
      
      public WorkExperience(String mTimeArea,String mCompany) {
		// TODO Auto-generated constructor stub
    	  setTimeArea(mTimeArea);
    	  setCompany(mCompany);
	}
      public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
      public String getTimeArea() {
		return timeArea;
	}
      public void setCompany(String company) {
		this.company = company;
	}
      public String getCompany() {
		return company;
	}
      @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return super.clone();
    }
}
