package Adapter;
/**
 * 适配器模式测试
 * 适配器模式：将一个类的接口转换成客户希望的另外一个接口
 * */
public class AdapterTest {
	//全局唯一一个翻译
	private static Translator translator;
      public static void main(String[] args) {
		Player fowPlayer=new Fowards("Kobel");
		fowPlayer.Attack();
		fowPlayer.Defense();
		
	    ForeignPlayer ffpForeignPlayer=new ForeignCenter("姚明");
	    //翻译向姚明传达命令
        translator=new Translator(ffpForeignPlayer);
        translator.Attack();
        translator.Defense();
        
        ForeignPlayer ffwForeignPlayer=new ForeignFowords("林书豪");
        //翻译向林书豪传达命令
        translator=new Translator(ffwForeignPlayer);
        translator.Attack();
        translator.Defense();
	}
}
