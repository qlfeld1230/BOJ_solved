package boj;

import java.io.*;

public class BOJ1233 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * 지민이는 주사위 던지기 게임을 좋아하여 어느 날 옆에 있는 동호를 설득하여 주사위 던지기 게임을 하자고 하였다.
         * 총 3개의 주사위가 있다. 그리고 이 주사위는 각각 S1(2 ≤ S1 ≤ 20), S2(2 ≤ S2 ≤ 20), S3(2 ≤ S3 ≤
         * 40)개의 면이 있다.
         * 
         * 문제는 세 개의 주사위를 동시에 던졌을 때 가장 높은 빈도로 나오는 세 주사위의 합을 구하는 것이다.
         * 
         * 입력:
         * 입력 파일의 첫째 줄에 정수 S1, S2, S3가 주어진다.
         * 
         * 출력:
         * 출력 파일의 첫째 줄에 가장 높은 빈도로 나오는 세 주사위 합을 구하는 것이다.
         * 단 답이 여러개라면 가장 합이 작은 것을 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input[] = br.readLine().split(" ");
        int S1 = Integer.parseInt(input[0]);
        int S2 = Integer.parseInt(input[1]);
        int S3 = Integer.parseInt(input[2]);

        // 주사위의 합을 저장할 배열
        int[] sumCount = new int[S1 + S2 + S3 + 1];

        // 주사위의 면을 순회하며 합의 빈도수를 계산
        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    int sum = i + j + k;
                    sumCount[sum]++;
                }
            }
        }

        // 가장 높은 빈도수를 찾기
        int max = 0;
        int result = 0;

        for (int i = 0; i < sumCount.length; i++) {
            if (sumCount[i] > max) {
                max = sumCount[i];
                result = i;
            }
        }

        sb.append(sumCount[result]);

        // 결과 출력
        System.out.print(sb);
    }
}
