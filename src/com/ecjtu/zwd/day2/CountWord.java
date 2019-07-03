package com.ecjtu.zwd.day2;

public class CountWord {
    public static void main(String[] args) {
        String str="我爱中国，中国休息休，我爱我家,我爱你故乡";
        String key="爱";
        int count=0;
       // char[] words=str.toCharArray();
        for(int i=0;i<str.length();i++){
            //char word=str.charAt(i);
            String word=str.substring(i,i+1);
            if(word.equals(key)){
                count++;
            }
        }

        System.out.println(key+"在该字符串中出现"+count+"次");
    }
}
