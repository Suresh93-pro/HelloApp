package com.helloapp;

public class helloapp6 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

       
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String names = nameBuilder.toString();
            names = names.substring(0, names.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}


