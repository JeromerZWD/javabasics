package com.ecjtu.zwd.day18.map;

import java.util.TreeMap;
/**
 * TreeMap�ǰ�key��˳�������
 * @author Administrator
 *
 */
public class TestTreeMap {

	public static void main(String[] args) {

		TreeMap  map=new TreeMap();
		map.put(new Person("david", 18),4 );
		map.put(new Person("tom", 10),1 );
		map.put(new Person("jack", 10),2 );
		map.put(new Person("bobo", 18),3 );

		
		System.out.println(map);
	}
}
