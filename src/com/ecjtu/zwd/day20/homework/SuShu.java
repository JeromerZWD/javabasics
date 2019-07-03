package com.ecjtu.zwd.day20.homework;
    /*利用多线程求解某范围素数,每个线程负责 1000范围：
    线程1找1-1000；线程 2 找 1001-2000；
    线程 3 找 2001-3000。编程程序将每个线程找到的素数及时打印。*/
    public class SuShu extends Thread{
        private int beg;
        private int end;
        public SuShu(int beg, int end) {
            this.beg = beg;
            this.end = end;
        }
        private boolean isPrime(int number){
            if (number==1){
                return false;
            }
            if (number==2){
                return true;
            }
            for (int i=2;i<number;i++){
                if ((number%i)==0){
                    return false;
            }
            }
            return true;
        }
        public void run(){
            while (true){
                if (beg>end){
                    return;
                }
                if (isPrime(beg)){
                    System.out.println(beg);
                }
                beg++;
            }
        }
        public static void main(String[] args) throws InterruptedException {
            SuShu e1=new SuShu(1,1000);
            SuShu e2=new SuShu(1001,2000);
            SuShu e3=new SuShu(2001,3000);
            e1.start();
            e2.start();
            e3.start();

        }
    }
