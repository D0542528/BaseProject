package com.github.d0542528;

public class Main {

    public static Main instance;

    public static void main(String[] args){
        instance = new Main();
        System.out.println("Test: " + getInstance().getSomething(1, 2));
    }

    public static Main getInstance(){
        return instance;
    }

    public int getSomething(int a, int b){
        return a + b;
    }
}
