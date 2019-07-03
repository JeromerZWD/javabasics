package com.ecjtu.zwd.day18.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetCharCount {
	
	public static void main(String[] args) {
		String str = "fdgavAdebs5dDadfgjkdgasxbccxvvcxn1bnb-dfs";
	    getCharNum(str);
	}

	
	public static void getCharNum(String str) {
		//1����ȡ���ַ���ÿ���ַ�
		char[]words=str.toCharArray();
		/*for(int i=0;i<words.length;i++) {
			words[i]
		}*/
		Map map=new HashMap();
		for(int i=0;i<str.length();i++) {
			char word=str.charAt(i);
			//2������A-Z a-z���ֵĴ���
			//���������ĸ�򲻽��к���Ĳ���
		    if(!Character.isLetter(word))//{ 	
		    	continue;
		    //}
		    //3����ȡMap���ַ����ֵĴ���
		    Integer value=(Integer)map.get(word);
		    //������ַ���map�����ˣ�֤���Ѿ���Ź� 
		    if(map.containsKey(word)) {
		    	value+=1;//���ǵ�һ�δ洢���ַ���
		    }else {
		    	value=1;//��һ�δ洢���ַ���
		    }
		   /* if(value==null) {
		      value=1;	
		    }else {
		    	value+=1;
		    }*/
		    map.put(word, value);
		    
		}
		System.out.println(convertMaptoString(map));
	}
	
	public static  String convertMaptoString(Map map) {
		//�ַ���ƴ��
		StringBuffer sb=new StringBuffer();
		Set keys=map.keySet();
		//����map
		for (Object key : keys) {
			Integer value=(Integer)map.get(key);
			sb.append(key)
			.append("(")
			.append(value)
			.append(")").append(" ");
			
			
		}
		return sb.toString();
	}
}
