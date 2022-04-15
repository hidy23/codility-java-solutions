// n보다 큰 자연수 중 짝수 자리수 이고, 자리수를 반으로 나누어서 각 자리수를 곱했을 경우 왼쪽과 오른쪽이 같은 값 중 최소값 구하기
package programous;

import java.util.*;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        /*[6, 10, 2]	"6210"
[3, 30, 34, 5, 9]	"9534330"*/

        int[] a = {3, 30, 34, 5, 9};
        solution(a);
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(integerArray);
    }


    public static void solution(int[] a) {
        String answer = "";

        l_pivot_sort(a, 0, a.length - 1);
        //  return a;
        //  return answer;
    }

    private static void l_pivot_sort(int[] a, int lo, int hi) {
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(integerArray);
        System.out.print("lo : " + lo);
        System.out.println("hi : " + hi);

        if (lo >= hi) return;
        int pivot = partition(a, lo, hi);
        System.out.println("hi : " + hi);

        l_pivot_sort(a, lo, pivot - 1);
        l_pivot_sort(a, pivot + 1, hi);
    }

    private static int partition(int[] a, int left, int right) {

        int lo = left;
        int hi = right;
        int pivot = a[left];

        while (lo < hi) {
            while (a[hi] > pivot && lo < hi) {
                hi--;
            }
            while (a[lo] <= pivot && lo < hi) {
                lo++;
            }

            swap(a, lo, hi);
        }


        return lo;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static String solution1(int[] numbers) {
        String answer = "";

        Map<Integer, String> map = new Hashtable<>();
        for (int i = 0; i < numbers.length; i++) {
            String value = Integer.toString(numbers[i]);
            map.put(numbers[i] > 9 ? Integer.parseInt(value.substring(0, 1)) : numbers[i], value);
        }
        Object[] mapKey = map.keySet().toArray();
        Arrays.sort(mapKey, Collections.reverseOrder());

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < mapKey.length; i++) {
            sb.append(map.get(mapKey[i]));
        }
        answer = sb.toString();
        return answer;
    }
}
