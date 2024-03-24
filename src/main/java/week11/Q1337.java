package week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1337 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] =  Integer.parseInt(br.readLine());

        Arrays.sort(nums);

        int start = 0, end = 0;
        int answer = 0;
        while (true) {
            System.out.println("===========================");
            int cnt = 0;
            for(int i=start; i<nums.length-1; i++) {
                if (nums[i] + 1 != nums[i + 1]) {
                    cnt++;
                }
                if(i > start+4) break;
            }

            if (answer == 0) {
                answer = cnt;
            }
            if(cnt < answer) {
                end++;
            }
            else if(cnt >= answer) {
                start++;
            }
            answer = Math.min(answer, cnt);

            System.out.println("cnt = " + cnt);
            System.out.println("answer = " + answer);
            if(end == nums.length-1) break;
        }

    }
}
