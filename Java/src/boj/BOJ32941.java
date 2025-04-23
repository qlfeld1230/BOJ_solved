package boj;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ32941 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * 대전과학고등학교에서 건우는 조별 과제 팀장을 맡게 되었다.
         * 조별 과제를 진행하려면 모든 조원이 모일 수 있는 교시에 교실을 예약해야 한다.
         * 
         * 교실은 T개의 정해진 교시에서만 사용할 수 있다.
         * 각 교시는 1부터 T까지의 서로 다른 정수로 표현된다.
         * 
         * 모든 조원은 각자 참석 가능한 교시를 건우에게 알려주었으나,
         * 건우는 자기 마음대로 X교시에 교실을 예약했다....
         * 모든 조원이 참석할 수 있을까?
         * 
         * 입력:
         * 첫째 줄에 교실을 예약할 수 있는 교시의 개수 T와 건우가 예약한 교시 X가 공백으로 구분되어 주어진다.
         * (1 ≤ T ≤ 1000; 1 ≤ X ≤ T)
         * 
         * 둘째 줄에 조원의 수 N이 주어진다. (1 ≤ N ≤ 10)
         * 
         * 셋째 줄부터 N명의 조원이 알려준 참석 가능한 교시에 대한 정보가 주어진다.
         * 각 조원에 대한 정보는 두 줄로 구성된다.
         * 
         * • 첫째 줄에 각 조원이 예약할 수 있는 교시의 개수 Kᵢ가 주어진다. (1 ≤ Kᵢ ≤ T)
         * • 둘째 줄에 i 조원이 알려준 참석 가능한 교시를 나타내는 Kᵢ개의 정수 Aᵢ,₁, Aᵢ,₂, ..., Aᵢ,ₖᵢ가 공백으로 구분되어
         * 오름차순으로 주어진다.
         * (1 ≤ Aᵢ,₁ < Aᵢ,₂ < ⋯ < Aᵢ,ₖᵢ ≤ T)
         * 
         * 입력으로 주어지는 수는 모두 양의 정수이다.
         * 
         * 출력:
         * X교시에 모든 조원이 참석할 수 있다면 YES를 출력하고,
         * 그렇지 않다면 NO를 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String result = "YES";

        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken(); // T
        int X = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            boolean isAvailable = false;

            for (int j = 0; j < n; j++) {
                if (st2.nextToken().equals(String.valueOf(X))) {
                    isAvailable = true;

                    break;
                }
            }

            if (!isAvailable) {
                result = "NO";
                break;
            }

        }

        // 결과 출력
        sb.append(result);
        System.out.println(sb);
    }
}
