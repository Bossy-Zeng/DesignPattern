package Interpreter;
/**
 * 表达式类
 * */
public abstract class AbstractExpression {
	//解释器
    public void Interpret(PlayContext context){
    	if(context.getText().length()==0){
    		return;
    	}else {
			String playKey=context.getText().substring(0,1);
			context.setText(context.getText().substring(2));
			double playValue=Double.parseDouble(context.getText().substring(0, 
					context.getText().indexOf(" ")));
			context.setText(context.getText().substring(context.getText().indexOf(" ")+1));
			Excute(playKey, playValue);
		}
    }
    
    //执行
    public abstract void Excute(String key,double value);
}
