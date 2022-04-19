// 나누어 떨어지는 배열
package programous;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
/*        [5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]*/

        int[] arr = {3, 2, 6};
        int divisor = 10;
        int[] result = solution(arr, divisor);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] array, int divisor) {
        int[] result = Arrays.stream(array).filter(factor -> factor % divisor == 0).sorted().toArray();
        if (result.length == 0) result = new int[]{-1};
        return result;
    }

}
