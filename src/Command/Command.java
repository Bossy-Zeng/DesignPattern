package Command;
/**
 * ����������
 * */
public abstract class Command {
    protected Barbecuer barbecuer;
    
    /**
     * ���������࣬����ȷ���������տ��ĳ�ʦ��˭��
     * */
    public Command(Barbecuer receiver) {
		// TODO Auto-generated constructor stub
    	this.barbecuer=receiver;
	}
    //ִ������
    public abstract void ExcuteCommand();
}
