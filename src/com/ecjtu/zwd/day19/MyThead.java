package com.ecjtu.zwd.day19;

public class MyThead  implements Runnable{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+":执行了");
            try{
                Thread.sleep(300);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
