package boj;

import java.io.*;
import java.util.*;

public class BOJ1037 {
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄: 약수의 개수
        int testCase = Integer.parseInt(br.readLine());

        // 두 번째 줄: 약수 리스트
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 정렬
        Arrays.sort(numbers);

        // N 계산: 가장 작은 약수 * 가장 큰 약수
        int N = numbers[0] * numbers[testCase - 1];

        // 결과 출력
        System.out.println(N);
    }
}
