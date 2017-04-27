package Memento;

/**
 * 表示游戏角色类
 * @author 曾博晖
 *
 */
public class GameRole {
    //生命力
	private int vit;
	//攻击力
	private int atk;
	//防御力
	private int def;
	
	//角色名
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
	//状态显示
	public void StateDisplay() {
		System.out.println(name+"当前状态：");
		System.out.println("生命力"+vit);
		System.out.println("攻击力"+atk);
		System.out.println("防御力"+def);
	}
	
	//获得初始状态
	public void GetInitState() {
		setVit(100);
		setAtk(100);
		setDef(1000);
	}
	//战斗
	public void Fight() {
		setVit(0);
		setAtk(0);
		setDef(10);
	}
	//保存角色状态
	public RoleStateMemento SaveState() {
		return new RoleStateMemento(vit, atk, def);
	}
	
	//恢复角色状态
	public void RecoveryState(RoleStateMemento rMemento) {
		setVit(rMemento.getVit());
		setAtk(rMemento.getAtk());
		setDef(rMemento.getDef());
	}
	
	
}
