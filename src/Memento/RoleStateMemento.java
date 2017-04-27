package Memento;
/**
 * 角色状态存储箱
 * 表示需要保存的状态
 * 在这里存储的是攻击力防御力和生命力
 * */
public class RoleStateMemento {
	 //生命力
		private int vit;
		//攻击力
		private int atk;
		//防御力
		private int def;
		public RoleStateMemento(int vit,int atk,int def) {
			// TODO Auto-generated constructor stub
			this.vit=vit;
			this.atk=atk;
			this.def=def;
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
}
