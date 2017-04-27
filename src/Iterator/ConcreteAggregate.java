package Iterator;

import java.util.ArrayList;

/**
 * 具体聚集类
 */
public class ConcreteAggregate extends Aggregate {

    private ArrayList<Object> items = new ArrayList<Object>();

    @Override
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return new ConcreteIterator(this);
    }

    //返回聚集总个数
    public int getLenth() {
        return items.size();
    }

    public Object getItem(int index) {
        return items.get(index);
    }

    public void setItem(int index, Object value) {
        items.add(index, value);
    }
}
