package Iterator;

/**
 * 后向遍历迭代器
 */
public class ConcreteIteratorDesc extends Iterator {
    private ConcreteAggregate aggregate;//定义了一个具体聚集对象
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate cAggregate) {
        // TODO Auto-generated constructor stub
        this.aggregate = cAggregate;
        current = cAggregate.getLenth() - 1;
    }

    @Override
    public Object First() {
        // TODO Auto-generated method stub
        return aggregate.getItem(aggregate.getLenth() - 1);
    }

    @Override
    public Object Next() {
        // TODO Auto-generated method stub
        Object retObject = null;
        current--;
        if (current >= 0) {
            retObject = aggregate.getItem(current);
        }
        return retObject;
    }

    @Override
    public boolean IsDone() {
        // TODO Auto-generated method stub
        return current < 0 ? true : false;
    }

    @Override
    public Object CurrentItem() {
        // TODO Auto-generated method stub
        return aggregate.getItem(current);
    }

}
