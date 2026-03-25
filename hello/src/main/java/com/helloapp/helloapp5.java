package com.helloapp;

public class helloapp5 {
        public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();

            for (String name : args) {
                names.append(name).append(", ");
            }

            names.setLength(names.length() - 2);

        
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}


