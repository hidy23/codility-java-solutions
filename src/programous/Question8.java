// k번 이상 신고당한 사용자
package programous;

import java.util.*;

public class Question8 {
    public static void main(String[] args) {
/*
["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]
*/
        long start = System.currentTimeMillis();

        String[] participant = {"muzi", "frodo", "apeach", "neo"};
        String[] completion = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] result = solution(participant, completion, k);
        System.out.println(Arrays.toString(result));

        participant = new String[]{"con", "ryan"};
        completion = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};
        k = 3;
        result = solution(participant, completion, k);
        System.out.println(Arrays.toString(result));


        long end = System.currentTimeMillis();
        System.out.println("\r\n 실행시간 : " + (end - start));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        Map<String, List> reportMap = new HashMap<>();
        List<String> idList;
        for (String repo : report) {

            String[] data = repo.split(" ");


            if (reportMap.get(data[1]) == null) {
                idList = new ArrayList<>();
                idList.add(data[0]);
            } else {
                idList = reportMap.get(data[1]);
                if (!idList.contains(data[0])) {
                    idList.add(data[0]);
                }
            }

            reportMap.put(data[1], idList);
        }

        List<String> resultList = new ArrayList<>();

        for (Map.Entry<String, List> entry : reportMap.entrySet()) {
            if (entry.getValue().size() >= k) {
                resultList.addAll(entry.getValue());
            }
        }

        answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = Collections.frequency(resultList, id_list[i]);
        }


        return answer;
    }

}
