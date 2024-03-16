package week10;

import java.util.Arrays;
import java.util.Scanner;

public class Q16401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //조카의 수
        int n = sc.nextInt(); //과자의 수

        int[] sticks = new int[n];
        for (int i = 0; i < n; i++) sticks[i] = sc.nextInt();
        Arrays.sort(sticks);

        int start = 0, end = sticks[n - 1];     // 과자 길이
        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int tempCount = 0;

            if(mid == 0) {
                answer = 0;
                break;
            }
            System.out.println("================================");
            System.out.println("start = " + start);
            System.out.println("mid = " + mid);
            System.out.println("end = " + end);

            for (int s : sticks) {
                tempCount += s / mid;
            }
            if(tempCount < m)
                end = mid - 1;
            else {
                answer = mid;
                start = mid + 1;
            }
            System.out.println("tempCount = " + tempCount);
        }

        System.out.println("answer = " + answer);
    }
}

