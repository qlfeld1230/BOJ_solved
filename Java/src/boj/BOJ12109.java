package boj;

import java.io.*;
import java.util.*;

public class BOJ12109 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * How do we evaluate the success of a scientist?
         * By the number of published papers or by their impact – more precisely, the
         * number of citations?
         * Both elements matter.
         * 
         * We say that a scientific paper has a citation score C if other scientists
         * cited the paper in question
         * in their paper (referred to it) a total of C times.
         * 
         * One of the possible metrics of the success of scientists is their h-index
         * that takes into account both the amount of papers and their citation scores.
         * 
         * A scientist’s h-index is defined as the largest number H with the following
         * properties:
         * the scientist can choose H papers such that their citation score is at least
         * H.
         * 
         * For example, if a scientist wrote 10 papers such that each of them has been
         * cited 10 or more times,
         * their h-index is (at least) 10.
         * 
         * Write a programme that inputs the citation scores of all papers of a given
         * scientist
         * and outputs their h-index.
         * 
         * 입력:
         * The first line of input contains the positive integer N (1 ≤ N ≤ 500,000),
         * the number of papers of a given scientist.
         * 
         * The following line contains N non-negative integers from the interval [0,
         * 1,000,000],
         * the citation scores of the respective papers.
         * 
         * 출력:
         * The first and only line of output must contain the required h-index.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        String[] input = br.readLine().split(" ");
        int[] papers = new int[N];
        for (int i = 0; i < N; i++) {
            papers[i] = Integer.parseInt(input[i]);
        }

        // 우선 오름차순으로 정렬
        Arrays.sort(papers);

        // 버블정렬로 내림차순으로 변환
        for (int i = 0; i < N / 2; i++) {
            int temp = papers[i];
            papers[i] = papers[N - 1 - i];
            papers[N - 1 - i] = temp;
        }

        // 테스트 케이스만큼 반복
        for (int t = 0; t < N; t++) {
            if (papers[t] >= t + 1) {
                result = t + 1;
            } else {
                break;
            }

        }

        // 결과 출력
        sb.append(result);
        System.out.print(sb);
    }
}
