package Iterator;

/**
 * 具体迭代器类
 */
public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;//定义了一个具体聚集对象
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate cAggregate) {
        // TODO Auto-generated constructor stub
        this.aggregate = cAggregate;
    }

    @Override
    public Object First() {
        // TODO Auto-generated method stub
        return aggregate.getItem(0);
    }

    @Override
    public Object Next() {
        // TODO Auto-generated method stub
        Object retObject = null;
        current++;
        if (current < aggregate.getLenth()) {
            retObject = aggregate.getItem(current);
        }
        return retObject;
    }

    @Override
    public boolean IsDone() {
        // TODO Auto-generated method stub
        return current >= aggregate.getLenth();
    }

    @Override
    public Object CurrentItem() {
        // TODO Auto-generated method stub
        return aggregate.getItem(current);
    }

}
