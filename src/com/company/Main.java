package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("first tree -------------------");
        first_tree(5);

        System.out.println("second tree -------------------");
        second_tree(6);

        System.out.println("third tree -------------------");
        third_tree(4);
    }

    public static String boolToWord(boolean b) {
        String msg = b == true ? "Yes" : "No";
//        System.out.println(msg);
        return msg;
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

    private static int calculateMaxWidth(int modules) {
        return (2 * modules - 1);
    }

    private static void third_tree(int modules) {
        int maxWidth = calculateMaxWidth(modules);

        for (int l = 0; l < modules + 1; l++) {
            for (int i = 1; i < l + 1; i++) {
                for (int k = 0; k < maxWidth - i - 1; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}


////////////////////////////////////////////////////////////////

//    docelowa złożoność obliczeniowa: O(n)
//        docelowa złożoność pamięciowa: O(1)
//
//        tablica = [-4, 12, 12, 3, 3, 3, 3, 192, 20, 20, -5, 9, 0,0, 0, 0, 0, 0, 0, -27, 1, 100]
//
//        int max_same_segment(int[] tablica)