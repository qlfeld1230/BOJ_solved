package boj;

import java.io.*;
import java.util.*;

public class BOJ13985 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * You are grading an arithmetic quiz.
         * The quiz presents an equation in the form of: a + b = c
         * You need to determine whether the student got the answer correct.
         * 
         * 입력:
         * The input consists of a single string in the format: "a + b = c"
         * Each of a, b, and c are single-digit positive integers.
         * The input line will be exactly 9 characters, with one space between each number and operator.
         * 
         * 출력:
         * Print "YES" if the sum is correct; otherwise, print "NO".
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " + =");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        if(a + b == c) {
            sb.append("YES");
        } else {
            sb.append("NO");
        }

        // 결과 출력
        System.out.println(sb);
    }
}
