package com.driver;

public class Main {

    public static void main (String[] args){
        RWOnly newrw = new RWOnly();
        newrw.setName("NewName");
//        System.out.println(newrw.getName());
        newrw.getName();
    }
}