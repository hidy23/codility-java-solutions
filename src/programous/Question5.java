// 단어가 포함된 수를 숫자로 바꾸기
package programous;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
/*
1478 → "one4seveneight"
234567 → "23four5six7"
10203 → "1zerotwozero3"
*/
        long start = System.currentTimeMillis();

        String s = "1zerotwozero3";
        int result = solution(s);
        System.out.println("result : " + result);

        long end = System.currentTimeMillis();
        System.out.println("\r\n 실행시간 : " + (end - start));
    }

    public static int solution(String s) {
        int answer = 0;
        Map<String, String> map = new HashMap();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        List<String> keyList = new ArrayList<>(map.keySet());
        String key;
        String value;
        Iterator<String> it = keyList.iterator();
        while (it.hasNext()) {
            key = it.next();
            s = s.replaceAll(key, map.get(key));
        }

        answer = Integer.parseInt(s);
        return answer;
    }

}
