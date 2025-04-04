package boj;

import java.io.*;

public class BOJ32951 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 년도가 주어지면 2024년도로부터 얼마나 지났는지 출력하라.
         * 
         * 입력: 년도가 주어진다.
         * 
         * 출력: 얼마나 지났는지 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        
        sb.append(N-2024);
       
        System.out.println(sb);
    }
}
