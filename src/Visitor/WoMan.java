package Visitor;

/**
 * Created by Ôø²©êÍ on 2017/3/30.
 * Å®ÈËÀà
 */
public class WoMan extends Person{
    @Override
    public void Accept(Action visitor) {
        visitor.GetWomanConclusion(this);
    }
}
