package Command;
/**
 * 抽象命令类
 * */
public abstract class Command {
    protected Barbecuer barbecuer;
    
    /**
     * 抽象命令类，用于确定“负责烧烤的厨师是谁”
     * */
    public Command(Barbecuer receiver) {
		// TODO Auto-generated constructor stub
    	this.barbecuer=receiver;
	}
    //执行命令
    public abstract void ExcuteCommand();
}
