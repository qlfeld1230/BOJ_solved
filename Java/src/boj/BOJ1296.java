package boj;

import java.io.*;
import java.util.*;

public class BOJ1296 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 인물의 이름과 팀 이름들이 주어졌을 때, 우승할 확률이 가장 높은 팀을 출력.
         * 공식 : ((L+O) × (L+V) × (L+E) × (O+V) × (O+E) × (V+E)) mod 100
         * (L: 팀 이름과 인물 이름에 포함된 'L'의 개수), ... 
         * 
         * 입력:
         * 첫 째줄에 인물의 이름이 주어진다. 둘 째 줄에 팀의 개수 N이 주어지고,
         * 그 다음 N개에 걸쳐 팀 이름이 주어진다.
         * 
         * 출력: 가장 우승 확률이 높은 팀 이름을 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String name = br.readLine();
        int N = Integer.parseInt(br.readLine());

        ArrayList<Character> nameList = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            nameList.add(name.charAt(i));
        }

        // 우승 확률을 저장할 Map
        Map<Integer, List<String>> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String team = br.readLine();
            ArrayList<Character> teamList = new ArrayList<>();

            for (int j = 0; j < team.length(); j++) {
                teamList.add(team.charAt(j));
            }

            int L = Collections.frequency(teamList, 'L') + Collections.frequency(nameList, 'L');
            int O = Collections.frequency(teamList, 'O') + Collections.frequency(nameList, 'O');
            int V = Collections.frequency(teamList, 'V') + Collections.frequency(nameList, 'V');
            int E = Collections.frequency(teamList, 'E') + Collections.frequency(nameList, 'E');

            int result = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;

            // Map에 결과 저장 (동일한 key에 여러 팀 이름을 저장)
            map.putIfAbsent(result, new ArrayList<>());
            map.get(result).add(team);
        }

        // Map을 정렬: Key 내림차순, Key가 같으면 Value 사전순
        List<Map.Entry<Integer, List<String>>> sortedEntries = new ArrayList<>(map.entrySet());
        sortedEntries.sort((e1, e2) -> {
            if (!e1.getKey().equals(e2.getKey())) {
                return e2.getKey() - e1.getKey(); // Key 내림차순
            } else {
                return e1.getValue().get(0).compareTo(e2.getValue().get(0)); // Value 사전순
            }
        });

        // 정렬된 결과에서 가장 높은 우승 확률의 팀 이름 출력
        for (Map.Entry<Integer, List<String>> entry : sortedEntries) {
            List<String> teams = entry.getValue();
            Collections.sort(teams); // 동일한 Key 내에서 Value를 사전순 정렬
            sb.append(teams.get(0)).append("\n");
            break; // 가장 높은 우승 확률의 팀만 출력
        }

        System.out.println(sb);
    }
}
