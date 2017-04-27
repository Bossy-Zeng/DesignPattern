package Iterator;
/**
 * 迭代器模式测试
 * 该模式用于需要对聚集进行多种方式的遍历的情况
 * 以售票员在公交车上面卖票为例
 * */
public class IteratorTest {
    public static void main(String[] args) {
		ConcreteAggregate a =new ConcreteAggregate();
		a.setItem(0, "大鸟");
		a.setItem(1, "小菜");
		a.setItem(2, "Bossy");
		a.setItem(3, "Legend");
		a.setItem(04, "Durk");
		
		Iterator iterator=new ConcreteIteratorDesc(a);
//		Object item=iterator.First();
	    while(!iterator.IsDone()){
	    	System.out.println(iterator.CurrentItem()+" 请买车票");
	    	iterator.Next();
	    }
	}
}
