// 주어진 int 배열의 각 element를 binary로 변환 후 각 element의 AND연산 결과가 0보다 큰 최대 element의 갯수 구하기
package yanolja;

import java.util.Arrays;
import java.util.Collections;

public class Question4 {
    public static void main(String[] args) {
        int[] A = new int[]{13,7,2,8,3};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;
        int maxlength = 0;
        int cnt = 0;
        String[] barr = new String[A.length];

        for(int i=0;i<A.length;i++) {
            barr[i] = Integer.toBinaryString(A[i]);
            if(barr[i].length()>maxlength) maxlength = barr[i].length();
        }

        for(int j=0; j<maxlength; j++) {
            for (int i = 0; i < barr.length; i++) {
                if (barr[i].length() > j && barr[i].charAt(barr[i].length() - 1 - j) == '1') cnt++;
            }
            if(cnt > max) max = cnt;
            cnt = 0;
        }

        return max;
    }
}
