// 로또 순위
package programous;

import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
/*
1	6개 번호가 모두 일치
2	5개 번호가 일치
3	4개 번호가 일치
4	3개 번호가 일치
5	2개 번호가 일치
6(낙첨)	그 외

[44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
[0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
[45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]
[0, 0, 0, 0, 0, 1]	[1, 19, 20, 40, 15, 25]	[1, 6]
*/
        long start = System.currentTimeMillis();

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = solution(lottos, win_nums);

        System.out.println(Arrays.toString(result));

        lottos = new int[]{0, 0, 0, 0, 0, 0};
        win_nums = new int[]{38, 19, 20, 40, 15, 25};
        result = solution(lottos, win_nums);

        System.out.println(Arrays.toString(result));

        lottos = new int[]{45, 4, 35, 20, 3, 9};
        win_nums = new int[]{20, 9, 3, 45, 4, 35};
        result = solution(lottos, win_nums);

        System.out.println(Arrays.toString(result));

        lottos = new int[]{2, 14, 45, 32, 17, 16};
        win_nums = new int[]{1, 19, 20, 40, 15, 25};
        result = solution(lottos, win_nums);

        System.out.println(Arrays.toString(result));

        long end = System.currentTimeMillis();
        System.out.println("\r\n 실행시간 : " + (end - start));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int inconNum = 0;
        int zeroNum = 0;
        boolean notEq = true;
        Arrays.sort(win_nums);
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroNum++;
                inconNum++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                notEq = true;
                if (lottos[i] == win_nums[j]) {
                    notEq = false;
                    break;
                } else if (lottos[i] < win_nums[j]) {
                    break;
                }
            }
            if (notEq) {
                inconNum++;
            }
        }

        System.out.println("inconNum : " + inconNum + " zeroNum : " + zeroNum);
        answer = new int[]{(inconNum - zeroNum) == 6 ? 6 : inconNum - zeroNum + 1, inconNum > 4 ? 6 : (inconNum + 1)};
        return answer;
    }

}
