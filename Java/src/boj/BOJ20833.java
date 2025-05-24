package boj;

import java.io.*;

public class BOJ20833 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * Nadja klistrar ihop små träkuber med sidlängd 1 till större kompakta kuber.
         * Hon har nu bestämt sig för att hon vill ha en kub av varje sidlängd från 1 till N.
         * Hur många småkuber behöver Nadja?
         * 
         * 입력:
         * På den första och enda raden i indatan står heltalet N, 1 ≤ N ≤ 100.
         * 
         * 출력:
         * Programmet ska skriva ut en rad med ett heltal: antalet småkuber Nadja behöver.
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        for(int i=1; i<=N; i++){
            sum += i*i*i;
        }

        sb.append(sum);

        // 결과 출력
        System.out.print(sb);
    }

   
}
