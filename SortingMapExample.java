package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingMapExample {
	public static void main(String[] args) {
		System.out.println("executing..");
		Map<String, Integer> map = new LinkedHashMap<String,Integer>();
		String childs="pack#1@crate#48@halfdozen#6@pallete#64@bottle#1@";
		String s1[] = childs.split("@");
		for(String s:s1) {
			String ss[] = s.split("#");
			map.put(ss[0], Integer.parseInt(ss[1]));
		}
		
		 
		List<Map.Entry<String, Integer>> items = new ArrayList<Map.Entry<String, Integer>>();
		items.addAll(map.entrySet());
		Collections.sort(items,new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		map.clear();
		for(Map.Entry<String, Integer> mm:items) {
			map.put(mm.getKey(), mm.getValue());
		}
	
		for(Map.Entry<String, Integer> mm:map.entrySet()) {
			System.out.println(mm.getKey() +"@"+mm.getValue());
		}

	}
}
