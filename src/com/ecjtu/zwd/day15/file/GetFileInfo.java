package com.ecjtu.zwd.day15.file;

import java.io.File;
import java.io.IOException;

public class GetFileInfo {

    public static void main(String[] args) {
        String separator = File.separator;
        File f = new File("D:" + separator + "mongo");
        FileInfo fileInfo = print(f);
        System.out.println("�ļ�����:" + fileInfo.getFileNum());
        System.out.println("�ļ��������� " + (fileInfo.getSubDirNum() - 1));
        System.out.println("�ļ����ܳ���Ϊ��" + fileInfo.getFileSize() + "MB");
    }

    public static FileInfo print(File f) {
         int fileNum=0;//���ļ�����
         int subDirNum=0;//��Ŀ¼����
        double fileSize=0;
        if(f!=null){
            //������ļ�
            if(f.isFile()){
                //�������ļ�����
                fileNum++;
                //�ļ��ܴ�Сͳ��
                fileSize += (double) f.length() / 1024 / 1024;
            }else{
                subDirNum++;//���ļ��м���
                File[] files=f.listFiles();
                if(files!=null){
                    for(File file:files){
                     FileInfo info =print(file);
                     fileNum+=info.getFileNum();
                     subDirNum+=info.getSubDirNum();
                     fileSize+=info.getFileSize();
                    }
                }

            }
        }
        return  new FileInfo(fileNum, subDirNum, fileSize);
    }

}
