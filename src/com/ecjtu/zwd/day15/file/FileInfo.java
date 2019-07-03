package com.ecjtu.zwd.day15.file;

/**
 * �洢������Ϣ
 */
public class FileInfo {

    private int fileNum;//���ļ�����
    private int subDirNum;//��Ŀ¼����
    private double fileSize;

    public FileInfo(int fileNum, int subDirNum, double fileSize) {
        this.fileNum = fileNum;
        this.subDirNum = subDirNum;
        this.fileSize = fileSize;
    }

    public int getFileNum() {
        return fileNum;
    }

    public void setFileNum(int fileNum) {
        this.fileNum = fileNum;
    }

    public int getSubDirNum() {
        return subDirNum;
    }

    public void setSubDirNum(int subDirNum) {
        this.subDirNum = subDirNum;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
}
