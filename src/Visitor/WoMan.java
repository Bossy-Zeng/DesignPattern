package Visitor;

/**
 * Created by ������ on 2017/3/30.
 * Ů����
 */
public class WoMan extends Person{
    @Override
    public void Accept(Action visitor) {
        visitor.GetWomanConclusion(this);
    }
}
