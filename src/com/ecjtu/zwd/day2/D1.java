package com.ecjtu.zwd.day2;

import static java.lang.String.valueOf;

public class D1 {
    //3
    /*public void isSymmetry(String s){
        StringBuffer stringBuffer=new StringBuffer(s);
        StringBuffer s1=stringBuffer.reverse();

        if (s1.toString().equals(s)){
            System.out.println("对称");

        }else{
            System.out.println("不对称");
        }
    }*/
    public static void main(String[] args) {
        //1
        /*String s="gdk";
        String s2=s.toUpperCase();
        String s3=s2.substring(1,3);
        System.out.println(s3);*/

        //2
       /* String s="test";
        String s1=s.replace("es","se");
        System.out.println(s1);*/

       //3
        /*String s="aba";
        new D1().isSymmetry(s);*/

        //4
        /*String s="113@ ere qqq yyui";
        String s1=s.replace("@"," ");
        String [] s2=s1.split(" ");
        for (int i=0;i<s2.length;i++){
            System.out.println(s2[i]+"\t");
        }*/

        //5
       /* String s="To be or not to be";
        String [] q=s.split(" ");
        String s2="";
        StringBuffer stringBuffer2=new StringBuffer(s2);
        for (int i=0;i<q.length;i++){
            StringBuffer stringBuffer = new StringBuffer(q[i]);
            StringBuffer s1 = stringBuffer.reverse();
            if (i!=0) {
                stringBuffer2.append(" ");
            }
                stringBuffer2.append(s1);
        }
        System.out.println(stringBuffer2);*/

       //6
        /*String s="name=zhangsan age=18 classNo=090728";
        String [] q=s.split(" ");
        for (int i=0;i<q.length;i++){
            String [] s1=q[i].split("=");
            System.out.println(s1[1]);
        }*/

        //7
        /*String str="IhLeOllVoEwJorAlVdA";
        String newstr1="";
        String newstr2="";
        char [] chars=str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if(chars[i]>97){
                newstr1+=chars[i];
            } newstr2+=chars[i];
        }
        System.out.println(newstr1.toLowerCase());
        System.out.println(newstr2.toUpperCase());
        System.out.println("倒叙：");
        System.out.println(new StringBuffer(str).reverse());*/

        //8
        String s="The last French hostage held by Islamist militants, Serge Lazarevic";
        /*int num=0;
        char [] s1=s.toCharArray();
        for (int i=0;i<s1.length;i++){
            if (valueOf(s1[i]).equalsIgnoreCase("s")){
                num++;
            }
        }
        System.out.println(num);*/

        /*String []q=s.split(" ");
        System.out.println(q[3]);*/
        String s3="";
        String [] strings=s.split(" ");
        for(String word:strings){
            s3+=" ";
            s3+=word.replaceFirst(word.substring(0, 1), word.substring(0, 1).toUpperCase());

        }
        System.out.println(s3);



        //9
       /* String s="as well as other constants and methods";
        String[] q=s.split(" ");
        System.out.println(q.length);
        int index=q[0].length();
        int longindex=0;
        for (int i=1;i<q.length;i++){
            if(index<q[i].length()){
                index=q[i].length();
                longindex=i;
            }
        }
        System.out.println(q[longindex]);*/

       //10
       /* String s="aassswwcddooceffopiuuopueoczmmjhbvv";
        String OnlyOnceChar="";
        for (int i=0;i<s.length();i++){
            String s1=s.substring(i,i+1);
            if (s.lastIndexOf(s1)==s.indexOf(s1)){
                OnlyOnceChar+=s1;
            }
        }
        System.out.println(OnlyOnceChar.toCharArray()[0]);*/
    }
}
