package Visitor;

/**
 * Created by ������ on 2017/3/30.
 * ������
 */
public class Man extends Person {
    /**
     * �����ڿͻ������н�����״̬��Ϊ�������ݸ������ˡ������һ�η���
     * Ȼ�����ˡ��������Ϊ�����ġ�����״̬���еķ��������˷�Ӧ����ͬʱ
     * ���Լ���this����Ϊ�������ݽ�ȥ���������˵ڶ��εķ���
     * */
    @Override
    public void Accept(Action visitor) {
        visitor.GetManConclusion(this);
    }
}
