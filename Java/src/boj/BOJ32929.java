package boj;

import java.io.*;

public class BOJ32929 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * UOS 문자열이란 UOSUOSUOSU... 와 같이 UOS가 무한히 반복되어 나타나는 문자열이다.
         * 양의 정수 x가 주어질 때 UOS 문자열의 x번째 문자를 구하여라.
         * 
         * 입력:
         * 첫 번째 줄에 x가 주어진다. (1 ≤ x ≤ 10⁹)
         * 
         * 출력:
         * UOS 문자열의 x번째 문자를 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());

        if (x % 3 == 1) {
            sb.append("U");
        } else if (x % 3 == 2) {
            sb.append("O");
        } else {
            sb.append("S");
        }

        // 결과 출력
        System.out.println(sb);
    }
}
