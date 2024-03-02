package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * 메모리 260252KB
         * 시간 2096ms
         * 코드길이 779B
         * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] num = new int[n];
        int[] sum = new int[n+1];
        int[] re = new int[m];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        sum[0] = 0;
        for(int i=1; i<=n; i++) {
            sum[i] = sum[i-1] + num[i-1];
        }
        System.out.println(Arrays.toString(sum));

        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int s = a == 1 ? 0 : sum[a-1];
            re[i] = sum[b] - s;
        }

        for (int i : re) {
            System.out.println(i);
        }
    }
}
