package com.study.juc;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start...");
        Thread t = new Thread() {
            public void run() {
                System.out.println("thread run...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
                System.out.println("thread end.");
            }
        };
        t.start();
        t.join(); // 主线程调用t线程的join()，即等待t线程执行完，才继续往下执行
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {}
        System.out.println("main end...");
    }
}
