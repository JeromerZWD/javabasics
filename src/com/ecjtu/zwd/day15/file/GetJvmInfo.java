package com.ecjtu.zwd.day15.file;

public class GetJvmInfo {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        System.out.println("jvm����ڴ���"+r.maxMemory());
        System.out.println("jvm�����ڴ���"+r.freeMemory());
        String string="hello"+"world"+"!!!"+"\t"+"welcome"+"to"+"everybody";
        System.out.println(string);
        //ʹ��ѭ���޸��ַ���string,����������ռ���ڴ�
        for(int i=0;i<1000;i++){
            string+=i;
        }
        System.out.println("�����ַ���֮������ڴ�"+r.freeMemory());
        r.gc();//�����������գ��ͷſռ�
        System.out.println("��������֮��Ŀ����ڴ�"+r.freeMemory());
    }
}
