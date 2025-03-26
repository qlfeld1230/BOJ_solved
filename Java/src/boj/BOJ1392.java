package boj;

import java.io.*;
import java.util.*;

public class BOJ1392 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 악보와 연주하는 시간이 주어졌을 때, 주어진 시간에 연주하고 있는 악보 출력. 
         * 
         * 입력: 첫 째줄에 악보 수(N)와 질문의 개수(Q)가 주어진다.
         * 다음 N개의 줄에는 각 악보의 연주 시간이 주어진다.
         * 다음 Q개의 줄에는 질문이 주어진다.
         * 
         * 출력: 1번부터 Q번까지 해당 초의 악보를 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= N; i++) {
            int num = Integer.parseInt(br.readLine());

            for(int j = 0; j < num; j++) {
                list.add(i);
            }
        }
        
        for(int i = 0; i < Q; i++) {
            int question = Integer.parseInt(br.readLine());
            sb.append(list.get(question)).append("\n");
        }

        // 결과 출력
        System.out.println(sb);
    }
}
