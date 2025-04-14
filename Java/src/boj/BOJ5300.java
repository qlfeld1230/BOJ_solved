package boj;

import java.io.*;

public class BOJ5300 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: Captain Jack decides to to take over a rival’s ship. He needs to send his henchmen over on rowboats that can hold 6 pirates each. 
         * You will help him count out pirates in groups of 6. The last rowboat may have fewer than 6 pirates. To make your task easier each pirate has been assigned a number from 1 to N.
         * 
         * 입력: The input will be N, the number of pirates you need to send over on rowboats.
         * 
         * 출력: The output will be the number of each pirate separated by spaces, with the word ”Go!” after every 6th pirate, and after the last pirate.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

       for (int t = 1; t <= N; t++) {
           sb.append(t).append(" ");
          
           if(t % 6 == 0 || t == N) {
            sb.append("Go!").append(" ");
           }
        }

        // 결과 출력
        System.out.println(sb);
    }
}
