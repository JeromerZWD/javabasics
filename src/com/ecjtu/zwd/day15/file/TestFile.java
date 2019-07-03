package com.ecjtu.zwd.day15.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) throws IOException {
        String path1="d:"+File.separator+"aa"+File.separator+"save.txt";
        //�����ļ�����
        File file=new File(path1);
       /* System.out.println("�ļ�����"+file.getName());
        //�ļ����ڵ�Ŀ¼
        System.out.println("��Ŀ¼��"+file.getParent());
        System.out.println("·����"+file.getPath());
        System.out.println("����·����"+file.getAbsolutePath());
        System.out.println(""+file.getCanonicalPath());
        System.out.println(file.getAbsoluteFile());*/
        System.out.println("****************************");
        File f=new File("a.txt");
       /* if(f.exists()){
            long time=f.lastModified();
            Date d=new Date(time);
            System.out.println("����޸�ʱ�䣺"+d);
            System.out.println("�Ƿ��ļ���"+f.isFile());
            System.out.println("�Ƿ�Ŀ¼��"+f.isDirectory());
            System.out.println("�ļ���С��"+f.length());
            System.out.println("�ļ��Ƿ�ɶ���"+f.canRead());
            System.out.println("�ļ��Ƿ��д��"+f.canWrite());
        }*/
        String path="d:"+File.separator+"aa"+File.separator;
        File dir=new File(path);
        System.out.println("�ļ���·����"+dir.getPath());
        System.out.println(dir.isDirectory());
        //�����µ��ļ���
        //dir.mkdir();
        File ff=new File("cc.txt");
        if(!ff.exists()) {
            ff.createNewFile();
            System.out.println("�����ļ��ɹ�");
        }
        File d=new File("upload");
        if(!d.exists()) {
            d.mkdir();
            System.out.println("�����ϴ�Ŀ¼�ɹ�");
        }
     System.out.println("*****************");
        //���a.txt�ļ����ھ�ɾ���ļ�
        if(ff.exists()) {
            System.out.println(ff.delete()==true?"�ļ�ɾ���ɹ�":"�ļ�ɾ��ʧ��");
        }

    }
}
