package Factory;

/**
 * ����ģʽ��������ڴ�������Ľӿ�
 * @author Bossy_Zeng
 *
 */
public interface IFactory {
	
   /**
    * ����ʵ���ķ���
    * @return ���������������
    */
   Operation CreateOperation();
}
