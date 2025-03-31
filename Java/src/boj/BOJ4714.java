package boj;

import java.io.*;

public class BOJ4714 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 숫자가 주어지면 0.167을 곱하고 문자열을 출력한다.
         * 
         * 입력: 숫자가 주어진다. -1이 입력되면 중단한다.
         * 
         * 출력: 결과를 소수점 2자리까지 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            double num = Double.parseDouble(br.readLine());
            if(num < 0) break; // -1이 입력되면 종료

           sb.append("Objects weighing " + String.format("%.2f", num) + " on Earth will weigh " + String.format("%.2f", num * 0.167) + " on the moon.").append("\n");
        }

        // 결과 출력
        System.out.print(sb);
    }
}
