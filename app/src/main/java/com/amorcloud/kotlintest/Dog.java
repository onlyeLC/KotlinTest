package com.amorcloud.kotlintest;

import android.util.Log;

public class Dog {
    public static void main(String[] args) {
        Dog dog = new Dog();

    }

    String name = "";
    int headNum = 1;
    int age = 1;
    public void eat() {
        Log.d("TAG", name+"eat:");
    }

}
