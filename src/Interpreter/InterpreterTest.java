package Interpreter;
/**
 * 解释器模式
 * 将歌词翻译出来
 * */
public class InterpreterTest {
  
  public static void main(String[] args) {
	  PlayContext context=new PlayContext();
	  System.out.println("上海滩：");
	  
	  context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O"
	  		+ " 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
	  AbstractExpression expression=null;
	  
	  try {
		while(context.getText().length()>0){
			String str=context.getText().substring(0,1);
			switch (str) {
				case "O" :
					expression=new Scale();//首字母是O时，则表达式实例化为音阶
					break;
				case "T":
					expression=new Speed();//首字母是T时，则表达式实例化为音速	
					break;
                case "C" :
                case "D" :
                case "E" :
                case "F" :
                case "G" :
                case "A" :
                case "B" :
                	expression=new Note();//当首字母是CDEFGAB时，则实例化为音符
                	break;
                	
			}
			expression.Interpret(context);
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
 }
  
}
