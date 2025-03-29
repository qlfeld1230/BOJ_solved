package boj;

import java.io.*;

public class BOJ31430 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: A, B, C가 주어지면 두 줄에 걸쳐 숫자의 A + B - C의 결과와 문자열의 A + B - C를 출력.
         * 
         * 입력: A  B C가 주어진다. (1 <= A, B, C <= 1000)
         * 
         * 출력: 첫 째줄에 숫자 A + B - C, 둘 째줄에 문자열 A + B - C를 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        int intResult = 0;
        // 숫자 A + B - C 계산

        intResult = Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C);

        // 문자열 A + B - C 계산
        int stringResult = Integer.parseInt(A+B) - Integer.parseInt(C);

        sb.append(intResult).append("\n");
        sb.append(stringResult).append("\n");

        // 결과 출력;
        System.out.println(sb);
    }
}
