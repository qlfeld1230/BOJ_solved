package boj;

import java.io.*;
import java.util.*;

public class BOJ25325 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * 학생 이름이 공백으로 구분된 문자열 A가 주어진다. 문자열 A에는 중복된 학생 이름이 존재하지 않는다.
         * 학생 이름은 알파벳 소문자로 이루어져 있다. 각 학생이 좋아하는 학생의 학생 이름 목록이 공백으로 구분된 문자열로 주어진다.
         * 각 학생이 좋아하는 학생은 1명 이상 주어지고, 내가 나를 좋아하는 예는 없다.
         * 나를 좋아하는 학생이 많을수록 나의 인기도가 높다.
         * 인기도가 높은 학생부터 낮은 학생 순으로 학생 이름과 해당 학생을 좋아하는 학생 수를 출력하자.
         * 인기도가 같은 경우 학생 이름 기준으로 오름차순으로 출력하자.
         * 
         * 입력:
         * 첫 번째 줄에 학생 수 n이 주어진다.
         * 두 번째 줄에 n명의 학생 이름이 공백으로 구분된 문자열 A가 주어진다.
         * 다음 줄부터 n개의 줄에 걸쳐 한 줄에 한 학생의 정보가 주어진다.
         * 학생 정보는 문자열 A에 나온 학생 순서대로 주어진다.
         * 한 명의 학생 정보는 해당 학생이 좋아하는 학생 이름이 공백으로 구분된 문자열로 주어진다.
         * 
         * 출력:
         * 첫 번째 줄부터 n번째 줄까지 학생 이름과 해당 학생을 좋아하는 학생 수를 공백으로 구분하여 한 줄에 출력한다.
         * 인기도가 높은 학생부터 낮은 학생 순으로 출력하고,
         * 인기도가 같은 경우 학생 이름 기준으로 오름차순으로 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        String input[] = br.readLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            map.put(input[i], 0); // 학생 이름 초기화
        }

        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                String student = input[j];
                map.put(student, map.getOrDefault(student, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // 인기도 내림차순
            }
            return a.getKey().compareTo(b.getKey()); // 이름 오름차순
        });

        for (Map.Entry<String, Integer> entry : list) {
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }

        // 결과 출력
        System.out.print(sb);
    }
}
