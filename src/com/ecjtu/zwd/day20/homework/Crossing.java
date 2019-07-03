package com.ecjtu.zwd.day20.homework;

public class Crossing implements Runnable{
    String[] name;

    public Crossing() {
        String[] name ={"zhang1","zhang2","zhang3","zhang4","zhang5","zhang6","zhang7","zhang8","zhang9","zhang10"};
        this.name = name;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Crossing crossing=new Crossing();
        for (int i=0;i<crossing.name.length;i++){
            new Thread(crossing,crossing.name[i]).start();
        }
    }
}
