package Iterator;
/**
 * ������ģʽ����
 * ��ģʽ������Ҫ�Ծۼ����ж��ַ�ʽ�ı��������
 * ����ƱԱ�ڹ�����������ƱΪ��
 * */
public class IteratorTest {
    public static void main(String[] args) {
		ConcreteAggregate a =new ConcreteAggregate();
		a.setItem(0, "����");
		a.setItem(1, "С��");
		a.setItem(2, "Bossy");
		a.setItem(3, "Legend");
		a.setItem(04, "Durk");
		
		Iterator iterator=new ConcreteIteratorDesc(a);
//		Object item=iterator.First();
	    while(!iterator.IsDone()){
	    	System.out.println(iterator.CurrentItem()+" ����Ʊ");
	    	iterator.Next();
	    }
	}
}
