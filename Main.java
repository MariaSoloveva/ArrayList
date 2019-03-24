package com.company;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        try {
            for (int i = 0; i < 5; i++) {
                list.add(i, "!");
                list.add(i, "World");
                list.add(i, "Hello");
            }
        } catch (IndexOutOfRange e)
        {
            System.out.println("Give me more memory!!");
        }
        try {
            for (int inner = 0; inner < list.size(); inner++) {
                System.out.print(list.get(inner));
            }
        } catch (IndexOutOfRange e) {
            System.out.println("I can't find some elements to print!");
        }
    }
}
