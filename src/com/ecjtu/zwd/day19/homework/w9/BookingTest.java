package com.ecjtu.zwd.day19.homework.w9;

public class BookingTest implements  Runnable {
    BookingClerk bt;
    int num;

    public BookingTest(BookingClerk bt, int num) {
        this.bt = bt;
        this.num = num;
        new Thread(this).start();
    }

    @Override
    public void run() {
            bt.booking(num);
    }
}
