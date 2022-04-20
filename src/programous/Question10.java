// 작업 배포 갯수
package programous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
/*
progresses	speeds	return
[93, 30, 55]	[1, 30, 5]	[2, 1]
[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
*/
        long start = System.currentTimeMillis();

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] result = solution(progresses, speeds);
        System.out.println(Arrays.toString(result));

/*        progresses = new int[]{95, 90, 99, 99, 80, 99};
        speeds = new int[]{1, 1, 1, 1, 1, 1};
        result = solution(progresses, speeds);
        System.out.println(Arrays.toString(result));

        progresses = new int[]{1, 99, 99, 99, 99, 99};
        speeds = new int[]{1, 1, 1, 1, 1, 1};
        result = solution(progresses, speeds);
        System.out.println(Arrays.toString(result));

        progresses = new int[]{99, 99, 99, 99, 99, 1};
        speeds = new int[]{1, 1, 1, 1, 1, 1};
        result = solution(progresses, speeds);
        System.out.println(Arrays.toString(result));

        progresses = new int[]{99, 99, 1, 1, 1, 1};
        speeds = new int[]{1, 1, 1, 1, 1, 1};
        result = solution(progresses, speeds);
        System.out.println(Arrays.toString(result));*/

        progresses = new int[]{0, 0, 0, 0, 0, 0};
        speeds = new int[]{100, 50, 34, 25, 1, 1};
        result = solution(progresses, speeds);
        System.out.println(Arrays.toString(result));
        System.out.println(Math.ceil((100 - 0) / 34));

        long end = System.currentTimeMillis();
        System.out.println("\r\n 실행시간 : " + (end - start));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        int date = 0;
        int maxDate = 0;
        for (int i = 0; i < progresses.length; i++) {
            date = (int) Math.ceil((double) (100 - progresses[i]) / (double) speeds[i]);
            if (i == 0) {
                maxDate = date;
            }
            if (date <= maxDate) {
                sum++;
            } else {
                result.add(sum);
                sum = 1;
                maxDate = date;
            }
        }
        result.add(sum);
        answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

}
