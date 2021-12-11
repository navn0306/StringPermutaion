package com.bridge.permutation;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {

        System.out.println("Enter a String :");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n - 1);
    }

    private void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
