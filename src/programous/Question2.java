// 0~9까지 없는 수 더하기
package programous;

public class Question2 {
    public static void main(String[] args) {
/*        [1,2,3,4,6,7,8,0]	14
                [5,8,4,0,6,7,9]	6*/

        int[] a = {5, 8, 4, 0, 6, 7, 9};
        int result = solution(a);
        System.out.println(result);
    }

    public static int solution(int[] numbers) {
        int answer = 45;
        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;

    }
}
