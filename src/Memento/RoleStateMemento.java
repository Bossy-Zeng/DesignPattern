package Memento;
/**
 * ��ɫ״̬�洢��
 * ��ʾ��Ҫ�����״̬
 * ������洢���ǹ�������������������
 * */
public class RoleStateMemento {
	 //������
		private int vit;
		//������
		private int atk;
		//������
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
