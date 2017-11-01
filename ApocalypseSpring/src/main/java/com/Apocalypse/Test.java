package com.Apocalypse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {

	@org.junit.Test
	public void test() {
		 System.out.println("==============List<Object>寫法");
		 	Map<String, List<Object>> mapl=new HashMap<>();
	        List<Object> list = new ArrayList<Object>();
	        list.add("內容一");
	        list.add("內容二");
	        list.add("內容三");
	        for (Iterator<Object> iterator = list.iterator(); iterator.hasNext();) {
	            Object string = iterator.next();
	            System.out.println(string);
	        }
	        System.out.println("===============Map<String, List<Object>>寫法");
	        mapl.put("書名", list);
	        Map<String, List<Object>> map3=new HashMap<>();
	        map3.put("書名", list);
	        System.out.println(mapl);
	        
	        System.out.println("============List<Map<String, List<Object>>>寫法");
	        List<Map<String, List<Object>>> res=new ArrayList<>();
	        res.add(mapl);
	        res.add(map3);
	        System.out.println(res);
	      
	        System.out.println("============== Map<String, String>寫法");
	        Map<String, String> map0 = new HashMap<String, String>();
	        map0.put("name", "書名");
	        map0.put("book", "章節");
	        String nameString = map0.get("name");
	        String String = map0.get("book");
	        
	        System.out.println(nameString + "\n" + String);
	 
	       System.out.println("============ Map<String, Object>"); 
	        Map<String, Object> map = new HashMap<String, Object>();
	        map.put("書名", "ddd");
	        map.put("作者", 23);
	        System.out.println(map);
	        System.out.println("=========== Map<String, Object>");
	        Map<String, Object> map1 = new HashMap<String, Object>();
	        map1.put("name", "ccc");
	        map1.put("age", 43);
	        System.out.println(map1);
	        
	        System.out.println("==============List<Map<String, Object>>將Map<String, Object>新增至list，再用iterator取出集合");
	        List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
	        lists.add(map);
	        lists.add(map1);
	 
	        Iterator<Map<String, Object>> it = lists.iterator();
	        for ( ;it.hasNext();) {
	            Map<String, Object> map2 = it.next();
	            String name = (String) map2.get("name");
	            Object age = map2.get("age");
	            System.out.println("name=" + name + "，age=" + age);
	        }
	    }

}
