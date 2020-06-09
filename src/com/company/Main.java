package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("first tree -------------------");
        first_tree(5);

        System.out.println("second tree -------------------");
        second_tree(6);
    }

    public static void first_tree(int size) {

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.print("\n");
        }
    }

    public static void second_tree(int height) {
        for (int i = 1; i < height + 1; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i -1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
