package com.Interview.threading.basicthreads;

public class MyThread extends Thread {
    public void run(){
        for (int i =0 ; i< 50; i++){
            System.out.println(i);
        }
    }
}
