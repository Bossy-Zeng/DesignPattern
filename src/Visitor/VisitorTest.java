package Visitor;

/**
 * Created by ������ on 2017/3/30.
 * ������ģʽ����
 * ��ģʽ��ʾһ��������ĳ����ṹ�и���Ԫ�صĲ�����
 * ����������ڲ��ı��Ԫ������װ����¶���������
 * ��Ԫ�ص��²���
 *
 * �����������ݽṹ����ȶ����������ڱ仯���㷨��ϵͳ��
 */
public class VisitorTest {
    public static void main(String[] agrs) {
        ObjectStructure o = new ObjectStructure();
        //�ڶ���ṹ�м���Ҫ�Աȵ����˺�Ů��
        o.Attach(new Man());
        o.Attach(new WoMan());

        //�ɹ�ʱ�ķ�Ӧ
        Action a1 = new Success();
        o.Display(a1);

        //����ʱ�ķ�Ӧ
        Action a2 = new Amativeness();
        o.Display(a2);

        //���ʱ�ķ�Ӧ,�����һ������࣬������Ҫ�����������룬���������˿���-���ԭ��
        Action a3=new Marriage();
        o.Display(a3);

    }
}
