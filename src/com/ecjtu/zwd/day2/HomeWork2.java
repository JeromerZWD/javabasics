package com.ecjtu.zwd.day2;

public class HomeWork2 {

	/**
	 * 2.已知字符串"The last French hostage held by Islamist militants, Serge Lazarevic"
     1)统计该字符串中字母s出现的次数
     2)取出第4个单词
     3)将字符串的每个单词的首字母大写。并输出结果
	 */
	public static void main(String[] args) {
		String str="The last French hostage held by Islamist militants, Serge Lazarevic";
		int count=0;
		for(int i=0;i<str.length();i++){
			char word=str.charAt(i);//获取单个字符
			if(word=='s'||word=='S'){
				count++;
			}
		}
		System.out.println(count);
		String []s=str.split(" ");
		System.out.println(s[3]);//获取第四个单词
		//数组增强版的循环,replaceFirst()替换字符串里第一个的字符，subString(int start,int end)取子窜，
		/**
		 * for(int i=0;i<s.length;i++)
		 * for(String word:s):前面的是数组当中的元素，
		 * 后面的是数组名字，会循环检测数组当中元素
		 */
		for(String word:s){
			System.out.println(word.replaceFirst(word.substring(0, 1), word.substring(0, 1).toUpperCase()));
		}

	}

}
