package boj;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ12595 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: You are hosting a party with G guests and notice that there is an odd number of guests! 
         * When planning the party you deliberately invited only couples and gave each couple a unique number C on their invitation. 
         * You would like to single out whoever came alone by asking all of the guests for their invitation numbers.
         * 
         * 입력: The first line of input gives the number of cases, N.
         * N test cases follow. For each test case there will be:
         * One line containing the value G the number of guests.
         * One line containing a space-separated list of G integers. Each integer C indicates the invitation code of a guest.
         * 
         * 출력: For each test case, output one line containing "Case #x: " followed by the number C of the guest who is alone.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        
        // 테스트 케이스만큼 반복
        for (int i = 0; i < N; i++) {
            int G =Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int result = 0;
            
            for(int j=0; j<G; j++) {
                int C = Integer.parseInt(st.nextToken());
                result ^= C; 
            }

            sb.append("Case #").append(i + 1).append(": ").append(result).append("\n");
        }

        // 결과 출력
        System.out.println(sb);
    }
}
