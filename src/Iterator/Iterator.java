package Iterator;
/**
 * 迭代器抽象类
 * @author 曾博晖
 * */
public abstract class Iterator {
     public abstract Object First();//得到开始对象
     public abstract Object Next();//得到下一个对象
     public abstract boolean IsDone();//判断是否到结尾
     public abstract Object CurrentItem();//得到当前对象
}
