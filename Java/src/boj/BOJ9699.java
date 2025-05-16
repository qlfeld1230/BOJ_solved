package boj;

import java.io.*;
import java.util.*;

public class BOJ9699 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제:
         * Several sacks of rice need to be transported to five Orphanage Houses.
         * The heaviest sack will go to Orphanage House Al-Ameen because it has the most number of orphanges.
         * The lightest will be sent to Orphanage House Mutiara due to the small number of children staying there.
         * 
         * Given a row of 5 rice sacks, decide which sack (weight) goes to Al-Ameen.
         * 
         * 입력:
         * The first line is an integer that represents the number of cases.
         * The following lines each have 5 integers indicating the weights of 5 rice sacks,
         * separated by a space. No sack will have a weight of more than 100 units.
         * 
         * 출력:
         * For each test case, output a line in the format:
         * Case #x: y
         * - where x is the test case number (starting from 1)
         * - and y is the weight of the rice sack that will go to Al-Ameen (i.e., the heaviest one).
         */



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 테스트 케이스만큼 반복
        for (int i = 0; i < N; i++) {
            // 초기 상태 설정
            int max = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 문제 해결
            for(int j=0; j<5; j++){
                int weight = Integer.parseInt(st.nextToken());
                
                if(weight > max){
                    max = weight;
                }
            }

            sb.append("Case #").append(i + 1).append(": ").append(max).append("\n");
        }

        // 결과 출력
        System.out.print(sb);
    }
}
