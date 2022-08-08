package com.teraflop.cli;

public class Printer {
    public static String greetUser() {
        return "Welcome to TeraFlop. An ecommerce platform where you can buy electronic devices.";
    }

    public static void run() {
        System.out.println(greetUser());
    }
}
