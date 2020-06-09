package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("first tree -------------------");
        first_tree(5);
    }

    public static void first_tree(int size) {

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.print("\n");
        }
    }
}
