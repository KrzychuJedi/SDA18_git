package com.sda.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your name!");
        String name = null;
        if(scanner.hasNext()){
            name = scanner.next();
        }

        System.out.println("Hello " + name);
    }
}
