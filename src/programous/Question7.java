// 로또 순위
package programous;

import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
/*
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
*/
        long start = System.currentTimeMillis();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String result = solution(participant, completion);
        System.out.println(result);

        participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        completion = new String[]{"josipa", "filipa", "marina", "nikola"};
        result = solution(participant, completion);
        System.out.println(result);

        participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        completion = new String[]{"stanko", "ana", "mislav"};
        result = solution(participant, completion);
        System.out.println(result);


        long end = System.currentTimeMillis();
        System.out.println("\r\n 실행시간 : " + (end - start));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (participant[i] != completion[i]) break;
        }
        answer = participant[i];
        return answer;

        /*for (String comple : completion) {
            participant = Arrays.stream(participant).filter(e -> e.equals(comple)).toArray(String[]::new);
        }*/
        /*Arrays.sort(participant);
        Arrays.sort(completion);
        String strParticipant = String.join("", participant);
        String strCompletion = String.join("", completion);
        strParticipant.replaceAll(strCompletion, "");
        answer = strParticipant;*/
    }

}
