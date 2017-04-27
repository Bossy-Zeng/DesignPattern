package Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ģ��ͻ��˶Դ�����в���
 * @author ������
 *
 */
public class CashClient {
	
	public static void main(String[]args)
	{
		double price=0.0;
		int count=0;
		String CashType="";
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����뵥��:");
		try {
			price=Double.parseDouble(strin.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
//		System.out.println(price);
		System.out.println("����������:");
		try {
			count=Integer.parseInt(strin.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
//		System.out.println(count);
		System.out.println("��������㷽ʽ�������շѡ�����ۡ������ٷ�һ�٣�:");
		try {
			CashType=strin.readLine();
		} catch (NumberFormatException | IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		CashContext cashContext=new CashContext(CashType);
		double totalPrice=cashContext.GetResult(price*count);
		System.out.println("���ۣ�"+price+" ������"+count+" ���㷽ʽ��"+CashType
				+" �ϼƣ�"+totalPrice);
	}

}
