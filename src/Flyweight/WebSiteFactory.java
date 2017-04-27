package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��վ������
 * */
public class WebSiteFactory {
    private Map<String,WebSite> websites=new HashMap<>();
    
    //�����վ����
    public WebSite GetWebSiteCategory(String key){
    	//�ж��Ƿ��������������Ǵ��ڣ�ֱ�ӷ��أ��������ڣ���ʵ������֮���ٷ���
    	if(!websites.containsKey(key)){
    		websites.put(key, new ConcreteWebSite(key));
    	}
    	return (WebSite)websites.get(key);
    }
    
    //�����վ��������
    public int GetWebSiteCount(){
    	return websites.size();
    }
}
