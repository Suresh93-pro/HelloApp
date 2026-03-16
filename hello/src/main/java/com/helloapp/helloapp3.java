package com.helloapp;

public class helloapp3 {
   

    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    
}

}
