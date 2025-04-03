package boj;

import java.io.*;
import java.util.*;

public class BOJ20499 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: KDA를 입력받아 진짜와 가짜를 구분하라.
         * 
         * 입력: 첫째줄에 /로 구분된 K, D, A가 주어진다.
         * 
         * 출력: 진짜라면 gosu, 가짜라면 hasu를 출력하라.
         * 가짜라면 K + A < D 또는 D = 0이다. 그렇지 않으면 진짜이다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), "/");
        int K = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        if(D == 0 || K + A < D) {
            sb.append("hasu");
        } else {
            sb.append("gosu");
        }

        System.out.println(sb);
    }
}
