// 3개을 더했을 때 소수가 되는 수의 갯수
package programous;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
/*
[1,2,3,4]	1
[1,2,7,6,4]	4
*/
        long start = System.currentTimeMillis();

        int[] arr = {1, 2, 7, 6, 4};
        int result = solution(arr);
        System.out.println("result : " + result);

        long end = System.currentTimeMillis();
        System.out.println("\r\n 실행시간 : " + (end - start));
    }

    public static int solution(int[] nums) {
        int answer = -1;

        answer = 0;
        int numSum = 0;
        boolean[] prime = getPrime(2997);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    numSum = nums[i] + nums[j] + nums[k];
                    if (isPrime(prime, numSum)) {
                        answer++;
                    }
                }
            }
        }


        return answer;
    }

    public static boolean[] getPrime(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        // 소수는 true
        // 0, 1은 소수가 아니므로 false
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            // 만약 i가 소수 혹은 아직 지워지지 않았다면
            if (isPrime[i]) {
                // i의 배수 j들에 대해 isPrime[j] = false; 로 둔다.
                // i*i미만의 배수는 이미 지워졌으므로 신경쓰지 않는다.
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;

    }

    public static boolean isPrime(boolean[] isPrime, int target) {
        // 소수 출력
        for (int i = 1; i <= isPrime.length; i++) {
            if (i == target) {
                if (isPrime[i]) return true;
                else return false;
                //   System.out.print(i + " ");

            }
        }

        return false;
    }
}
