package boj;

import java.io.*;
import java.util.*;

public class BOJ30236 {
    public void solve() throws IOException {
        // 📝 문제 설명
        /*
         * 문제: 수열이 주어진다. 다음 조건을 만족하는 수열을 좋은 수열이라고 한다. 
         * 수열 b는 양의 정수이다. 
         * 수열 b는 a와 같지않다.
         * b는 오름차순으로 정렬되어있다.
         * 좋은 수열 b에 대하여 bn의 최소값을 구하라.
         * 
         * 입력: 첫 째줄에 테스트케이스의 개수 t가 주어진다. (1 ≤ t ≤ 1000)
         * 각각의 테스트케이스 첫째 줄에 수열의 길이 n이 주어진다. (1 ≤ n ≤ 100)
         * 두 번째 줄에 n개의 정수 a가 공백으로 구분되어 주어진다.
         * 
         * 출력: 각 테스트 케이스마다 정답을 출력한다.
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        // 테스트 케이스만큼 반복
       while(t-- > 0) {
        int n = Integer.parseInt(br.readLine());    
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = 1;
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            while(count == a[i]) count++;
            b[i] = count++;
        }

        System.out.println(b[n-1]);
       }
    }
}
