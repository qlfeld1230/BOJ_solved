package boj;

import java.io.*;
import java.util.*;

public class BOJ18110 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * solved.ac는 문제의 난이도를 결정하는 사이트이다.
         * 
         * 어떤 문제의 난이도는 그 문제를 푼 사람들이 제출한 난이도 의견을 바탕으로 결정한다.
         * 난이도 의견은 그 사용자가 생각한 난이도를 의미하는 정수 하나로 주어진다.
         * solved.ac가 사용자들의 의견을 바탕으로 난이도를 결정하는 방식은 다음과 같다.
         * 
         * • 아직 아무 의견이 없다면 문제의 난이도는 0으로 결정한다.
         * • 의견의 수가 충분히 많다면, 문제에 받은 모든 난이도 의견의 30% 절사평균으로 결정한다.
         * 
         * 절사평균이란 극단적인 값들에 평균을 왜곡하는 것을 막기 위해 가장 큰 값들과 가장 작은 값들을 제외하고 평균을 내는 것을 말한다.
         * 30% 절사평균의 경우 위에서 15%, 아래에서 15%를 각각 제외하고 평균을 계산한다.
         * 만약 20명이 투표했다면,
         * 가장 높은 난이도에 투표한 3명과 가장 낮은 난이도에 투표한 3명의 투표는 평균 계산에 반영하지 않는다는 것이다.
         * 
         * 제외되는 사람의 수는 위, 아래에서 각각 반올림한다.
         * 25명이 투표한 경우,
         * 아래에서 각각 3.75명을 제외해야 하는데,
         * 이 경우 반올림해 4명씩을 제외한다.
         * 
         * 마지막으로, 계산한 평균도 정수로 반올림된다.
         * 절사평균이 16.7이었다면 최종 난이도는 17이 된다.
         * 
         * 사용자들이 어떤 문제에 제출한 난이도 의견 목록이 주어질 때,
         * solved.ac가 결정한 문제의 난이도를 계산하는 프로그램을 작성하시오.
         * 
         * 입력:
         * 첫 번째 줄에 난이도 의견의 개수 n이 주어진다.
         * (0 ≤ n ≤ 3 × 10⁵)
         * 둘째 줄부터 n개의 줄에 걸쳐 n개의 정수가 사용자들이 제출한 난이도 의견 n개가 한 줄에 하나씩 주어진다.
         * 모든 난이도 의견은 1 이상 30 이하이다.
         * 
         * 출력:
         * solved.ac가 계산한 문제의 난이도를 출력한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        // 절사할 개수
        int trimmedCount = (int) Math.round(N * 0.15); 
        
        // 의견의 개수 입력받기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 평균을 계산하기 위한 변수
        int sum = 0;

        if(trimmedCount > 0) {
            // 정렬
            Arrays.sort(arr);
            // 절사할 개수만큼 제외한 나머지의 합을 구함
            for (int i = trimmedCount; i < N - trimmedCount; i++) {
                sum += arr[i];
            }
        }
        else {
            // 절사할 개수가 0이면 모든 의견을 더함
            for (int i = 0; i < N; i++) {
                sum += arr[i];
            }
        }
        
        int result = Math.round(sum / (float) (N - 2 * trimmedCount)); // 평균 계산

        sb.append(result);
        System.out.println(sb);
    }
}
