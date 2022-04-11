// 주어진 숫자의 각 자리수를 재배열한 것중 최대값 구하기
package yanolja;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        int A = 1237428;
        System.out.println(solution(A));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        int result =0;
        String temp= Integer.toString(N);
        String[] strN = temp.split("");
        Arrays.sort(strN, Collections.reverseOrder());
        result = Integer.parseInt(String.join("", strN));
        //result = Integer.parseInt(strN[0]);

        return result;
    }
}
