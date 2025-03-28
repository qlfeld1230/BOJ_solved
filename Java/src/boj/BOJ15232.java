package boj;

import java.io.*;

public class BOJ15232 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: Read two integer numbers R and C from the standard input and then print R lines with C asterisks (*) each.
         * 
         * 입력: 첫 째줄에 R, 둘 째줄에 C가 주어진다. (C, R <= 20)
         * 
         * 출력: R과 C의 크기로 구성된 별을 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int R = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        // 테스트 케이스만큼 반복
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                sb.append("*");
            }
            if(i != R-1)
                sb.append("\n");
        }

        // 결과 출력
        System.out.println(sb);
    }
}
