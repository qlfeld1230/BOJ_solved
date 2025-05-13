package boj;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ13623 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * Everyone probably knows the game Zero or One (in some regions in Brazil also
         * known as Two or One),
         * used to determine a winner among three or more players.
         * 
         * Each player chooses a value between zero or one;
         * prompted by a command (usually one of the contestants announces “Zero or...
         * One!”),
         * all participants show the value chosen using a hand:
         * - if the value chosen is one, the contestant shows a hand with an extended
         * index finger;
         * - if the value chosen is zero, the contestant shows a hand with all fingers
         * closed.
         * 
         * The winner is the one who has chosen a value different from all others.
         * If there is no player with a value different from all others (e.g. all
         * players choose zero,
         * or some players choose zero and some players choose one), there is no winner.
         * 
         * Alice, Bob and Clara are great friends and play Zerinhos all the time.
         * Given the three values chosen by Alice, Bob and Clara, each value zero or
         * one,
         * write a program that determines if there is a winner, and in that case
         * determines who is the winner.
         * 
         * 입력:
         * The input contains a single line, with three integers A, B and C,
         * indicating respectively the values chosen by Alice, Beto and Clara.
         * 제한: A, B, C ∈ {0, 1}
         * 
         * 출력:
         * Your program must output a single line, containing a single character.
         * - If Alice is the winner the character must be ‘A’
         * - If Beto is the winner the character must be ‘B’
         * - If Clara is the winner the character must be ‘C’
         * - If there is no winner the character must be ‘*’ (asterisk)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A != B && A != C) {
            sb.append("A");
        } else if (B != A && B != C) {
            sb.append("B");
        } else if (C != A && C != B) {
            sb.append("C");
        } else {
            sb.append("*");
        }

        System.out.println(sb);
    }
}
