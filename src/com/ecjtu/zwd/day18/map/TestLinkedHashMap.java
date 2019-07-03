package com.ecjtu.zwd.day18.map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		HashMap<Integer, Person> persons = new HashMap<>();
		persons.put(1, new Person("张三", 22));
		persons.put(2, new Person("李四", 21));
		persons.put(3, new Person("王五", 26));
		System.out.println(persons);
		// HashMap<Integer, Person>sortHashMap = sortHashMap(users);
		HashMap<Integer, Person> sortHashMap = sortHashMap(persons);
	    System.out.println(sortHashMap);
	}

	public static HashMap<Integer, Person> sortHashMap(HashMap<Integer, Person> users) {
		// HashMap<Integer, Person>map=new LinkedHashMap();
		Set<Entry<Integer, Person>> set = users.entrySet();
		List<Entry<Integer, Person>> list = new ArrayList<Entry<Integer, Person>>(set);
		//对键值对进行排序
		Collections.sort(list, new Comparator<Entry<Integer, Person>>() {
			@Override
			public int compare(Entry<Integer, Person> o1, Entry<Integer, Person> o2) {
				//按照年龄的逆序
				return o2.getValue().getAge() - o1.getValue().getAge();
			}
		});
        //linkedHashMap可以保存排序过的数据
		LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<>();
		//HashMap不能保存排序结果，无序
		HashMap<Integer, Person>m=new HashMap<>();
		for (Entry<Integer, Person> entry : list) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		    //m.put(entry.getKey(), entry.getValue());
		}
		return linkedHashMap;
	}

}