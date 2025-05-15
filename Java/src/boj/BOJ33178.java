package boj;

import java.io.*;

public class BOJ33178 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * The Department of Computer Engineering at Sharif University of Technology has recently initiated
         * a professional education program known as Micromasters.
         * 
         * This program offers courses to empower students with specialized knowledge and skills in various domains
         * of computer science and engineering.
         * 
         * As an incentive to promote the program, the department introduced a referral system:
         * each referred student gives the referrer a 10% discount on their own course registrations.
         * 
         * Mina is a student who refers many others. With each referral, her discount grows.
         * The question is: given the number of students Mina referred, how many courses can she enroll in for free?
         * 
         * 입력:
         * A single line containing a single integer n (0 ≤ n ≤ 1000),
         * representing the number of students Mina referred.
         * 
         * 출력:
         * Print a single line, containing the number of courses Mina can enroll in for free using the discounts.
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int result = N / 10;
       
        // 결과 출력
        sb.append(result);
        System.out.print(sb);
    }
}
