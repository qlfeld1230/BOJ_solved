package boj;

import java.io.*;

public class BOJ13752 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 히스토그램은 데이터를 시각적으로 표현한 것이다. 막대로 구성되며 각 막대의 길이는 데이터 양의 크기를 나타낸다. 일부 데이터가 주어지면 히스토그램을 생성하시오.
         * 
         * 입력: 첫 번째 줄에는 테스트 케이스의 개수 n (1 ≤ n ≤ 100)이 주어진다. 다음 n 개의 줄에는 각 히스토그램의 크기 k (1 ≤ k ≤ 80)가 주어진다.
         * 
         * 출력: 각 테스트 케이스에 대해서 히스토그램의 크기 k와 동일한 수의 '='를 출력한다. '='사이에 공백은 존재하지 않는다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 테스트 케이스만큼 반복
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(br.readLine()); // 히스토그램의 크기 입력받기

            for(int j=0; j < A; j++){
                sb.append("="); // 히스토그램 생성
            }

            sb.append("\n"); // 줄바꿈
          
        }

        // 결과 출력
        System.out.print(sb);
    }
}
