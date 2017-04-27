package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂类
 * */
public class WebSiteFactory {
    private Map<String,WebSite> websites=new HashMap<>();
    
    //获得网站分类
    public WebSite GetWebSiteCategory(String key){
    	//判断是否存在这个对象，若是存在，直接返回，若不存在，则实例化它之后再返回
    	if(!websites.containsKey(key)){
    		websites.put(key, new ConcreteWebSite(key));
    	}
    	return (WebSite)websites.get(key);
    }
    
    //获得网站分类总数
    public int GetWebSiteCount(){
    	return websites.size();
    }
}
