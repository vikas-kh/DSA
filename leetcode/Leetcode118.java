package leetcode;

import java.util.*;

public class Leetcode118 {
    public static int nCr(int n, int r) {
        long res = 1; 
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(nCr(i, j));
            }
            list.add(row);
        }

        return list;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));

    }
}
