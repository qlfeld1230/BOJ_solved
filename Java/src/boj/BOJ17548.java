package boj;

import java.io.*;

public class BOJ17548 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * Now that Snapchat and Slingshot are soooo 2018,
         * the teenagers of the world have all switched to the new hot app called BAPC
         * (Bidirectional and Private Communication).
         * This app has some stricter social rules than previous iterations.
         * 
         * For example, if someone says goodbye using "Later!", the other person is
         * expected to reply with "Alligator!".
         * 
         * You can not keep track of all these social conventions and decide to automate
         * any necessary responses,
         * starting with the most important one: the greetings.
         * 
         * When your conversational partner opens with "he...ey", you have to respond
         * with "hee...eey" as well,
         * but using twice as many 'e's!
         * 
         * Given a string of the form "he...ey" of length at most 1000,
         * print the greeting you will respond with, containing twice as many 'e's.
         * 
         * 입력:
         * The input consists of one line containing a single string s as specified,
         * of length at least 3 and at most 1000.
         * 
         * 출력:
         * Output the required response.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += "ee";
            } else if (str.charAt(i) == 'y') {
                result += "y";
            } else {
                result += str.charAt(i);
            }
        }
        // 결과 출력
        sb.append(result);
        System.out.print(sb);
    }
}
