package boj;

import java.io.*;

public class BOJ13297 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * Let’s face it... you are not that handy.
         * When you need to make a major home repair, you often need to hire someone to help.
         * When they come for the first visit, they make an estimate of the cost.
         * They must be careful: if they overestimate, it might scare you off,
         * but if they underestimate, the work might not be worth their time.
         * 
         * Because the worker is so careful, it can take a long time for them to produce the estimate.
         * But when you ask for an estimate, you’re really asking for the magnitude of the cost.
         * Will this be $10 or $100 or $1,000? That’s all you really want to know on a first visit.
         * 
         * Write a program that, given the worker’s estimate, reports just the magnitude of the cost —
         * the number of digits needed to represent the estimate.
         * 
         * 입력:
         * Input begins with a line containing an integer N (1 ≤ N ≤ 100).
         * The next N lines each contain one estimated cost, which is an integer between 0 and 10^100.
         * 
         * 출력:
         * For each estimated cost, output the number of digits required to represent it.
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 테스트 케이스만큼 반복
        for (int i = 0; i < N; i++) {
            // 초기 상태 설정
            String str = br.readLine();
            sb.append(str.length()).append("\n");
          
        }

        System.out.print(sb);
    }
}
