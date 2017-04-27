package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ������ on 2017/3/30.
 * ����ṹ�࣬����������Ҫ�����ˡ��͡�Ů�ˡ��ڲ�ͬ״̬�ĶԱȣ�
 * ����������Ҫһ��������ṹ��������Բ�ͬ�ġ�״̬�����������ˡ�
 * �͡�Ů�ˡ����õ���ͬ�ķ�Ӧ
 */
public class ObjectStructure {
    private List<Person> elements = new ArrayList<>();

    //����
    public void Attach(Person element) {
        elements.add(element);
    }

    //�Ƴ�
    public void Detach(Person element) {
        elements.remove(element);
    }

    //�鿴��ʾ
    public void Display(Action visitor) {
        for (Person e : elements) {
            e.Accept(visitor);
        }
        System.out.println("\n");
    }

}
