// 각 자리수의 합이 주어진 숫자와 같은 숫자 중 최소값 구하기. 중복허용
package yanolja;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        int N = 19;
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        int index = N/9;
        int first = N%9;
        String[] returnstr = new String[index+1];
        returnstr[0]=Integer.toString(first);

        for(int i=0; i<index; i++){
            returnstr[i+1] = "9";
        }

        return Integer.parseInt(String.join("", returnstr));
    }
}
