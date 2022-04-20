// 포켓몬 고르기
package programous;

import java.util.stream.IntStream;

public class Question12 {
    public static void main(String[] args) {
/*
nums	result
[3,1,2,3]	2
[3,3,3,2,2,4]	3
[3,3,3,2,2,2]	2

*/
        long start = System.currentTimeMillis();

        int[] nums = {3, 3, 3, 2, 2, 2};
        int result = solution(nums);
        System.out.println(result);

        long end = System.currentTimeMillis();
        System.out.println("\r\n 실행시간 : " + (end - start));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;
        int[] disNums = IntStream.of(nums).distinct().toArray();
        if (disNums.length > max) answer = max;
        else answer = disNums.length;

        return answer;
    }

}
