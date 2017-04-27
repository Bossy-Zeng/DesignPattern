package Memento;

/**
 * ��ʾ��Ϸ��ɫ��
 * @author ������
 *
 */
public class GameRole {
    //������
	private int vit;
	//������
	private int atk;
	//������
	private int def;
	
	//��ɫ��
	private String name;
	
	public GameRole(String nameString) {
		// TODO Auto-generated constructor stub
		setName(nameString);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getAtk() {
		return atk;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	public int getDef() {
		return def;
	}
	
	public void setVit(int vit) {
		this.vit = vit;
	}
	public int getVit() {
		return vit;
	}
	//״̬��ʾ
	public void StateDisplay() {
		System.out.println(name+"��ǰ״̬��");
		System.out.println("������"+vit);
		System.out.println("������"+atk);
		System.out.println("������"+def);
	}
	
	//��ó�ʼ״̬
	public void GetInitState() {
		setVit(100);
		setAtk(100);
		setDef(1000);
	}
	//ս��
	public void Fight() {
		setVit(0);
		setAtk(0);
		setDef(10);
	}
	//�����ɫ״̬
	public RoleStateMemento SaveState() {
		return new RoleStateMemento(vit, atk, def);
	}
	
	//�ָ���ɫ״̬
	public void RecoveryState(RoleStateMemento rMemento) {
		setVit(rMemento.getVit());
		setAtk(rMemento.getAtk());
		setDef(rMemento.getDef());
	}
	
	
}
