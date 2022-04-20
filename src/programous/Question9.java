// 문자열 압축
package programous;

public class Question9 {
    public static void main(String[] args) {
/*
"aabbaccc"	7
"ababcdcdababcdcd"	9
"abcabcdede"	8
"abcabcabcabcdededededede"	14
"xababcdcdababcdcd"	17
*/
        long start = System.currentTimeMillis();

        String participant = "abcabcabcabcdededededede";
        int result = solution(participant);
        System.out.println(result);


        long end = System.currentTimeMillis();
        System.out.println("\r\n 실행시간 : " + (end - start));
    }

    public static int solution(String s) {
        int min = s.length();
        int len = s.length() / 2 + 1;
        for (int i = 1; i < len; i++) {
            String before = "";
            int sum = 0;
            int cnt = 1;
            for (int j = 0; j < s.length(); ) {
                int start = j;
                j = (j + i > s.length()) ? s.length() : j + i;
                String temp = s.substring(start, j);
                if (temp.equals(before)) {
                    cnt++;
                } else {
                    if (cnt != 1) {
                        sum += (int) Math.log10(cnt) + 1;
                    }
                    cnt = 1;
                    sum += before.length();
                    before = temp;
                }
            }
            sum += before.length();
            if (cnt != 1) {
                sum += (int) Math.log10(cnt) + 1;
            }
            min = (min > sum) ? sum : min;
        }

        return min;
    }

}
