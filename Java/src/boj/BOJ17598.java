package boj;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ17598 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * King Dragon, ruler of the Animal Kingdom, has passed away.
         * The government decided to elect a new king between two candidates: Tiger and Lion.
         * 
         * There are nine voters: Armadillo, Buffalo, Cat, Dog, Elephant, Fox, Goat, Hippo, and Zebra.
         * Each of them will cast a vote anonymously.
         * 
         * The candidate who receives more than half of the votes (i.e., at least 5) will become the next king.
         * 
         * 입력:
         * The input has exactly nine lines.
         * Each line contains either "Tiger" or "Lion", representing one anonymous vote.
         * 
         * 출력:
         * Output one line containing the next king’s name (either "Tiger" or "Lion").
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int lion = 0;
        int tiger = 0;

        // 테스트 케이스만큼 반복
        for (int i = 0; i < 9; i++) {
            String vote = br.readLine();
            
            if (vote.equals("Lion")) {
                lion++;
            } else if (vote.equals("Tiger")) {
                tiger++;
            }
        }

        sb.append(lion > tiger ? "Lion" : "Tiger");
        System.out.print(sb);
    }
}
