package boj;

import java.io.*;
import java.util.*;

public class BOJ4562 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 좀비는 뇌를 좋아한다. 좀비가 먹어야하는 뇌의 수와 존재하는 뇌의 개수가 주어지면 먹을 수 있는지 판단하라.
         *  
         * 입력: 첫 째줄에 테스트케이스의 개수가 주어진다.
         * 둘 째줄에 먹어야하는 뇌의 수와 존재하는 뇌의 개수가 주어진다.
         * 
         * 출력: 첫 째줄에 "NO BRAINS" 또는 "MMM BRAINS"를 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
       
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int need = Integer.parseInt(st.nextToken());
            int exist = Integer.parseInt(st.nextToken());

            sb.append(need >= exist ? "MMM BRAINS" : "NO BRAINS").append("\n");
        }

        // 결과 출력
        System.out.println(sb);
    }
}
