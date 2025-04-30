package boj;

import java.io.*;

public class BOJ32775 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * 4시간의 벽이란, 고속철도와 항공편이 경합할 때 고속철도가 4시간 이하로 주파하는 구간에서는 고속철도가 우위에 서고
         * 그렇지 않으면 항공편이 우위에 서는 경향을 의미합니다.
         * 사람들은 역 α에서 역 β로 이동할 때, 항공편을 이용하는 것이 소요 시간이 더 적게 걸린다면 항공편을 이용합니다.
         * 그렇지 않으면 고속철도를 이용합니다.
         * 역 α에서 역 β로 고속철도를 이용했을 때 소요 시간은 Sₐᵦ분입니다.
         * 역 α에서 역 β로 항공편을 이용했을 때 소요 시간은 아래의 합으로 계산됩니다.
         * 
         * • 역 α에서 공항 a로 이동하는 데 소요 시간
         * • 공항 a에서 공항 b로 이동하는 데 소요 시간 Fₐᵦ분
         * • 공항 b에서 역 β로 가는 데 소요 시간
         * 
         * 사람들은 역 α에서 역 β로 이동할 때, 어느 교통수단을 더 많이 이용하는지 알려주세요.
         * 단, 공항과 역 간 이동 시간은 무시합니다.
         * 
         * 입력:
         * 첫 번째 줄에 문제에서 설명한 Sₐᵦ가 주어집니다.
         * 두 번째 줄에 문제에서 설명한 Fₐᵦ가 주어집니다.
         * 
         * 출력:
         * 역 α에서 역 β로 이동할 때, 사람들이 고속철도를 더 많이 이용하면 high speed rail,
         * 그렇지 않으면 flight 를 출력해 주세요.
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int F = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        // 문제 해결
        if(S >= F) {
            sb.append("high speed rail");
        } else {
            sb.append("flight");
        }

        System.out.println(sb);
    }
}
