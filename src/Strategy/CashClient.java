package Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 模拟客户端对代码进行测试
 * @author 曽博晖
 *
 */
public class CashClient {
	
	public static void main(String[]args)
	{
		double price=0.0;
		int count=0;
		String CashType="";
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入单价:");
		try {
			price=Double.parseDouble(strin.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
//		System.out.println(price);
		System.out.println("请输入数量:");
		try {
			count=Integer.parseInt(strin.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
//		System.out.println(count);
		System.out.println("请输入计算方式（正常收费、打八折、满三百返一百）:");
		try {
			CashType=strin.readLine();
		} catch (NumberFormatException | IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		CashContext cashContext=new CashContext(CashType);
		double totalPrice=cashContext.GetResult(price*count);
		System.out.println("单价："+price+" 数量："+count+" 计算方式："+CashType
				+" 合计："+totalPrice);
	}

}
