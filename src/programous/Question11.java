// 124나라의 숫자
package programous;

public class Question11 {
    public static void main(String[] args) {
/*
10진법	124 나라	10진법	124 나라
1	1	6	14
2	2	7	21
3	4	8	22
4	11	9	24
5	12	10	41

n	result
1	1
2	2
3	4
4	11

*/
        long start = System.currentTimeMillis();

        int n = 130;
        String result = solution(n);
        System.out.println(result);

        long end = System.currentTimeMillis();
        System.out.println("\r\n 실행시간 : " + (end - start));
    }

    public static String solution(int n) {
        String answer = "";

        String[] numbers = {"4", "1", "2"};

        int num = n;

        while (num > 0) {
            int remainder = num % 3;
            num = num / 3;

            if (remainder == 0) num--;

            answer = numbers[remainder] + answer;
        }

        return answer;
    }

}
