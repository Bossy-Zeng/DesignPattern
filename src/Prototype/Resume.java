package Prototype;

/**
 * 实现Cloneable接口
 * 简历类，实现了深复制
 * @author Bossy_Zeng
 *
 */
public class Resume implements Cloneable {
   private String name;
   private String sex;
   private String age;
   private WorkExperience work;
   
   public Resume(String mName) {
	// TODO Auto-generated constructor stub
	   this.name=mName;
   }
   
   //实现深复制
   public Resume(WorkExperience workExperience) throws CloneNotSupportedException {
	// TODO Auto-generated constructor stub
	   this.work=(WorkExperience)workExperience.clone();
   }
   public void setPetsonalInfo(String mSex,String mAge ){
	   this.sex=mSex;
	   this.age=mAge;
   }
   public void setWorkExperience(String mTimaArea,String mCompany) {
	
      work=new WorkExperience(mTimaArea, mCompany);
   }
   //显示
   public void Display(){
	   System.out.println(name+" "+sex+" "+age);
	   System.out.println("工作经历 "+work.getTimeArea()+
			   " "+work.getCompany());
   }
   
   @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	   Resume obj=new Resume(this.work);
	   obj.name=this.name;
	   obj.sex=this.sex;
	   obj.age=this.age;
		return obj;
	}
}
